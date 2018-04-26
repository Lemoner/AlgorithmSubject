package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class DD_RadixConvert {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		long m;
		int n;
		
		m=scanner.nextLong();
		n=scanner.nextInt();
		
		if(m<0){
			System.out.print("-");
			m=-m;
		}
		Fun(m,n);
		
	}

	private static void Fun(long m, int n) {
		if(m==0){
			return ;
		}
		Fun(m/n, n);
		int t=(int) (m%n);
		if(t>=10){
			System.out.print((char)('A'+(t-10)));
		}
		else{
			System.out.print(t);
		}
		
	}
	
}
