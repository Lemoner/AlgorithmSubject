package com.lmr.common;

public class LongestNoRepeatSubString {
	
	public static void main(String[] args) {
		
		LongestNoRepeatSubString lns=new LongestNoRepeatSubString();
		String str="arafaeiofnwecinwenaceuinceirafnbulbnbwuijb";
		System.out.println(lns.Fun(str));
		System.out.println(lns.Fun1(str));
		
	}

	public int Fun(String str){
		
		int[] a=new int[26];
		int max,count,start,end,t;
		max=0;
		count=0;
		start=0;
		end=0;
		
		while(end<str.length()){
			t=str.charAt(end)-'a';
			if(a[t]!=1){
				count++;
				a[t]=1;
			}
			else{
				max=Math.max(max, count);
				while(str.charAt(start)!=str.charAt(end)){
					a[str.charAt(start)-'a']=0;
					start++;
					count--;
				}
				start++;
			}
			end++;
		}
		max=Math.max(max, count);
		
		return max;
		
	}
	
	public int Fun1(String str){
		
		int[] a=new int[26];
		int max,count,index;
		
		max=0;
		count=0;
		
		for(int i=0;i<26;i++){
			a[i]=-1;
		}
		
		for(int i=0;i<str.length();i++){
			index=a[str.charAt(i)-'a'];
			if(index<0||i-index>count){
				count++;
			}
			else{
				max=Math.max(max, count);
				count=i-index;
			}
			a[str.charAt(i)-'a']=i;
		}
		
		max=Math.max(max, count);
		
		return max;
		
	}
	
}
