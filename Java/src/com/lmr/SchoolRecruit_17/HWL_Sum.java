package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class HWL_Sum {
	
	static int n,m;

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		n=scanner.nextInt();
		m=scanner.nextInt();
		int[] a=new int[n];
		
		if((1+n)*n/2>=m){
			DFS(0,a,0,0);
		}
		
	}

	private static void DFS(int sum, int[] a, int index, int count) {
		
		for(int i=index+1;i<=n;i++){
			a[count]=i;
			sum+=i;
			if(sum==m){
				for(int k=0;k<count;k++){
					System.out.print(a[k]+" ");
				}
				System.out.println(a[count]);
				break;
			}
			else if(sum>m){
				break;
			}
			else{
				DFS(sum, a, i, count+1);
			}
			sum-=i;
		}
		
	}
	
}
