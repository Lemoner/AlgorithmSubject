package com.lmr.Codeforces;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class CF_424_2_E {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<>();
		int sum=0;
		int t = 0;
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			
			int x=in.nextInt();
			a[i]=x;
			list.add(x);
			
		}
		
		Arrays.sort(a);
		
		Iterator<Integer> iterator;
		iterator = list.iterator();
		
		for(int i=0;i<n;i++){
			while(iterator.hasNext()){
				t=(int) iterator.next();
				sum++;
				if(t==a[i]){
					iterator.remove();
					break;
				}
			}
			if(t!=a[i]){
				iterator=list.iterator();
				while(iterator.hasNext()){
					t=(int) iterator.next();
					sum++;
					if(t==a[i]){
						iterator.remove();
						break;
					}
				}
			}
			t=0;
		}
		
		System.out.println(sum);
		
	}
	
}
