package com.lmr.SchoolRecruit_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NE_MixedPigments {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n,count;
		long t;
		n=scanner.nextInt();
		long[] a=new long[n];
		int[] d=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scanner.nextLong();
		}
		
		List<Long> list=new ArrayList<>();
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				t=a[i]^a[j];
				list.add(t);
				for(int k=0;k<n;k++){
					if(a[k]==t){
						d[k]++;
					}
				}
			}
		}
		
		System.out.println(list.toString());
		
		count=0;
		for(int i=0;i<n;i++){
			if(d[i]==0){
				count++;
			}
		}
		
		System.out.println(count);
	}
	
}
