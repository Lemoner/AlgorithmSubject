package com.lmr.LeetCode;

public class LC_547 {

	public int findCircleNum(int[][] M) {
		
		int length = M.length;  
	    boolean[] visited = new boolean[length];  
	    int count;
	    
	    count=0;
	    for(int i=0;i<length;i++){
	    	if(DFS(M,i,visited)>0){
	    		count++;
	    	}
	    }
		
		return count;

	}

	private int DFS(int[][] M, int index, boolean[] visited) {
		
		if(visited[index]){
			return 0;
		}
		
		visited[index]=true;
		int x=1;
		
		for(int i=0;i<M.length;i++){
			if(M[index][i]==1&&i!=index){
				x+=DFS(M, i, visited);
			}
		}
		
		return x;
	}
	
	
	public int findCircleNum1(int[][] M) {
		
		int length = M.length;  
	    boolean[] visited = new boolean[length];  
	    int count;
	    
	    count=0;
	    for(int i=0;i<length;i++){
	    	if(!visited[i]){
	    		DFSX(M,i,visited);
	    		count++;
	    	}
	    }
		
		return count;

	}

	private void DFSX(int[][] M, int index, boolean[] visited) {
		
		visited[index]=true;
		
		for(int i=0;i<M.length;i++){
			if(!visited[index]&&M[index][i]==1&&i!=index){
				DFS(M, i, visited);
			}
		}
		
	}
	
	public int findCircleNum2(int[][] M) {
		
		int length = M.length;  
	    int[] a = new int[length];  
	    int count,q,p;
	    
	    count=length;
	    
	    for(int i=0;i<length;i++){
	    	a[i]=i;
	    }
	    
	    for(int i=0;i<length;i++){
	    	for(int j=i+1;j<length;j++){
	    		if(M[i][j]==1){
	    			q=FindRoot(a,i);
		    		p=FindRoot(a,j);
		    		if(q!=p){
		    			a[p]=q;
		    			count--;
		    		}
	    		}
	    	}
	    }
	    
	    return count;
		
	}
	
	private int FindRoot(int[] a, int t) {
		
		while(a[t]!=t){
			t=a[t];
		}
		
		return t;
	}
	

}
