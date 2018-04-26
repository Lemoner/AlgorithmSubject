package com.lmr.common;

import java.util.Arrays;

public class KMP {
	
	public static int KMP(String str, String model){
		
		char[] s=str.toCharArray();
		char[] m=model.toCharArray();
		int[] next=new int[m.length+1];
		int i,j;
		
		i=1;
		j=1;
		
		getNext(model, next);
		System.out.println(Arrays.toString(next));
		
		while(i<s.length&&j<=m.length){
			if(j==0||s[i-1]==m[j-1]){
				i++;
				j++;
			}
			else{
				j=next[j];
			}
		}
		
		if(j>m.length){
			return i-m.length-1;
		}
		else{
			return -1;
		}
		
	}

	public static void getNext(String str, int next[]){
		
		char[] s=str.toCharArray();
		int i,j;
		
		i=1;
		j=0;
		next[1]=0;
		
		while(i<s.length){
			if(j==0||s[i-1]==s[j-1]){
				i++;
				j++;
				next[i]=j;
			}
			else{
				j=next[j];
			}
		}
		
	}
	
	public static int KMPByZero(String str, String model){
		
		char[] s=str.toCharArray();
		char[] m=model.toCharArray();
		int[] next=new int[m.length];
		int i,j;
		
		i=0;
		j=0;
		
		getNextByZero(model, next);
		System.out.println(Arrays.toString(next));
		
		while(i<s.length&&j<m.length){
			if(j==-1||s[i]==m[j]){
				i++;
				j++;
			}
			else{
				j=next[j];
			}
		}
		
		if(j>=m.length){
			return i-m.length;
		}
		else{
			return -1;
		}
		
	}
	
	public static void getNextByZero(String str, int next[]){
		
		char[] s=str.toCharArray();
		int i,j;
		
		i=0;
		j=-1;
		next[0]=-1;
		
		while(i<s.length-1){
			if(j==-1||s[i]==s[j]){
				i++;
				j++;
				next[i]=j;
			}
			else{
				j=next[j];
			}
		}
		
	}
	
	public static void main(String[] args) {
		
//		String str="acabaabaabcacaabc";
//		String model="ac";
		
		String str="aaaaa";
		String model="bba";
		
		System.out.println(KMPByZero(str, model));
		
	}
	
	
}
