package com.lmr.SchoolRecruit_17;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class JD_Collection {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n,m,index;
		
		n=scanner.nextInt();
		m=scanner.nextInt();
		
		Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<n+m;i++){
			set.add(scanner.nextInt());
		}
		
		int[] a=new int[set.size()];
		
		index=0;
		Iterator<Integer> iterator=set.iterator();
		while(iterator.hasNext()){
			a[index++]=iterator.next().intValue();
		}
		
		Arrays.sort(a);
		
		System.out.print(a[0]);
		for(int i=1;i<a.length;i++){
			System.out.print(" "+a[i]);
		}
		
	}
	
}
