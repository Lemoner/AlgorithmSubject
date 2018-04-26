package com.lmr.LeetCode;

public class LC_204 {
	public int countPrimes(int n) {
		
		int count,flag;
		int[] a=new int[1000];
		
		count=0;
		
		for(int i=2;i<n;i++){
			flag=1;
			for(int j=0;j<count&&a[j]<=Math.sqrt(i);j++){
				if(i%a[j]==0){
					flag=0;
					break;
				}
			}
			if(flag==1){
				a[count++]=i;
			}
		}
		
		return count;
		
	}
	
	public int countPrimes1(int n) {
		
		int count;
		boolean[] flag=new boolean[n];
		
		for(int i=2;i<n;i++){
			if(i*i>n)  break;
			if(!flag[i]){
				for(int j=2;i*j<n;j++){
					flag[i*j]=true;
				}
			}
		}
		
		count=0;
		for(int i=2;i<n;i++){
			if(!flag[i]){
				count++;
			}
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		
		LC_204 lc=new LC_204();
		
		int n=6;
		
		System.out.println(lc.countPrimes1(n));
		
	}
}
