package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class HWL_InvertStrings {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String str;
		String[] s;
		
		str=scanner.nextLine();
		s=str.trim().split(" ");
		
		for(int i=s.length-1;i>0;i--){
			System.out.print(s[i].trim()+" ");
		}
		System.out.print(s[0].trim());
		
	}
	
}
