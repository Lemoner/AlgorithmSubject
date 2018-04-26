package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class NE_DigitalFlip {
	
	public static int rev(int n){
		
		int result;
		
		result=0;
		
		while(n!=0){
			result=result*10+n%10;
			n=n/10;
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int x,y;
		
		x=scanner.nextInt();
		y=scanner.nextInt();
		
		System.out.println(rev(rev(x)+rev(y)));
		
	}
	
}
