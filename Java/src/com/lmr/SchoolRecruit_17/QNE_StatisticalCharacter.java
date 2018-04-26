package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class QNE_StatisticalCharacter {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String str=scanner.nextLine();
		int[] a=new int[256];
		char c;
		
		for(int i=0;i<str.length();i++){
			c=str.charAt(i);
			if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
				a[c]++;
				if(a[c]>=3){
					System.out.println(c);
					break;
				}
			}
		}
		
	}
	
}
