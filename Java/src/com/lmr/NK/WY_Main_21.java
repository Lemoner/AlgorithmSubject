package com.lmr.NK;

import java.util.Scanner;

public class WY_Main_21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t;
		long n,m;
		
		t=in.nextInt();
		
		for(int i=0;i<t;i++){
			n=in.nextLong();
			m=in.nextLong();
			
			
			if(n==1){
				if(m==1){
					System.out.println(1);
				}
				else if(m==2){
					System.out.println(0);
				}
				else{
					System.out.println(m-2);
				}
			}
			else if(n==2){
				System.out.println(0);
			}
			else{
				if(m==1){
					System.out.println(n-2);
				}
				else if(m==2){
					System.out.println(0);
				}
				else{
					System.out.println((n-2)*(m-2));
				}
			}
			
		}
		
	}
}

//	private static int fun(long n, long m) {
//		
//		int result;
//		result=0;
//		
//		for(int i=0;i<n;i++){
//			for(int j=0;j<m;j++){
//				if(count(i,j,n,m)%2!=0){
//					result++;
//				}
//			}
//		}
//		
//		return result;
//	}
//
//	private static int count(int i, int j, long n, long m) {
//		
//		int sum;
//		sum=1;
//		
//		if(i-1>=0&&j-1>=0){
//			sum++;
//		}
//		if(i-1>=0&&j>=0){
//			sum++;
//		}
//		if(i-1>=0&&j+1<m){
//			sum++;
//		}
//		if(i>=0&&j-1>=0){
//			sum++;
//		}
//		if(i>=0&&j+1<m){
//			sum++;
//		}
//		if(i+1<n&&j-1>=0){
//			sum++;
//		}
//		if(i+1<n&&j>=0){
//			sum++;
//		}
//		if(i+1<n&&j+1<m){
//			sum++;
//		}
//		
//		return sum;
//	}
//
//}
