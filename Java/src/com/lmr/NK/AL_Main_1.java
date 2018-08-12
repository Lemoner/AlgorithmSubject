package com.lmr.NK;

import java.util.Scanner;

public class AL_Main_1 {
	
	public static int min=Integer.MAX_VALUE;

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n;
		n=scanner.nextInt();
		scanner.nextLine();
		int[] x=new int[n];
		int[] y=new int[n];
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++){
			String[] str=scanner.nextLine().split(",");
			x[i]=Integer.parseInt(str[0]);
			y[i]=Integer.parseInt(str[1]);
			arr[i]=i;
		}
		
		int[][] len=new int[n+1][n];
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				len[i][j]=Math.abs(x[i]-x[j])+Math.abs(y[i]-y[j]);
				len[j][i]=len[i][j];
			}
		}
		for(int i=0;i<n;i++){
			len[n][i]=x[i]+y[i];
		}
		
		
		DFS(arr,len,0);
		
		System.out.println(min);
	}

	private static void DFS(int[] arr, int[][] len, int index) {
		if(index==arr.length){
			int sum=0;
			for(int i=0;i<arr.length-1;i++){
				sum+=len[arr[i]][arr[i+1]];
			}
			sum+=len[arr.length][arr[0]]+len[arr.length][arr[arr.length-1]];
			if(sum<min){
				min=sum;
			}
		}
		else{
			for(int i=index;i<arr.length;i++){
				Swap(arr,i,index);
				DFS(arr, len, index+1);
				Swap(arr,i,index);
			}
		}
	}

	private static void Swap(int[] arr, int x, int y) {
		if(x==y){
			return ;
		}
		arr[x]=arr[x]^arr[y];
		arr[y]=arr[x]^arr[y];
		arr[x]=arr[x]^arr[y];
	}
	
}
