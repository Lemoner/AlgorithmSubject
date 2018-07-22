package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class MT_ThreeMissingNumbers {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int[] a=new int[10001];
		long t;
		while(scanner.hasNext()){
			a[scanner.nextInt()]=1;
		}
		
		t=0;
		for(int i=1;i<a.length;i++){
			if(a[i]==1){
				int p=(int)Math.pow(10, new String(i+"").length());
				t=t*p+i;
			}
		}

		System.out.println(t%7);
		
	}
	
}
