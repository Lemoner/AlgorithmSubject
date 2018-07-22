package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class NE_HungryLittleYi {

//	public static void main(String[] args) {
//		
//		Scanner scanner=new Scanner(System.in);
//		
//		int count;
//		long[] a=new long[100001];
//		a[0]=scanner.nextLong();
//		
//		count=a.length;
//		for(int i=1;i<a.length;i++){
//			a[i]=(8*a[i-1]+7)%1000000007;
//			if(a[i]==0){
//				count=i;
//				break;
//			}
//		}
//		
//		for(int i=count-1;i>0;i--){
//			for(int j=i;j<count;j++){
//				a[j]=(4*a[j-1]+3)%1000000007;
//				if(a[j]==0){
//					count=Math.max(count, j);
//					break;
//				}
//			}
//		}
//		
//		System.out.println(count==a.length?-1:count);
//		
//	}
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int count;
		long t,p1,p2;
		t=scanner.nextLong();
		
		p1=t;
		count=Integer.MAX_VALUE;
		for(int k=0;k<3;k++){
			if(p1==0&&k!=0){
				count=Math.min(count, k);
				break;
			}
			for(int i=1;i<=100000;i++){
				p2=(8*p1+7)%1000000007;
				if(p2==0){
					count=Math.min(count, i+k);
					break;
				}
				p1=p2;
			}
			t=(4*t+3)%1000000007;
			p1=t;
		}
		
		
		System.out.println(count==Integer.MAX_VALUE?-1:count);
		
	}
	
}
