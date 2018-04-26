package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class JD_LuckyNumber {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n,count;
		
		n=scanner.nextInt();
		
		count=0;
		for(int i=0;i<=n;i++){
			if(f(i, 2)==f(i, 10)){
				count++;
			}
		}
		
		System.out.println(count);
		
	}

	public static int f(int n,int x) {
		
		int sum=0;
		while(n!=0){
			sum+=n%x;
			n/=x;
		}
		
		return sum;
		
	}
	
}
