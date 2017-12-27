package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC_39 {

	private List<List<Integer>> result=new ArrayList<>();
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		
		List<Integer> cur=new ArrayList<>();
		
		DFS(cur, candidates, target, candidates.length-1);
		
		return result;
		
	}
	
	public void DFS(List<Integer> cur, int[] candidates, int target, int index){
		
		if(target==0){
			result.add(new ArrayList<>(cur));
			return ;
		}
		else if(target<0){
			return ;
		}
		else{
			for(int i=index;i>=0;i--){
				if(target-candidates[i]>=0){
					cur.add(candidates[i]);
					DFS(cur, candidates, target-candidates[i], i);
					cur.remove(cur.size()-1);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		LC_39 lc=new LC_39();
		
		int[] candidates={2, 3, 6, 7};
		int target=7;
		
		System.out.println(lc.combinationSum(candidates, target).toString());
		
	}

}
