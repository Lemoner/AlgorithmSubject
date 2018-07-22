package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class SLL_StrongestBrain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		while(scanner.hasNext()){
			
			int forward,backward,t;
			String str,str1,str2;
			StringBuilder sb=new StringBuilder();
			str=scanner.nextLine().trim();
			str1=scanner.nextLine().trim();
			str2=scanner.nextLine().trim();
			
			forward=0;
			if((t=str.indexOf(str1))>-1){
				if(t+str1.length()<str.length()&&str.substring(t+str1.length()).contains(str2)){
					forward=1;
				}
			}
			
			backward=0;
			for(int i=str.length()-1;i>=0;i--){
				sb.append(str.charAt(i));
			}
			str=sb.toString();
			if((t=str.indexOf(str1))>-1){
				if(t+str1.length()<str.length()&&str.substring(t+str1.length()).contains(str2)){
					backward=1;
				}
			}
			
			if(forward==1&&backward==1){
				System.out.println("both");
			}
			else if(forward==1&&backward==0){
				System.out.println("forward");
			}
			else if(forward==0&&backward==1){
				System.out.println("backward");
			}
			else{
				System.out.println("invalid");
			}
			
		}
		
	}
	
}
