package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class SH_ColoredGemstoneNecklace {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String str;
		char[] c;
		int[] t;
		int l,count,start,end;
		while(scanner.hasNext()){
			str=scanner.nextLine();
			l=str.length();
			str=str+str;
			c=str.toCharArray();
			
			t=new int[5];
			start=0;
			end=0;
			count=0;
			
			while(end<c.length){
				if(c[end]>='A'&&c[end]<='E'){
					start=end;
					break;
				}
				end++;
			}
			while(end<c.length){
				while(end<c.length&&(t[0]==0||t[1]==0||t[2]==0||t[3]==0||t[4]==0)){
					if(c[end]>='A'&&c[end]<='E'){
						t[c[end]-'A']++;
					}
					end++;
				}
				while(t[0]>0&&t[1]>0&&t[2]>0&&t[3]>0&&t[4]>0){
					if(c[start]>='A'&&c[start]<='E'){
						count=Math.max(count, l-end+start);
						t[c[start]-'A']--;
					}
					start++;
				}
			}
			
			System.out.println(count);
			
		}
		
	}
	
}
