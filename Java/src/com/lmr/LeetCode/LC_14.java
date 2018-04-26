package com.lmr.LeetCode;

public class LC_14 {
	public String longestCommonPrefix(String[] strs) {
		
		if(strs.length==0){
			return "";
		}
		else if(strs.length==1){
			return strs[0];
		}
		
		int end,index;
		
		end=strs[0].length();
		for(int i=1;i<strs.length;i++){
			index=0;
			while(index<strs[i].length()&&index<end){
				if(strs[0].charAt(index)==strs[i].charAt(index)){
					index++;
				}
				else{
					break;
				}
			}
			end=index;
		}
		
		return strs[0].substring(0, end);

	}
	
	public String longestCommonPrefix1(String[] strs) {

		if(strs==null || strs.length==0) return "";
        String prefix = strs[0];
        int i=1;
        while(i<strs.length){
            while(strs[i].indexOf(prefix)!=0)
                prefix = prefix.substring(0,prefix.length()-1);
            i++;
        }
        return prefix;
	}
}
