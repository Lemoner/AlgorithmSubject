package com.lmr.NK;

import java.util.Scanner;

public class PDD_Main_1 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String[] name=new String[]{"Alice","Bob","Cathy","Dave"};
		
		long n;
		n=scanner.nextLong();
		
		long x=1;
		while(true){
			if(x*1>=n){
				System.out.println(name[0]);
				break;
			}
			else if(x*2>=n){
				System.out.println(name[1]);
				break;
			}
			else if(x*3>=n){
				System.out.println(name[2]);
				break;
			}
			else if(x*4>=n){
				System.out.println(name[3]);
				break;
			}
			n-=x*4;
			x=x<<1;
		}
		
		
	}
	
}
