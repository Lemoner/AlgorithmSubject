package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class NE_RescueXE {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n,min;
		int[] x,y;
		
		n=scanner.nextInt();
		x=new int[n];
		y=new int[n];
		
		for(int i=0;i<n;i++){
			x[i]=scanner.nextInt();
		}
		for(int i=0;i<n;i++){
			y[i]=scanner.nextInt();
		}
		
		min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			min=Math.min(min, x[i]+y[i]-2);
		}
		
		System.out.println(min);
		
	}
	
}
