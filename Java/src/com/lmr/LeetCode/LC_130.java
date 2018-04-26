package com.lmr.LeetCode;

public class LC_130 {
	public void solve(char[][] board) {

		for (int i = 0; i < board.length; i++) {
			DFS(board, i, 0);
			DFS(board, i, board[0].length - 1);
		}

		for (int i = 0; i < board[0].length; i++) {
			DFS(board, 0, i);
			DFS(board, board.length - 1, i);
		}
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if(board[i][j] == '1'){
					board[i][j] = 'O';
				}
				else{
					board[i][j] = 'X';
				}
			}
		}

	}

	private void DFS(char[][] board, int i, int j) {

		if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) {
			return;
		}

		if (board[i][j] == 'X' || board[i][j] == '1') {
			return;
		}

		board[i][j] = '1';

		DFS(board, i - 1, j);
		DFS(board, i + 1, j);
		DFS(board, i, j - 1);
		DFS(board, i, j + 1);
	}
}
