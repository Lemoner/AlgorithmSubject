package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC_17 {
	
	private List<String> resultlist=new ArrayList<String>();
	private Character[][] fixdigit={{'0'},{'1'},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
	int index;

	public List<String> letterCombinations(String digits) {
		
		if(digits.length()<=0){
			return resultlist;
		}
		
		index=0;
	
		StringBuffer sb=new StringBuffer();
		DFS(digits,sb);
		
		return resultlist;
        
    }
	
	public void DFS (String digits,StringBuffer sb){
		
		if(index==digits.length()){
			resultlist.add(sb.toString());
		}
		else{
			int digit=digits.charAt(index)-'0';
			for(int i=0;i<fixdigit[digit].length;i++){
				sb.append(fixdigit[digit][i]);
				index++;
				DFS(digits,sb);
				index--;
				sb.deleteCharAt(index);
			}
		}
		
	}
	
	public List<String> letterCombinations2(String digits) {
		
		List<String> result = new ArrayList<>();
        if (digits.length() == 0) {
            return result;
        }
        String[] map = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        result.add("");
        
        for (int i = 0; i < digits.length(); i++) {
            List<String> tmp = new ArrayList<>();
            int digit = digits.charAt(i) - '0';
            char[] chars = map[digit].toCharArray();

            for (char c : chars) {
                for (String str : result) {
                    tmp.add(str + c);
                }
            }
            result = tmp;
        }
        
        return result;
        
    }
	
	public static void main(String[] args) {
		
		LC_17 lc=new LC_17();
		
		String s="";
		
		System.out.println(lc.letterCombinations(s));
		
	}
	
}
