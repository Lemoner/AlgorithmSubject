package com.lmr.LeetCode;

public class LC_79 {

	public boolean exist(char[][] board, String word) {
		
		char temp;
		
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[i].length;j++){
				if(board[i][j]==word.charAt(0)){
					temp=board[i][j];
					board[i][j]='*';
					if(DFS(board,word,i,j,1)){
						return true;
					}
					board[i][j]=temp;
				}
			}
		}
		
		return false;

	}

	private boolean DFS(char[][] board, String word, int i, int j, int index) {
		
		char temp;
		
		if(index>=word.length()){
			return true;
		}
		
		if(i-1>=0&&board[i-1][j]==word.charAt(index)){
			i--;
			temp=board[i][j];
			board[i][j]='*';
			if(DFS(board,word,i,j,index+1)){
				return true;
			}
			board[i][j]=temp;
			i++;
		}
		
		if(i+1<board.length&&board[i+1][j]==word.charAt(index)){
			i++;
			temp=board[i][j];
			board[i][j]='*';
			if(DFS(board,word,i,j,index+1)){
				return true;
			}
			board[i][j]=temp;
			i--;
		}
		
		if(j-1>=0&&board[i][j-1]==word.charAt(index)){
			j--;
			temp=board[i][j];
			board[i][j]='*';
			if(DFS(board,word,i,j,index+1)){
				return true;
			}
			board[i][j]=temp;
			j++;
		}
		
		if(j+1<board[0].length&&board[i][j+1]==word.charAt(index)){
			j++;
			temp=board[i][j];
			board[i][j]='*';
			if(DFS(board,word,i,j,index+1)){
				return true;
			}
			board[i][j]=temp;
			j--;
		}
		
		return false;
	}
	
	public boolean exist1(char[][] board, String word) {
		
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[i].length;j++){
				if(board[i][j]==word.charAt(0)){
					if(DFSSimple(board,word,i,j,0)){
						return true;
					}
				}
			}
		}
		
		return false;

	}
	
	private boolean DFSSimple(char[][] board, String word, int i, int j, int index) {
		
		if(index==word.length()){
			return true;
		}
		
		if(i<0||i>=board.length||j<0||j>=board[0].length||board[i][j]!=word.charAt(index)){
			return false;
		}
		
		char temp;
		boolean result;
		
		temp=board[i][j];
		board[i][j]='#';
		result=DFSSimple(board, word, i-1, j, index+1)||
				DFSSimple(board, word, i+1, j, index+1)||
				DFSSimple(board, word, i, j-1, index+1)||
				DFSSimple(board, word, i, j+1, index+1);
		board[i][j]=temp;
		
		return result;
	}

	public static void main(String[] args) {
		
		LC_79 lc=new LC_79();
		
		char board[][]={{'A','B','C','E'},
						{'S','F','C','S'},
						{'A','D','E','E'}};
		String word="SEE";
		
		System.out.println(lc.exist1(board, word));
		
	}

}
