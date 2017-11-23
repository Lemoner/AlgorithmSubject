package com.lmr.LeetCode;

import java.util.Stack;

public class LC_394 {

	public String decodeString(String s) {
		
		Stack<Integer> numstack=new Stack<>();
		Stack<StringBuilder> strstack=new Stack<>();
		
		char c;
		int count=0;
		
		strstack.push(new StringBuilder());
		for(int i=0;i<s.length();i++){
			c=s.charAt(i);
			if(c>='0'&&c<='9'){
				count=count*10+c-'0';
			}
			else if(c=='['){
				numstack.push(count);
				count=0;
				strstack.push(new StringBuilder());
			}
			else if(c==']'){
				int num=numstack.pop();
				StringBuilder sb=strstack.pop();
				String str=sb.toString();
				for(int k=1;k<num;k++){
					sb.append(str);
				}
				strstack.peek().append(sb);
			}
			else{
				strstack.peek().append(c);
			}
		}
		
		return strstack.pop().toString();

	}
	
	public static void main(String[] args) {
		
		LC_394 lc=new LC_394();
		
//		String s="3[a]2[bc]";
//		String s="3[a2[c]]";
		String s="10[k]";
		
		System.out.println(lc.decodeString(s));
		
	}

}
