package com.lmr.SchoolRecruit_17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class XM_TreeHeight {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n,k,v;
		
		n=scanner.nextInt();
		Map<Integer, List<Integer>> map=new HashMap<>();
		
		for(int i=0;i<n-1;i++){
			k=scanner.nextInt();
			v=scanner.nextInt();
			if(!map.containsKey(k)){
				List<Integer> list=new ArrayList<>();
				list.add(v);
				map.put(k, list);
			}
			else{
				if(map.get(k).size()<2){
					map.get(k).add(v);
				}
			}
		}
		
		System.out.println(DFS(map,0));
		
	}

	private static int DFS(Map<Integer, List<Integer>> map, int key) {
		if(!map.containsKey(key)){
			return 1;
		}
		
		int h=0;
		for(Integer k:map.get(key)){
			h=Math.max(h, DFS(map, k));
		}
		
		return h+1;
	}
	
}
