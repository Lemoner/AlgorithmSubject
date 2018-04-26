package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class NE_ElegantPoint {

//	public static int ElegantPoint(int R){
//		
//		int count;
//		double mid;
//		
//		count=0;
//		mid=Math.sqrt(R*1.0/2);
//		
//		for(int i=1;i<mid;i++){
//			int j=(int) Math.sqrt(R-i*i);
//			if(i*i+j*j==R){
//				count++;
//			}
//		}
//		
//		count*=2;
//		
//		if(2*((int)mid)*((int)mid)==R){
//			count++;
//		}
//		
//		count++;
//		
//		return 4*count;
//		
//	}
	
	public static int ElegantPoint(int R){
		
		int count,r;
		
		count=0;
		r=(int) Math.sqrt(R);
		
		for(int i=1;i<=r;i++){
			int j=(int) Math.sqrt(R-i*i);
			if(i*i+j*j==R){
				count++;
			}
		}
		
		return 4*count;
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(ElegantPoint(n));
		
	}
	
}
