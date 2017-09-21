package com.test;

public class TestOne {

	
	
	public void DFS(String s, int index, char c, char change){
		
		if(index==s.length()){
			System.out.println(s);
			return ;
		}
		else{
			if(s.charAt(index)==c){
				if(c<change){
					DFS(s, index+1, c, change);
					s.replace(c, change);
					DFS(s.replaceFirst(c+"", change+""),index+1,c,change);
				}
				else{
					DFS(s.replaceFirst(c+"", change+""),index+1,c,change);
					DFS(s, index+1, c, change);
				}
			}
			else{
				DFS(s, index+1, c, change);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		TestOne test=new TestOne();
		test.DFS("997", 0, '9', '8');
		
	}
}
