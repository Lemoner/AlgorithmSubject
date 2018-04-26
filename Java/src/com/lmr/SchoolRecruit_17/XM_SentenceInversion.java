package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class XM_SentenceInversion {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String str=scanner.nextLine();
		
		String[] s=str.split(" ");
		
		for(int i=s.length-1;i>0;i--){
			System.out.print(s[i]+" ");
		}
		System.out.print(s[0]);
		
	}
	
}
