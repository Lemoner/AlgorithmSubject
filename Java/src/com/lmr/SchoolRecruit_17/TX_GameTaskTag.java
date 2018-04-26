package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class TX_GameTaskTag {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int a,b;
		
		a=scanner.nextInt();
		b=scanner.nextInt();
		
		if(a<1||a>1024||b<1||b>1024){
			System.out.println(-1);
			return ;
		}
		
		if(a==b){
			System.out.println(1);
		}
		else{
			System.out.println(0);
		}
		
	}
	
}
