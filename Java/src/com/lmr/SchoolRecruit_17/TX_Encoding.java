package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class TX_Encoding {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String str=scanner.next();
		
		int[] a=new int[]{1,25,25*25,25*25*25};
		int count,len,sum;
		
		len=str.length();
		count=len-1;
		
		for(int i=0;i<len;i++){
			sum=0;
			for(int j=0;j<a.length-i;j++){
				sum+=a[j];
			}
			count+=(str.charAt(i)-'a')*sum;
		}
		
		System.out.println(count);
		
	}
	
}
