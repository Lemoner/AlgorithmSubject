package com.lmr.LeetCode;

public class LC_20 {

	public boolean isValid(String s) {
		
		if(s.length()==0){
			return true;
		}
		
		if(s.length()%2!=0){
			return false;
		}
		
		int[] stack=new int[s.length()+1];
		stack[0]=0;
		
		for(int i=0;i<s.length();i++){
			Character c=s.charAt(i);
			if('('==c||'['==c||'{'==c){
				stack[0]++;
				stack[stack[0]]=c;
			}
			else if(')'==c||']'==c||'}'==c){
				if(stack[0]>0){
					if((')'==c&&'('==stack[stack[0]])||(']'==c&&'['==stack[stack[0]])||('}'==c&&'{'==stack[stack[0]])){
						stack[0]--;
					}
				}
				else{
					return false;
				}
			}
			else{
				return false;
			}
		}
		
		if(stack[0]==0){
			return true;
		}
		else{
			return false;
		}
        
    }
	
	public static void main(String[] args) {
		
		LC_20 lc=new LC_20();
		
		String s="((";
		System.out.println(lc.isValid(s));
		
	}
	
}
