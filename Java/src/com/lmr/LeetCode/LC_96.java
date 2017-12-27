package com.lmr.LeetCode;

public class LC_96 {
	
	public int numTrees(int n) {
		
		if(n==0){
			return 0;
		}
		
		int a[]=new int[n+1];
		
		a[0]=1;
		a[1]=1;
		
		for(int i=2;i<=n;i++){
			a[i]=0;
			for(int j=0;j<i;j++){
				a[i]+=a[j]*a[i-j-1];
			}
		}
		
		return a[n];

	}
	
	public static void main(String[] args) {
		
		LC_96 test=new LC_96();
		
		System.out.println(test.numTrees(2));
		
	}

}
