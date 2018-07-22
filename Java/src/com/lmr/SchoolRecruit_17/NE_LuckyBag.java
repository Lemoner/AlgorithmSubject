package com.lmr.SchoolRecruit_17;

import java.util.Arrays;
import java.util.Scanner;

public class NE_LuckyBag {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n;
		n=scanner.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scanner.nextInt();
		}
		
		Arrays.sort(a);
		
		System.out.println(DFS(a,0,0,1));
		
	}

	private static int DFS(int[] a, int index, long sum, long product) {
		
		int count=0;
		
		for(int i=index;i<a.length;i++){
			sum+=a[i];
			product*=a[i];
			if(sum>product){
				count+=1+DFS(a, i+1, sum, product);
			}
			else if(a[i]==1){
				count+=DFS(a, i+1, sum, product);
			}
			else{
				break;
			}
			sum-=a[i];
			product/=a[i];
			while(i+1<a.length&&a[i]==a[i+1]){
				i++;
			}
		}
		
		return count;
	}
	
}
