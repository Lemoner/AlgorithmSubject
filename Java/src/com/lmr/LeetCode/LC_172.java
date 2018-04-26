package com.lmr.LeetCode;

public class LC_172 {
	public int trailingZeroes(int n) {
		int count=0;
		long temp=n;
		
		for(long i=5;i<=temp;i=i*5){
			count+=n/i;
		}
		
		long x=1;
		for(int i=1;i<20;i++){
			x=x*i;
			System.out.println(x);
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		LC_172 lc=new LC_172();
		
		int n=1808548329;
		
		System.out.println(lc.trailingZeroes(n));
		
	}
}
