package com.lmr.NK;

import java.util.Scanner;

public class PDD_Main_11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		long hp,na,ba;
		
		hp=scanner.nextLong();
		na=scanner.nextLong();
		ba=scanner.nextLong();
		
		System.out.println(Fun(hp,na,ba));
		
	}

	private static long Fun(long hp, long na, long ba) {
		
		long result,t;
		result=0;
		
		if(na*2>=ba){
			result=hp/na;
			hp-=result*na;
		}
		else{
			result=hp/ba;
			hp-=result*ba;
			result*=2;
		}
		
		if(hp==0){
			return result;
		}

		if(hp<=na){
			result+=1;
		}
		else{
			result+=2;
		}
		
		return result;
	}

}
