package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class NE_BuyApple {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n,result,x;
		
		result=Integer.MAX_VALUE;
		n=scanner.nextInt();
		
		for(int i=0;i<=n/8;i++){
			if((n-i*8)%6==0){
				x=i+(n-i*8)/6;
				result=Math.min(result, x);
			}
		}
		System.out.println(result==Integer.MAX_VALUE?-1:result);
		
	}
	
}
