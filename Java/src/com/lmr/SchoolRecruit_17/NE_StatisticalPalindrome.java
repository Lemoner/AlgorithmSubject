package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class NE_StatisticalPalindrome {
	
	public static boolean IsPalindrome(String s){
		
		int len=s.length();
		
		for(int i=0;i<len/2;i++){
			if(s.charAt(i)!=s.charAt(len-i-1)){
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String A,B;
		StringBuffer sb;
		int count;
		
		A=scanner.next();
		B=scanner.next();
		
		count=0;
		for(int i=0;i<=A.length();i++){
			sb=new StringBuffer();
			sb.append(A.substring(0, i));
			sb.append(B);
			sb.append(A.substring(i));
			if(IsPalindrome(sb.toString())){
				count++;
			}
		}
		
		System.out.println(count);
	}
	
}
