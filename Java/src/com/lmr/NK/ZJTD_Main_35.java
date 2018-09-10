package com.lmr.NK;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ZJTD_Main_35 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n,m,a,b,count,result;
		n=in.nextInt();
		m=in.nextInt();
		
		int[][] g=new int[n+1][n+1];
		
		for(int i=1;i<=n;i++){
			g[i][i]=1;
		}
		
		for(int i=0;i<m;i++){
			a=in.nextInt();
			b=in.nextInt();
			g[b][a]=1;
		}
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i!=j&&g[i][j]==1){
					Fun(g,i,j);
				}
			}
		}
		
		result=0;
		
		for(int i=1;i<=n;i++){
			count=0;
			for(int j=0;j<=n;j++){
				if(g[i][j]==1){
					count++;
				}
			}
			if(count==n){
				result++;
			}
		}
		
		System.out.println(result);
	}
	public static void Fun(int[][] g,int i,int j){
		
		Queue<Integer> queue=new LinkedList<>();
		queue.offer(j);
		
		int data;
		
		while(!queue.isEmpty()){
			data=queue.poll();
			for(int x=1;x<g.length;x++){
				if(g[data][x]==1&&data!=x&&x!=i&&g[i][x]!=1){
					g[i][x]=1;
					queue.offer(x);
				}
			}
		}
	}

}