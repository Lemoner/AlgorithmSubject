package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class NE_DistributeApple {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n,sum,ave,count;
		int[] a;
		
		n=scanner.nextInt();
		a=new int[n];
		
		sum=0;
		for(int i=0;i<n;i++){
			a[i]=scanner.nextInt();
			sum+=a[i];
		}
		
		count=-1;
		if(sum%n==0){
			ave=sum/n;
			count=0;
			for(int i=0;i<n;i++){
				if(Math.abs(a[i]-ave)%2!=0){
					count=-1;
					break;
				}
				else{
					count+=Math.abs(a[i]-ave)/2;
				}
			}
		}
		
		System.out.println(count);
		
	}
	
}
