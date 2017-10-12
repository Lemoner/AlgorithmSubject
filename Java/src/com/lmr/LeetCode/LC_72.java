package com.lmr.LeetCode;

public class LC_72 {

	public int minDistance(String word1, String word2) {
		
		int len1,len2;
		len1=word1.length();
		len2=word2.length();
		
		int[][] D=new int[len1+1][len2+1];
		
		for(int i=0;i<=len1;i++){
			D[i][0]=i;
		}
		for(int i=0;i<=len2;i++){
			D[0][i]=i;
		}
		
		for(int i=1;i<=len1;i++){
			for(int j=1;j<=len2;j++){
				D[i][j]=Math.min(D[i-1][j]+1, Math.min(D[i][j-1]+1, D[i-1][j-1]+(word1.charAt(i-1)==word2.charAt(j-1)?0:1)));
			}
		}
		
		return D[len1][len2];

	}

	public static void main(String[] args) {
		
		LC_72 lc=new LC_72();
		
		String word1,word2;
		
		word1="acacd";
		word2="acd";
		
		System.out.println(lc.minDistance(word1, word2));
		
	}
	
}
