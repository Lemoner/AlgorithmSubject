package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class SH_KeepMaximumNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder yy = new StringBuilder();
		yy.append(sc.next());
		int cnt = sc.nextInt();
		int count = 0;
		while (count < cnt) {
			int len = yy.length() -1;
			int s = 0; 
			while (s < len && yy.codePointAt(s) >= yy.codePointAt(s+1))
				s++;
			yy.deleteCharAt(s);
			count++;
		}
		System.out.println(yy.toString());
		
	}
	
}
