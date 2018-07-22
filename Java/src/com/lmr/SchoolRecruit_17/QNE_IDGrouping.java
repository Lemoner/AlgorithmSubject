package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class QNE_IDGrouping {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		while(scanner.hasNext()){
			char[] c=scanner.nextLine().trim().toCharArray();
			for(int i=0,k=0;i<c.length;i++){
				if(c[i]>='0'&&c[i]<='9'){
					System.out.print(c[i]);
					k++;
					if(k==6||k==14){
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
	}
	
}
