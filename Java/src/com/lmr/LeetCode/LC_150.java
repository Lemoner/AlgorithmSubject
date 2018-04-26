package com.lmr.LeetCode;

import java.util.Stack;

public class LC_150 {
	public int evalRPN(String[] tokens) {
		
		Stack<Integer> stack=new Stack<>();
		int a,b;
		
		for(int i=0;i<tokens.length;i++){
			switch(tokens[i]){
				case "+":
					a=stack.pop();
					b=stack.pop();
					stack.push(b+a);
					break;
				case "-":
					a=stack.pop();
					b=stack.pop();
					stack.push(b-a);
					break;
				case "*":
					a=stack.pop();
					b=stack.pop();
					stack.push(b*a);
					break;
				case "/":
					a=stack.pop();
					b=stack.pop();
					stack.push(b/a);
					break;
				default:
					stack.push(Integer.parseInt(tokens[i]));
			}
		}
		
		return stack.peek();

	}
	
	public int evalRPN1(String[] tokens) {
		
		int[] s=new int[tokens.length/2+1];
		int index=0;
		
		for(int i=0;i<tokens.length;i++){
			switch(tokens[i]){
				case "+":
					s[index-2]=s[index-2]+s[index-1];
					index--;
					break;
				case "-":
					s[index-2]=s[index-2]-s[index-1];
					index--;
					break;
				case "*":
					s[index-2]=s[index-2]*s[index-1];
					index--;
					break;
				case "/":
					s[index-2]=s[index-2]/s[index-1];
					index--;
					break;
				default:
					s[index++]=Integer.parseInt(tokens[i]);
			}
		}
		
		return s[0];
		
	}
}
