package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class MT_IntegerAddition {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);

		char[] c1,c2;
		int[] r;
		int index,index1,index2,s,t;
		
		while(scanner.hasNext()){
			c1=scanner.next().toCharArray();
			c2=scanner.next().toCharArray();
			
			if(!Judge(c1)||!Judge(c2)){
				System.out.println("Error");
			}
			else{
				r=new int[102];
				index=0;
				index1=c1.length-1;
				index2=c2.length-1;
				t=0;
				while(index1>=0&&index2>=0){
					s=(c1[index1--]-'0')+(c2[index2--]-'0')+t;
					t=s/10;
					r[index++]=s%10;
				}
				while(index1>=0){
					s=(c1[index1--]-'0')+t;
					t=s/10;
					r[index++]=s%10;
				}
				while(index2>=0){
					s=(c2[index2--]-'0')+t;
					t=s/10;
					r[index++]=s%10;
				}
				if(t!=0){
					r[index++]=t;
				}
				for(int i=index-1;i>=0;i--){
					System.out.print(r[i]);
				}
				System.out.println();
			}
			
		}
		
		
	}

	private static boolean Judge(char[] c) {
		
		for(int i=0;i<c.length;i++){
			if(c[i]<'0'||c[i]>'9'){
				return false;
			}
		}
		
		return true;
	}
	
}
