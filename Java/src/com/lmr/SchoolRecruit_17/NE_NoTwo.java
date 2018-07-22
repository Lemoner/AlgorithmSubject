package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class NE_NoTwo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int w,h,r;
		w=scanner.nextInt();
		h=scanner.nextInt();
		
		r=0;
		if(w==3&&h==3){
			r+=5;
		}
		else if(w==2||h==2){
			r+=4;
		}
		else if(w==1||h==1){
			r+=2;
		}
		else{
			r+=w/2*h;
			w=w%2;
			if(w!=0){
				r+=h/4*2;
				h=h%4;
				r+=h<=2?h:2;
			}
		}
		
		System.out.println(r);
		
	}
	
}
