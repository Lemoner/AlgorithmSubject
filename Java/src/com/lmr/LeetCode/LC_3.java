package com.lmr.LeetCode;

public class LC_3 {
	
	public int lengthOfLongestSubstring(String s) {
        int start,max;
        start=0;
        max=0;
        
        for(int i=0;i<s.length();i++){
            for(int j=start;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){
                    start=j+1;
                    break;
                }
            }
            if(i-start+1>max){
                max=i-start+1;
            }
        }
        
        return max;
    }
	
}
