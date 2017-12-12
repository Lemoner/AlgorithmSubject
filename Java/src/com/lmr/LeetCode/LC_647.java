package com.lmr.LeetCode;

public class LC_647 {

	public int countSubstrings(String s) {
		
		int count,span;
		
		count=0;
		
		for(int i=0;i<s.length();i++){
			count++;
			span=1;
			while(i-span>=0&&i+span<s.length()){
				if(s.charAt(i-span)==s.charAt(i+span)){
					count++;
					span++;
				}
				else{
					break;
				}
			}
		}
		
		return count;

	}
	
	public int countSubstrings1(String s) {
		
		char str[]=new char[2*s.length()-1];
		int count,span;
		
		str[0]=s.charAt(0);
		for(int i=1,j=1;i<s.length();i++,j++){
			str[j]='*';
			j++;
			str[j]=s.charAt(i);
		}
		
		count=0;
		
		for(int i=0;i<str.length;i++){
			if(str[i]=='*'){
				span=1;
			}
			else{
				count++;
				span=2;
			}
			while(i-span>=0&&i+span<str.length){
				if(str[i-span]==str[i+span]){
					count++;
					span+=2;
				}
				else{
					break;
				}
			}
		}
		
		return count;

	}
	
	public int countSubstrings2(String s) {
		
		int count,left,right;
		
		count=0;
		
		for(int i=0;i<s.length();i++){
			left=i;
			right=i;
			while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
				count++;
				left--;
				right++;
			}
			left=i;
			right=i+1;
			while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
				count++;
				left--;
				right++;
			}
		}
		
		return count;

	}
	
	public static void main(String[] args) {
		
		LC_647 lc=new LC_647();
		
		String s="aaa";
		
		System.out.println(lc.countSubstrings2(s));
		
	}

}
