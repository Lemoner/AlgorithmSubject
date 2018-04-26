package com.lmr.LeetCode;

public class LC_76 {
	public String minWindow(String s, String t) {

		int[] tar=new int[129];
		int[] temp=new int[129];
		int left,right;
		String result;
		
		left=-1;
		right=-1;
		result="";
		
		for(int i=0;i<t.length();i++){
			tar[t.charAt(i)]++;
		}
		
		for(int i=0;i<s.length();i++){
			if(tar[s.charAt(i)]>0){
				left=i;
				right=left;
				temp[s.charAt(i)]++;
				break;
			}
		}
		
		if(left!=-1){
			while(right<s.length()){
				if(IsContain(tar,temp)){
					if(result.length()==0||result.length()>=right-left+1){
						result=s.substring(left, right+1);
					}
					temp[s.charAt(left)]--;
					left++;
					while(left<right){
						if(tar[s.charAt(left)]>0){
							break;
						}
						else{
							left++;
						}
					}
				}
				else{
					right++;
					while(right<s.length()){
						if(tar[s.charAt(right)]>0){
							temp[s.charAt(right)]++;
							break;
						}
						else{
							right++;
						}
					}
				}
			}
		}
		
		return result;
	}

	private boolean IsContain(int[] tar, int[] temp) {
		
		for(int i=0;i<tar.length;i++){
			if(temp[i]<tar[i]){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		LC_76 lc=new LC_76();
		
		String s,t;
		
		s="aa";
		t="aa";
		
//		s = "ADOBECODEBANC";
//		t = "ABC";
		
		System.out.println(lc.minWindow(s, t));
		
	}
}
