package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class HWL_DeletePublicCharacters {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		StringBuilder sb=new StringBuilder();
		int[] a=new int[256];
		String str1,str2;
		
		str1=scanner.nextLine();
		str2=scanner.nextLine();
		
		for(int i=0;i<str2.length();i++){
			a[str2.charAt(i)]=1;
		}
		
		for(int i=0;i<str1.length();i++){
			if(a[str1.charAt(i)]!=1){
				sb.append(str1.charAt(i));
			}
		}
		
		System.out.println(sb.toString());
		
	}
	
}
