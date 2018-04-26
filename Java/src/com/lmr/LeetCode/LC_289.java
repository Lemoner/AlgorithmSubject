package com.lmr.LeetCode;

public class LC_289 {
	public void gameOfLife(int[][] board) {
		
		if(board==null||board.length==0){
			return ;
		}
		
		int m,n,sum;
		m=board.length;
		n=board[0].length;
		
		int[][] copy=new int[m][n];
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				sum=0;
				for(int x=Math.max(0, i-1);x<Math.min(m, i+2);x++){
					for(int y=Math.max(0, j-1);y<Math.min(n, j+2);y++){
						if(x==i&&y==j){
							continue;
						}
						if(board[x][y]==1){
							sum++;
						}
					}
				}
				if(board[i][j]==1){
					if(sum<2||sum>3){
						copy[i][j]=0;
					}
					else{
						copy[i][j]=1;
					}
				}
				else if(sum==3){
					copy[i][j]=1;
				}
			}
		}
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				board[i][j]=copy[i][j];
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		LC_289 lc=new LC_289();
		
		int[][] board={{1,1},{1,0}};
		
		lc.gameOfLife(board);
		
	}
	
}
