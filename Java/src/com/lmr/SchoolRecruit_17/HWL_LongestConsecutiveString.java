package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class HWL_LongestConsecutiveString {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String str=scanner.nextLine();
		char[] s=str.toCharArray();
		int ml,mr,mc,l,r;
		
		l=-1;
		r=-1;
		ml=-1;
		mr=-1;
		mc=-1;
		for(int i=0;i<s.length;i++){
			if(s[i]>='0'&&s[i]<='9'){
				if(l==-1){
					l=i;
				}
				r=i;
			}
			else{
				if(l!=-1){
					if(mc<(r-l+1)){
						ml=l;
						mr=r;
						mc=mr-ml+1;
					}
					l=-1;
				}
			}
		}
		if(l!=-1&&mc<(r-l+1)){
			ml=l;
			mr=r;
			mc=mr-ml+1;
			l=-1;
		}
		
		System.out.println(str.substring(ml, mr+1));
		
	}
	
}
