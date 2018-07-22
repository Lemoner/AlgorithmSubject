package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class MT_GridsNumber {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int x,y;
		x=scanner.nextInt()+1;
		y=scanner.nextInt()+1;
		
		int[] a=new int[x];
		for(int i=0;i<x;i++){
			a[i]=1;
		}
		
		for(int k=1;k<y;k++){
			for(int i=1;i<x;i++){
				a[i]=a[i]+a[i-1];
			}
		}
		
		System.out.println(a[x-1]);
		
	}
	
}
