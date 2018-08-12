package com.lmr.NK;

import java.util.Scanner;

public class WY_Main_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n;
		n=in.nextInt();
		
		int[] a=new int[n];
		int[] arr=new int[n];
		int sum=0;
		
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
			sum+=a[i];
			arr[i]=sum;
		}
		
		int m,q;
		m=in.nextInt();
		
		for(int i=0;i<m;i++){
			q=in.nextInt();
			System.out.println(fun(q,arr));
		}

	}

	private static int fun(int q, int[] arr) {
		
		int mid,left,right;
		
		left=0;
		right=arr.length-1;
		
		while(left<right){
			mid=(left+right)/2;
			if(arr[mid]==q){
				return mid+1;
			}
			else if(arr[mid]<q){
				left=mid+1;
			}
			else{
				right=mid;
			}
		}
		return left+1;
	}

}
