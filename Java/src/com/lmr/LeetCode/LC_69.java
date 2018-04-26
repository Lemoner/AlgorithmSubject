package com.lmr.LeetCode;

public class LC_69 {
	public int mySqrt(int x) {
		
		long right,mid,left,t;
		
		right=1;
		left=(int) Math.ceil(x*1.0/2);
		
		while(left-right>1){
			mid=(right+left)/2;
			t=mid*mid;
			if(t==x){
				return (int) mid;
			}
			else if(t<x){
				right=mid;
			}
			else{
				left=mid;
			}
		}
		
		if(left*left<=x){
			return (int) left;
		}
		return (int) right;
	}
	
	public static void main(String[] args) {
		
		LC_69 lc=new LC_69();
		
		int x=2147395599;
		
		System.out.println(lc.mySqrt(x));
		
	}
}
