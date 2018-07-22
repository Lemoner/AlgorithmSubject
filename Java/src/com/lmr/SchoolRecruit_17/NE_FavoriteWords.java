package com.lmr.SchoolRecruit_17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class NE_FavoriteWords {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		char[] s=scanner.nextLine().toCharArray();
		Map<Integer, List<Integer>> map=new HashMap<>();
		List<Integer> x,y;
		
		if(map.get(s[0]-'A')==null){
			map.put(s[0]-'A', new ArrayList<>());
		}
		map.get(s[0]-'A').add(0);
		for(int i=1;i<s.length;i++){
			if(map.get(s[i]-'A')==null){
				map.put(s[i]-'A', new ArrayList<>());
			}
			map.get(s[i]-'A').add(i);
			if(s[i]==s[i-1]){
				System.out.println("Dislikes");
				return ;
			}
		}
		
		for(int i=0;i<26;i++){
			x=map.get(i);
			if(x!=null){
				for(int j=0;j<26;j++){
					y=map.get(j);
					if(y!=null){
						if(!Judge(x,y)){
							System.out.println("Dislikes");
							return ;
						}
					}
				}
			}
		}
		
		System.out.println("Likes");
		
	}

	private static boolean Judge(List<Integer> x, List<Integer> y) {
		
		int count,t,xi,yi,tt;
		count=0;
		xi=0;
		yi=0;
		t=(x.get(xi)<y.get(yi))?1:2;
		
		while(xi<x.size()&&yi<y.size()){
			if(x.get(xi)<y.get(yi)){
				xi++;
				tt=1;
			}
			else{
				yi++;
				tt=2;
			}
			if(t!=tt){
				count++;
				t=tt;
			}
			if(count>=3){
				return false;
			}
		}
		
		if(xi<x.size()&&t==2){
			count++;
		}
		if(yi<y.size()&&t==1){
			count++;
		}
		if(count>=3){
			return false;
		}
		
		return true;
	}
	
}
