package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class NE_SequenceRestore {

	static int n,k,count;
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int c;
		n=scanner.nextInt();
		k=scanner.nextInt();
		int[] a=new int[n];
		int[] b=new int[n+1];
		c=0;
		for(int i=0;i<n;i++){
			a[i]=scanner.nextInt();
			if(a[i]==0){
				c++;
			}
			else{
				b[a[i]]=1;
			}
		}
		int[] d=new int[c];
		for(int i=1,j=0;i<=n;i++){
			if(b[i]!=1){
				d[j++]=i;
			}
		}
		
		count=0;
		DFS(a,d,0,c);
		
		System.out.println(count);
		
	}

	private static void DFS(int[] a, int[] d, int index, int c) {
		
		if(index==c-1){
			int[] t=new int[n];
			for(int i=0,j=0;i<n;i++){
				if(a[i]==0){
					t[i]=d[j++];
				}
				else{
					t[i]=a[i];
				}
			}
			if(Sum(t)){
				count++;
			}
		}
		else{
			for(int i=index;i<c;i++){
				Swap(d,index,i);
				DFS(a, d, index+1, c);
				Swap(d,index,i);
			}
		}
		
	}

	private static boolean Sum(int[] t) {
		
		int c=0;
		for(int i=0;i<t.length;i++){
			for(int j=i+1;j<t.length;j++){
				if(t[i]<t[j]){
					c++;
				}
				if(c>k){
					return false;
				}
			}
		}
		
		if(c==k){
			return true;
		}
		
		return false;
		
	}

	private static void Swap(int[] d, int index, int i) {
		int temp;
		temp=d[index];
		d[index]=d[i];
		d[i]=temp;
	}
	
}
