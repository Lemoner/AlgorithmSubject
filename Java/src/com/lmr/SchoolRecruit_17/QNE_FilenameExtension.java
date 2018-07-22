package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class QNE_FilenameExtension {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String str=scanner.nextLine();
		
		if(str.contains(".")){
			System.out.println(str.substring(str.lastIndexOf(".")+1));
		}
		else{
			System.out.println("null");
		}
		
	}
	
}
