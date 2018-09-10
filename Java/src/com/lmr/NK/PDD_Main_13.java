package com.lmr.NK;

import java.util.HashMap;
import java.util.Scanner;

public class PDD_Main_13 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int a,b;
		a=scanner.nextInt();
		b=scanner.nextInt();
		
		int[] result=Fun(a,b);
		System.out.println(result[0]+" "+result[1]);
		
	}

	private static int[] Fun(int a, int b) {
		
		int[] result=new int[2];
		
		if((a=a%b)==0){
			return result;
		}
		
		int t=0;
		HashMap<Integer, Integer> map=new HashMap<>();
		map.put(a, t);
		
		while(true){
			a=a*10%b;
			t++;
			if(a==0||map.get(a)!=null){
				break;
			}
			map.put(a, t);
		}
		
		if(a==0){
			result[0]=t;
		}
		else{
			result[0]=map.get(a);
			result[1]=t-map.get(a);
		}
		
		return result;
	}
}
