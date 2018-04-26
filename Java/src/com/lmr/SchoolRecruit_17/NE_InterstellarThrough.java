package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class NE_InterstellarThrough {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		long h,t;
		h=scanner.nextLong();
		
		t=(long) Math.sqrt(h);
		
		if(t*(t+1)<=h){
			System.out.println(t);
		}
		else{
			System.out.println(t-1);
		}
		
	}
	
}
