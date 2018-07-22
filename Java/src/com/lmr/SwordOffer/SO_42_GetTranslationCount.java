package com.lmr.SwordOffer;

public class SO_42_GetTranslationCount {
	
	public static void main(String[] args) {
		
		SO_42_GetTranslationCount so=new SO_42_GetTranslationCount();
		int n=0;
		System.out.println(so.GetTranslationCount(n));
		
	}

	public int GetTranslationCount(int n){
		
		if(n<10){
			return 1;
		}
		
		char[] s=String.valueOf(n).toCharArray();
		int[] dp=new int[s.length];
		int[] g=new int[s.length];
		int t;
		
		for(int i=1;i<s.length;i++){
			t=(s[i-1]-'0')*10+(s[i]-'0');
			if(t>=10&&t<=25){
				g[i]=1;
			}
			else{
				g[i]=0;
			}
		}
		
		dp[0]=1;
		dp[1]=1+g[1];
		for(int i=2;i<s.length;i++){
			dp[i]=dp[i-1]+g[i]*dp[i-2];
		}
		
		return dp[s.length-1];
		
	}
	
}
