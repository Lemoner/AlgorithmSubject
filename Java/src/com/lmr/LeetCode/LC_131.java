package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC_131 {
	public List<List<String>> partition(String s) {
		
		List<List<String>> result=new ArrayList<>();
		List<String> list=new ArrayList<>();
		
		DFS(result,list,s);
		
		return result;
		
	}

	private void DFS(List<List<String>> result, List<String> list, String s) {
		
		if(s.length()==0){
			result.add(new ArrayList<>(list));
			return ;
		}
		
		for(int i=1;i<=s.length();i++){
			if(IsPart(s.substring(0, i))){
				list.add(s.substring(0, i));
				DFS(result, list, s.substring(i));
				list.remove(list.size()-1);
			}
		}
		
	}
	
	public boolean IsPart(String s){
		
		int i,j;
		i=0;
		j=s.length()-1;
		
		while(i<j){
			if(s.charAt(i)==s.charAt(j)){
				i++;
				j--;
			}
			else{
				return false;
			}
		}
		
		return true;
		
	}
	
}
