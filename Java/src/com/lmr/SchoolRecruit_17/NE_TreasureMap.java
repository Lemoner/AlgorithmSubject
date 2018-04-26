package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class NE_TreasureMap {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String str1,str2;
		int index1,index2;
		
		str1=scanner.nextLine();
		str2=scanner.nextLine();
		
		index1=0;
		index2=0;
		
		while(index1<str1.length()&&index2<str2.length()){
			if(str1.charAt(index1)==str2.charAt(index2)){
				index1++;
				index2++;
			}
			else{
				index1++;
			}
		}
		
		if(index2>=str2.length()){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		
	}
	
}
