package com.lmr.NK;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Node{
	
	int x;
	int y;
	
	public Node(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
}

public class Main1_3 {
	
	public static void main(String[] args) {
		
		int[] x=new int[]{-1,0,0,1};
		int[] y=new int[]{0,-1,1,0};
		
		Scanner in = new Scanner(System.in);
		
		char[][] map;
		int[][] dp;
		Queue<Node> queue=new ArrayDeque<>();
		Node end = null;
		
		n=in.nextInt();
		map=new char[n][n];
		dp=new int[n][n];
		
		in.nextLine();
		for(int i=0;i<n;i++){
			char[] c=in.nextLine().toCharArray();
			for(int j=0;j<n;j++){
				map[i][j]=c[j];
				if(c[j]=='@'){
					queue.add(new Node(i, j));
				}
				else if(c[j]=='*'){
					end=new Node(i, j);
				}
			}
		}
		
		while(!queue.isEmpty()){
			Node node=queue.poll();
			for(int i=0;i<x.length;i++){
				int nx,ny;
				nx=node.x+x[i];
				ny=node.y+y[i];
				if(nx>=0&&nx<n&&ny>=0&&ny<n&&dp[nx][ny]==0){
					if(map[nx][ny]=='.'){
						dp[nx][ny]=dp[node.x][node.y]+1;
						queue.add(new Node(nx, ny));
					}
					else if(map[nx][ny]=='*'){
						dp[nx][ny]=dp[node.x][node.y]+1;
						break;
					}
				}
			}
			if(dp[end.x][end.y]!=0){
				break;
			}
		}
		
		System.out.println(dp[end.x][end.y]);
			
	}
	
	public static int min;
	public static int n;
	
	public static void main1() {

		Scanner in = new Scanner(System.in);
		
		int a = 0,b = 0;
		char[][] x;
		
		while (in.hasNextInt()) {
			
			n=in.nextInt();
			x=new char[n][n];
			in.nextLine();
			for(int i=0;i<n;i++){
				char[] c=in.nextLine().toCharArray();
				for(int j=0;j<n;j++){
					x[i][j]=c[j];
					if(c[j]=='*'){
						a=i;
						b=j;
					}
				}
			}
			
			min=Integer.MAX_VALUE;
			
			DFS(x,a,b,0);
			
			System.out.println(min);
			
		}
		
	}

	private static void DFS(char[][] x, int a, int b, int c) {
		
		if(a<0||a>=n||b<0||b>=n||x[a][b]=='#'||x[a][b]=='0'||c>min){
			return ;
		}
		if(x[a][b]=='@'){
			min=Math.min(min, c);
		}
		else{
			char t=x[a][b];
			x[a][b]='0';
			DFS(x, a, b-1, c+1);
			DFS(x, a, b+1, c+1);
			DFS(x, a-1, b, c+1);
			DFS(x, a+1, b, c+1);
			x[a][b]=t;
		}
		
	}
	
}
