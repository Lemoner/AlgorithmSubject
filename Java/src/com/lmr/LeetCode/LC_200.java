package com.lmr.LeetCode;

public class LC_200 {

	private int n;
	private int m;
	
	public int numIslands(char[][] grid) {
		
		int sum=0;
		
		n=grid.length;
		if(n==0){
			return 0;
		}
		m=grid[0].length;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(grid[i][j]=='1'){
					sum++;
					CheckGridAround(grid,i,j);
				}
			}
		}
		
		return sum;
	}
	
	public void CheckGridAround(char[][] grid, int i, int j) {
		
		if(i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1')
			return;
		
        grid[i][j] = '0';
        
        CheckGridAround(grid, i+1, j);
        CheckGridAround(grid, i, j+1);
        CheckGridAround(grid, i-1, j);
        CheckGridAround(grid, i, j-1);
        
	}

	public void CheckGridAround1(char[][] grid, int i, int j) {
		
		grid[i][j]='0';
		
		int up,down,left,right;
		
		up=j-1;
		down=j+1;
		left=i-1;
		right=i+1;
		
		if(up>=0){
			if(grid[i][up]=='1'){
				grid[i][up]='0';
				CheckGridAround(grid, i, up);
			}
		}
		
		if(down<grid[i].length){
			if(grid[i][down]=='1'){
				grid[i][down]='0';
				CheckGridAround(grid, i, down);
			}
		}
		
		if(left>=0){
			if(grid[left][j]=='1'){
				grid[left][j]='0';
				CheckGridAround(grid, left, j);
			}
		}
		
		if(right<grid.length){
			if(grid[right][j]=='1'){
				grid[right][j]='0';
				CheckGridAround(grid, right, j);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		LC_200 lc=new LC_200();
		
		char[][] grid={{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
		
		System.out.println(lc.numIslands(grid));
		
	}

}
