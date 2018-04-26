package com.lmr.LeetCode;

import java.util.Arrays;

public class LC_91 {
	
	private int count;
	public int numDecodings(String s) {
		
		if(s==null||s.equals("")){
			return 0;
		}
		
		count=0;
		
		DFS(s,0);
		
		return count;
	}
	
	private void DFS(String s, int index) {
		if(index==s.length()){
			count++;
			return;
		}
		if(s.charAt(index)!='0'){
			DFS(s, index+1);
			if(index+2<=s.length()){
				if((s.charAt(index)-'0')*10+(s.charAt(index+1)-'0')<=26){
					DFS(s, index+2);
				}
			}
		}
		
	}
	
	public int numDecodings1(String s) {
		
		if(s==null||s.equals("")||s.startsWith("0")){
			return 0;
		}
		
		int[] dp=new int[s.length()+1];
		
		dp[0]=1;
		dp[1]=1;
		
		for(int i=2;i<=s.length();i++){
			if(s.charAt(i-1)!='0'){
				dp[i]+=dp[i-1];
			}
			if(s.charAt(i-2)!='0'&&(s.charAt(i-2)-'0')*10+(s.charAt(i-1)-'0')<=26){
				dp[i]+=dp[i-2];
			}
		}

		return dp[s.length()];
	}
	
	public static void main(String[] args) {
		
		LC_91 lc=new LC_91();
		
		String s="1787897759966261825913315262377298132516969578441236833255596967132573482281598412163216914566534565";
//		String s="121";
		
		System.out.println(lc.numDecodings1(s));
		
	}
}
