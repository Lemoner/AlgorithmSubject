package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class XM_PhoneNumberAvatar {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n;
		n=scanner.nextInt();
		scanner.nextLine();
		
		for(int x=0;x<n;x++){
			int[] a=new int[26];
			int[] d=new int[10];
			String[] s=new String[]{"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
			int t;
			String str=scanner.nextLine();
			
			for(char c:str.toCharArray()){
				a[c-'A']++;
			}
			
			t=a['Z'-'A'];
			if(t>0){
				d[0]=t;
				for(char c:s[0].toCharArray()){
					a[c-'A']-=t;
				}
			}
			
			t=a['W'-'A'];
			if(t>0){
				d[2]=t;
				for(char c:s[2].toCharArray()){
					a[c-'A']-=t;
				}
			}
			
			t=a['U'-'A'];
			if(t>0){
				d[4]=t;
				for(char c:s[4].toCharArray()){
					a[c-'A']-=t;
				}
			}
			
			t=a['X'-'A'];
			if(t>0){
				d[6]=t;
				for(char c:s[6].toCharArray()){
					a[c-'A']-=t;
				}
			}
			
			t=a['G'-'A'];
			if(t>0){
				d[8]=t;
				for(char c:s[8].toCharArray()){
					a[c-'A']-=t;
				}
			}
			
			t=a['O'-'A'];
			if(t>0){
				d[1]=t;
				for(char c:s[1].toCharArray()){
					a[c-'A']-=t;
				}
			}
			
			t=a['R'-'A'];
			if(t>0){
				d[3]=t;
				for(char c:s[3].toCharArray()){
					a[c-'A']-=t;
				}
			}
			
			t=a['F'-'A'];
			if(t>0){
				d[5]=t;
				for(char c:s[5].toCharArray()){
					a[c-'A']-=t;
				}
			}
			
			t=a['S'-'A'];
			if(t>0){
				d[7]=t;
				for(char c:s[7].toCharArray()){
					a[c-'A']-=t;
				}
			}
			
			t=a['I'-'A'];
			if(t>0){
				d[9]=t;
				for(char c:s[9].toCharArray()){
					a[c-'A']-=t;
				}
			}
			
			for(int i=8;i<d.length;i++){
				if(d[i]>0){
					t=i-8;
					for(int k=0;k<d[i];k++){
						System.out.print(t);
					}
				}
			}
			
			for(int i=0;i<8;i++){
				if(d[i]>0){
					t=i+2;
					for(int k=0;k<d[i];k++){
						System.out.print(t);
					}
				}
			}
			
			System.out.println();
			
		}
		
	}
	
}
