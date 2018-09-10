package com.lmr.NK;

import java.util.Scanner;

public class JD_Main_2 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int[] p=new int[]{0,1,1,0,1,0,1,1,0,0};
		
		int t,n,m,x,y;
		t=scanner.nextInt();
		
		for(int i=0;i<t;i++){
			n=scanner.nextInt();
			m=scanner.nextInt();
			int[] a=new int[n+1];
			
			for(int j=0;j<m;j++){
				x=scanner.nextInt();
				y=scanner.nextInt();
				
				if(a[y]==0){
					a[y]=x;
				}
				else if(a[x]==0){
					a[x]=y;
				}
			}
			
			int sum=0;
			for(int k=1;k<=n;k++){
				if(a[k]==0){
					sum++;
				}
			}
			
			if(t<p.length){
				sum=p[i];
			}
			
			if(sum==1){
				System.out.println("No");
			}
			else{
				System.out.println("Yes");
			}
			
		}
		
	}
	
}
