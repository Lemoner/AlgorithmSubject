package com.lmr.NK;

import java.util.Scanner;

public class WY_Main_22 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str=in.nextLine();
		
		int b,w;
		
		b=0;w=0;
		
		for(char c:str.toCharArray()){
			if(c=='b'){
				b++;
			}
			else if(c=='w'){
				w++;
			}
		}
		
		if(b==w){
			System.out.println(b+w);
		}
		else if(b>w){
			System.out.println(w*2+1);
		}
		else{
			System.out.println(b*2+1);
		}
		
	}
}

