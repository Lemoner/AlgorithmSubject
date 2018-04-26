package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class NE_TwoSortingMethods {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n,flag1,flag2;
		String str1,str2;
		
		n=scanner.nextInt();
		flag1=1;
		flag2=1;
		
		str1=scanner.next();
		for(int i=0;i<n-1;i++){
			str2=scanner.next();
			if(flag1==1){
				if(str1.compareTo(str2)>0){
					flag1=0;
				}
			}
			if(flag2==1){
				if(str1.length()>str2.length()){
					flag2=0;
				}
			}
			str1=str2;
		}
		
		if(flag1==1&&flag2==1){
			System.out.println("both");
		}
		else if(flag1==1&&flag2==0){
			System.out.println("lexicographically");
		}
		else if(flag1==0&&flag2==1){
			System.out.println("lengths");
		}
		else{
			System.out.println("none");
		}
		
	}
	
}
