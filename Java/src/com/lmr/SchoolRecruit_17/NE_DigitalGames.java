package com.lmr.SchoolRecruit_17;

import java.util.Arrays;
import java.util.Scanner;

public class NE_DigitalGames {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n,sum;
		n=scanner.nextInt();
		
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scanner.nextInt();
		}
		
		Arrays.sort(a);
		
		sum=0;
		for(int i=0;i<n;i++){
			if(a[i]>sum+1){
				break;
			}
			sum+=a[i];
		}
		
		System.out.println(sum+1);
		
	}
	
}
