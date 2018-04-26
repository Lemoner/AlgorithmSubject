package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC_118 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result=new ArrayList<>();
		
		for(int i=0;i<numRows;i++){
			List<Integer> list=new ArrayList<>();
			list.add(1);
			result.add(list);
		}
		
		for(int i=1;i<numRows;i++){
			result.get(i).add(1);
			for(int j=i+1;j<numRows;j++){
				result.get(j).add(result.get(j-1).get(i-1)+result.get(j-1).get(i));
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		LC_118 lc=new LC_118();
		
		int numRows=5;
		
		for(List<Integer> list:lc.generate(numRows)){
			System.out.println(list.toString());
		}
		
	}
}
