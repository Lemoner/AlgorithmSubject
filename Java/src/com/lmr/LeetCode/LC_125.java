package com.lmr.LeetCode;

public class LC_125 {
	public boolean isPalindrome(String s) {
		if(s==null||s.length()==0){
			return true;
		}
		
		int left,right;
		char lc,rc;
		left=0;
		right=s.length()-1;
		
		while(left<right){
			while(left<s.length()&&!isCA(s.charAt(left))){
				left++;
			}
			while(right>=0&&!isCA(s.charAt(right))){
				right--;
			}
			if(left<right){
				lc=s.charAt(left);
				rc=s.charAt(right);
				if(rc==lc||(isC(lc)&&isC(rc)&&(rc-'a'==lc-'A'||rc-'A'==lc-'a'))){
					left++;
					right--;
				}
				else{
					return false;
				}
			}
		}
		
		return true;
	}
	
	public boolean isCA(char c){
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9')){
			return true;
		}
		return false;
	}
	
	public boolean isC(char c){
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		LC_125 lc=new LC_125();
		
		String s="0P";
		
		System.out.println(lc.isPalindrome(s));
		
	}
}
