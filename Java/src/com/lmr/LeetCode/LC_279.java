package com.lmr.LeetCode;

import java.util.Arrays;

public class LC_279 {

//	public int numSquares(int n) {
//		
//		int sqrt,sqrts,count;
//		sqrt=(int) Math.sqrt(n);
//		
//		count=0;
//		while(n>0){
//			sqrts=sqrt*sqrt;
//			while(n>=sqrts){
//				n-=sqrts;
//				count++;
//			}
//			sqrt--;
//		}
//		
//		return count;
//		
//	}
	
	private int mincount;
	
	public int numSquares(int n) {

		int sqrt;
		
		sqrt = (int) Math.sqrt(n);
		mincount=n;
		
		DFSSquares(n,sqrt,0);
		
		return mincount;
		
	}
	
	private void DFSSquares(int n, int sqrt, int count) {
		
		if(n==0){
			if(count<mincount){
				mincount=count;
			}
			return ;
		}
		
		if(sqrt==1){
			DFSSquares(0, sqrt-1, count+n);
			return ;
		}
		
		int sqrts=sqrt*sqrt;
		int sum=0;
		for(int i=0;i<=n/sqrts;i++){
			if(count+i<mincount){
				DFSSquares(n-sum, sqrt-1, count+i);
				sum+=sqrts;
			}
			else{
				break;
			}
		}
		
	}
	
	public int numSquares1(int n) {

		int nums[]=new int[n+1];
		
		for(int i=1;i<=n;i++){
			nums[i]=Integer.MAX_VALUE;
		}
		
		for(int i=1;i*i<=n;i++){
			nums[i*i]=1;
		}
		
		for(int a=1;a<=n;a++){
			for(int b=0;a+b*b<=n;b++){
				nums[a+b*b]=Math.min(nums[a+b*b], nums[a]+1);
			}
		}
		
		return nums[n];
		
	}

	public static void main(String[] args) {
		
		LC_279 lc=new LC_279();
		
		int n=7138;
		
		System.out.println(lc.numSquares1(n));
		
	}

}
