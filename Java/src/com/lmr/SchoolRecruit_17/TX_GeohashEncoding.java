package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class TX_GeohashEncoding {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n,l,r,m;
		
		n=scanner.nextInt();
		l=-90;
		r=90;
		
		for(int i=0;i<6;i++){
			m=(r+l)/2;
			if(n>=m){
				l=m;
				System.out.print("1");
			}
			else{
				r=m;
				System.out.print("0");
			}
		}
		
		
	}
	
}
