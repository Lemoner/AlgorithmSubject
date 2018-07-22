package com.lmr.common;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionSubset {
	
	public static void main(String[] args) {
		
		CollectionSubset cs=new CollectionSubset();
		int[] num=new int[]{1,2,1,3};
		
		System.out.println(cs.Subset(num).toString());
		
	}

	public ArrayList<ArrayList<Integer>> Subset(int[] num) {
		
		ArrayList<ArrayList<Integer>> result=new ArrayList<>();
		ArrayList<Integer> list=new ArrayList<>();
		
		Arrays.sort(num);
		DFS(0,num,list,result);
		
		return result;
		
	}

	private void DFS(int index, int[] c, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> result) {
		
		result.add(new ArrayList<>(list));
		
		for(int i=index;i<c.length;i++){
			if(i>index&&c[i-1]==c[i]){
				continue;
			}
			list.add(c[i]);
			DFS(i+1, c, list, result);
			list.remove(list.size()-1);
		}
		
	}
	
}
