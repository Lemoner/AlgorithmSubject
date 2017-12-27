package com.lmr.LeetCode;

public class LC_221 {

	public int maximalSquare(char[][] matrix) {
		
		if(matrix==null||matrix.length==0){
            return 0;
        }
		
		int n,m,count;
		n=matrix.length;
		m=matrix[0].length;
		
		int w[][]=new int[n][m];
		int h[][]=new int[n][m];
		
		for(int i=0;i<n;i++){
			count=0;
			for(int j=m-1;j>=0;j--){
				if(matrix[i][j]=='1'){
					count++;
				}
				else{
					count=0;
				}
				w[i][j]=count;
			}
		}
		
		for(int i=0;i<m;i++){
			count=0;
			for(int j=n-1;j>=0;j--){
				if(matrix[j][i]=='1'){
					count++;
				}
				else{
					count=0;
				}
				h[j][i]=count;
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		
		int s,maxs,ti,tj,x,tx;
		
		maxs=0;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				s=0;
				if(matrix[i][j]=='1'){
					x=Math.min(w[i][j], h[i][j]);
					s++;
					x--;
					ti=i+1;
					tj=j+1;
					while(x>0&&ti<n&&tj<m&&matrix[ti][tj]=='1'){
						tx=Math.min(w[ti][tj], h[ti][tj]);
						if(tx<x){
							x=tx;
						}
						s++;
						x--;
						ti++;
						tj++;
					}
					maxs=Math.max(s, maxs);
				}
			}
		}
		
		
		return maxs;

	}
	
	public int maximalSquare1(char[][] matrix) {
		
		if(matrix==null||matrix.length==0){
            return 0;
        }
		
		int n,m,s,maxs;
		n=matrix.length;
		m=matrix[0].length;
		int t[][]=new int[n][m];
		
		for(int i=0;i<n;i++){
			if(matrix[i][0]=='1'){
				t[i][0]=1;
			}
			else{
				t[i][0]=0;
			}
		}
		
		for(int i=0;i<m;i++){
			if(matrix[0][i]=='1'){
				t[0][i]=1;
			}
			else{
				t[0][i]=0;
			}
		}
		
		maxs=0;
		for(int i=1;i<n;i++){
			for(int j=1;j<m;j++){
				if(matrix[i][j]=='1'){
					s=Math.min(t[i-1][j-1], Math.min(t[i-1][j], t[i][j-1]));
					t[i][j]=s+1;
					maxs=Math.max(s+1, maxs);
				}
				else{
					t[i][j]=0;
				}
			}
		}
		
		if(maxs==0){
			for(int i=0;i<n;i++){
				if(matrix[i][0]=='1'){
					return 1;
				}
			}
			for(int i=0;i<m;i++){
				if(matrix[0][i]=='1'){
					return 1;
				}
			}
		}
		
		return maxs*maxs;
	}
	
	public int maximalSquare2(char[][] matrix) {
        if(matrix.length == 0) return 0;
        int m = matrix.length, n = matrix[0].length;
        int[][] sideTable = new int[m+1][n+1];
        int max = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == '0') continue;
                int len = 1;
                while(len <= sideTable[i][j] && matrix[i-len][j] == '1' && matrix[i][j-len] == '1') len++;
                
                for(int ti=0;ti<sideTable.length;ti++){
                	for(int tj=0;tj<sideTable[0].length;tj++){
                		System.out.print(sideTable[ti][tj]+"\t");
                	}
                	System.out.println();
                }
                System.out.println("----------------");
                
                sideTable[i+1][j+1] = len; 
                if(max < len*len) max = len*len;
            }
        }
        return max;
    }

	public static void main(String[] args) {

		LC_221 lc=new LC_221();
		
		char matrix[][]={{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
		
		System.out.println(lc.maximalSquare2(matrix));
		
	}

}
