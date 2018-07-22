package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class DD_UndergroundMaze {
	
	static int[] mx=new int[101];
	static int[] my=new int[101];
	static int mc=-1;
	static int mp=-1;

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n,m,p;
		n=scanner.nextInt();
		m=scanner.nextInt();
		p=scanner.nextInt();
		int[][] a=new int[n][m];
		int[] x=new int[101];
		int[] y=new int[101];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				a[i][j]=scanner.nextInt();
			}
		}
		
		DFS(a,x,y,0,0,0,p);
		
		if(mc==-1){
			System.out.println("Can not escape!");
		}
		else{
			System.out.print("["+mx[0]+","+my[0]+"]");
			for(int i=1;i<mc;i++){
				System.out.print(",["+mx[i]+","+my[i]+"]");
			}
			System.out.println();
		}
		
	}

	private static void DFS(int[][] a, int[] x, int[] y, int rx, int ry, int r, int p) {
		
		if(rx<0||rx>=a.length||ry<0||ry>=a[0].length||a[rx][ry]!=1||p<0){
			return ;
		}
		
		if(rx==0&&ry==a[0].length-1&&p>mp){
			mp=p;
			for(int i=0;i<r;i++){
				mx[i]=x[i];
				my[i]=y[i];
			}
			mx[r]=rx;
			my[r]=ry;
			mc=r+1;
		}
		else{
			x[r]=rx;
			y[r]=ry;
			a[rx][ry]=0;
			DFS(a, x, y, rx, ry-1, r+1, p-1);
			DFS(a, x, y, rx, ry+1, r+1, p-1);
			DFS(a, x, y, rx-1, ry, r+1, p-3);
			DFS(a, x, y, rx+1, ry, r+1, p);
			a[rx][ry]=1;
		}
		
	}
}
