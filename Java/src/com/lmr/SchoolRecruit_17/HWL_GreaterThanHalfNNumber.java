package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class HWL_GreaterThanHalfNNumber {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int r,t,count;
		
		r=scanner.nextInt();
		count=1;
		
		while(scanner.hasNext()){
			t=scanner.nextInt();
			if(r==t){
				count++;
			}
			else{
				count--;
				if(count<0){
					r=t;
					count=1;
				}
			}
		}
		
		System.out.println(r);
		
	}
	
}
