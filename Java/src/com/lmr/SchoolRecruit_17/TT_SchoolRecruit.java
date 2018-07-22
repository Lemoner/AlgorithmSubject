package com.lmr.SchoolRecruit_17;

import java.util.Arrays;
import java.util.Scanner;

public class TT_SchoolRecruit {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n,count,t,c,index;
		n=scanner.nextInt();
		int[] a=new int[n];
		
		for(int i=0;i<n;i++){
			a[i]=scanner.nextInt();
		}
		
		Arrays.sort(a);
		
		t=0;
		count=0;
		index=0;
		while(index<n){
			if(t==0){
				t++;
				index++;
			}
			else{
				c=a[index]-a[index-1];
				if(c<=10){
					t++;
					index++;
					if(t==3){
						t=0;
					}
				}
				else if(c<=20){
					if(t==1){
						index++;
					}
					count++;
					t=0;
				}
				else{
					if(t==1){
						count+=2;
					}
					else{
						count++;
						
					}
					t=0;
				}
			}
		}
		
		if(t!=0){
			count+=3-t;
		}
		
		System.out.println(count);
		
	}
	
}
