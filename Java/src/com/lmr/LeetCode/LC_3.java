package com.lmr.LeetCode;

import java.util.HashMap;

public class LC_3 {
	
	public int lengthOfLongestSubstring1(String s) {
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
	
	public int lengthOfLongestSubstring2(String s) {
		int start,max;
        start=0;
        max=0;
        
        HashMap<Character, Integer> map=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
        	if(map.containsKey(s.charAt(i))){
        		start=map.get(s.charAt(i))+1;
        	}
        	map.put(s.charAt(i), i);
        	
        	max=Math.max(max, i-start+1);
        }
        
        return max;
    }
	
	
}
