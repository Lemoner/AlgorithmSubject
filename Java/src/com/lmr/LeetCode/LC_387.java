package com.lmr.LeetCode;

public class LC_387 {
	public int firstUniqChar(String s) {
		
		int[] temp=new int[26];
		
		for(int i=0;i<s.length();i++){
			temp[s.charAt(i)-'a']++;
		}
		
		for(int i=0;i<s.length();i++){
			if(temp[s.charAt(i)-'a']==1){
				return i;
			}
		}
		
		return 0;

	}
	
	public int firstUniqChar1(String s) {
        if(s == null || s.length() == 0) return -1;
        if(s.length() == 1) return 0;
        int result = s.length();
        for(char i = 'a' ; i <= 'z' ; i++) {
            int st = s.indexOf(i); //find if it contains the character
            if(st == -1) continue; //no such char
            if(st == s.lastIndexOf(i)) {
                result = Math.min(st, result);                
            }    
        }
        return result == s.length() ? -1 : result;
    }
}
