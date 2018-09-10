package com.lmr.NK;

import java.util.Scanner;
import java.util.Stack;

public class ZJTD_Main_33 {
	
	public static int sum=0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		char[] str=in.nextLine().toCharArray();
		
		int[] a=new int[str.length];
		for(int i=0;i<str.length;i++){
			a[i]=str[i]-'0';
		}
		
		DFS(a,0,0);

		System.out.println(sum);

	}

	private static void DFS(int[] a, int count,int index) {
		if(count==4){
			if(index>=a.length){
				sum++;
			}
			return ;
		}
		
		if(index>=a.length){
			return ;
		}
		
		int data;
		data=0;
		for(int i=0;i<3;i++){
			if(index<a.length){
				data=data*10+a[index++];
				if(data==0){
					DFS(a, count+1, index);
					break;
				}
				else if(data<=255){
					DFS(a, count+1, index);
				}
			}
		}
		
	}

}
