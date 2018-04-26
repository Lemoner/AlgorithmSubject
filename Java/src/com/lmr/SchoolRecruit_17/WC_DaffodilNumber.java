package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class WC_DaffodilNumber {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int m,n,index;
		int[] a={153,370,371,407};
		
		while(scanner.hasNext()){
			m=scanner.nextInt();
			n=scanner.nextInt();
			
			index=0;
			for(int i=0;i<a.length;i++){
				if(a[i]>=m&&a[i]<=n){
					if(index==0){
						System.out.print(a[i]);
					}
					else{
						System.out.print(" "+a[i]);
					}
					index++;
				}
			}
			
			if(index==0){
				System.out.print("no");
			}
			
			System.out.println();
			
		}
		
	}
	
}
