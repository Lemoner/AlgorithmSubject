package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class WC_SumSums {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n,m;
		double r,sum;
		
		while(scanner.hasNext()){
			n=scanner.nextInt();
			m=scanner.nextInt();
			
			r=n;
			sum=n;
			
			for(int i=1;i<m;i++){
				r=Math.sqrt(r);
				sum+=r;
			}
			
			System.out.println(String.format("%.2f", sum));
		}
		
	}
	
}
