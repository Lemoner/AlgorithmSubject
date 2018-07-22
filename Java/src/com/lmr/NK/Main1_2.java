package com.lmr.NK;

import java.util.Scanner;

public class Main1_2 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n,m,x,y,a1,b1,a2,b2,count;
		int[][] map,num;
		int size=1001;
		
		while (in.hasNextInt()) {
			
			n=in.nextInt();
			map=new int[size][size];
			num=new int[size][size];
			
			for(int i=0;i<n;i++){
				x=in.nextInt();
				y=in.nextInt();
				map[x][y]++;
			}
			
			for(int i=1;i<size;i++){
				for(int j=1;j<size;j++){
					num[i][j]=num[i-1][j]+num[i][j-1]-num[i-1][j-1]+map[i][j];
				}
			}
			
			m=in.nextInt();
			while(m-->0){
				a1=in.nextInt();
				b1=in.nextInt();
				a2=in.nextInt();
				b2=in.nextInt();
				
				count=num[a2][b2]-num[a1-1][b2]-num[a2][b1-1]+num[a1-1][b1-1];
				
				System.out.println(count);
				
			}
			
		}
		
	}

	public static void main1() {

		Scanner in = new Scanner(System.in);
		
		int n,m,a1,b1,a2,b2,count;
		int[] x,y;
		
		while (in.hasNextInt()) {
			
			n=in.nextInt();
			x=new int[n];
			y=new int[n];
			for(int i=0;i<n;i++){
				x[i]=in.nextInt();
				y[i]=in.nextInt();
			}
			
			m=in.nextInt();
			while(m-->0){
				a1=in.nextInt();
				b1=in.nextInt();
				a2=in.nextInt();
				b2=in.nextInt();
				
				count=0;
				
				for(int i=0;i<n;i++){
					if(x[i]>=a1&&x[i]<=a2&&y[i]>=b1&&y[i]<=b2){
						count++;
					}
				}
				
				System.out.println(count);
				
			}
			
		}
		
		
	}

}
