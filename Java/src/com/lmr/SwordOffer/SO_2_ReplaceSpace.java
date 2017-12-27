package com.lmr.SwordOffer;

public class SO_2_ReplaceSpace {

	public String replaceSpace(StringBuffer str) {
		
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(c!=' '){
				sb.append(c);
			}
			else{
				sb.append("%20");
			}
		}
		
		return sb.toString();

	}
	
	public static void main(String[] args) {
		
		SO_2_ReplaceSpace so=new SO_2_ReplaceSpace();
		
		StringBuffer str=new StringBuffer("we are happy");
		
		System.out.println(so.replaceSpace(str));
		
	}

}
