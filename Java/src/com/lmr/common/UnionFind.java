package com.lmr.common;

public class UnionFind {

	public int QuickFind(int m,int[][] n){
		
		int count,q,p;
		int a[]=new int[m];
		
		count=m;
		
		for(int i=0;i<m;i++){
			a[i]=i;
		}
		
		for(int i=0;i<n.length;i++){
			q=FindRoot(a,n[i][0]);
			p=FindRoot(a,n[i][1]);
			if(q!=p){
				a[p]=q;
				count--;
			}
		}
		
		return count;
		
	}

	private int FindRoot(int[] a, int t) {
		
		while(a[t]!=t){
			t=a[t];
		}
		
		return t;
	}
	
	public static void main(String[] args) {
		
		UnionFind test=new UnionFind();
		
		int m=5;
		int n[][]={{0,1},{2,3},{1,4},{2,4}};
		
		System.out.println(test.QuickFind(m, n));
		
	}
	
}
