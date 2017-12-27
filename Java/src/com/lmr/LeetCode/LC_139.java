package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC_139 {

	public boolean wordBreak(String s, List<String> wordDict) {
		
		int dp[]=new int[s.length()];
		
		for(int i=0;i<s.length();i++){
			dp[i]=wordDict.contains(s.substring(0, i+1))?1:0;
			if(dp[i]!=1){
				for(int k=0;k<i;k++){
					if(dp[k]==1&&wordDict.contains(s.substring(k+1, i+1))){
						dp[i]=1;
						break;
					}
				}
			}
		}
		
		return dp[s.length()-1]==1?true:false;

	}
	
	public static void main(String[] args) {
		
		LC_139 lc=new LC_139();
		
		String s="leetcode";
		
		List<String> wordDict=new ArrayList<>();
		wordDict.add("le");
		wordDict.add("leet");
		wordDict.add("etc");
		wordDict.add("code");
	
		System.out.println(lc.wordBreak(s, wordDict));
		
	}
	
}
