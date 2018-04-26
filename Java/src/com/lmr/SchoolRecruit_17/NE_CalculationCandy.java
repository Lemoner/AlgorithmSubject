package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class NE_CalculationCandy {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int x,y,z,r;
		
		x=scanner.nextInt();
		y=scanner.nextInt();
		z=scanner.nextInt();
		r=scanner.nextInt();
		
		if((x+y)!=(z-r)){
			System.out.println("No");
		}
		else{
			System.out.println((x+z)/2+" "+(y+r)/2+" "+(r-y)/2);
		}
		
	}
	
}
