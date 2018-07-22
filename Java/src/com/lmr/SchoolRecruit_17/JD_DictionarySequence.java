package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class JD_DictionarySequence {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		long n,m,t,l,r,c;
		n=scanner.nextLong();
		m=scanner.nextLong();
		
		t=1;
		m--;
		while(m!=0){
			l=t;
			r=t+1;
			c=0;
			while(l<=n){
				c+=Math.min(r-1, n)-l+1;
				l*=10;
				r*=10;
			}
			if(c<=m){
				m-=c;
				t++;
			}
			else{
				m--;
				t*=10;
			}
		}
		
		System.out.println(t);
	}
	
}
