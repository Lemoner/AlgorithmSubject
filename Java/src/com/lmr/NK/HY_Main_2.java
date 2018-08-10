package com.lmr.NK;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HY_Main_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n;
		n = in.nextInt();
		in.nextLine();

		String str;

		for (int i = 0; i < n; i++) {
			str = in.nextLine();
			
			if (fun1(str) && fun2(str) && fun3(str) && fun4(str) && fun5(str)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}

	}

	private static boolean fun1(String str) {

		if (str.length() < 8) {
			return false;
		}

		return true;
	}

	private static boolean fun2(String str) {
		
		char[] c = str.toCharArray();
		
		int x=0;
		
		for(char t:c){
			if(IsFun1(t)){
				x=1;
				break;
			}
		}
		if(x!=1){
			return false;
		}
		for(char t:c){
			if(IsFun2(t)){
				x=2;
				break;
			}
		}
		if(x!=2){
			return false;
		}
		for(char t:c){
			if(IsFun3(t)){
				x=3;
				break;
			}
		}
		if(x!=3){
			return false;
		}
		for(char t:c){
			if(IsFun4(t)){
				x=4;
				break;
			}
		}
		if(x!=4){
			return false;
		}
		
		return true;
	}

	private static boolean fun3(String str) {

		char[] c = str.toCharArray();
		
		List<Character> list=new ArrayList<>();
		
		int k;
		
		for (int i = 0; i < c.length; i++) {
			if(IsFun3(c[i])){
				list.add(c[i]);
				k=list.size();
				if(k>=3){
					if(list.get(k-1)-list.get(k-2)==list.get(k-2)-list.get(k-3)){
						return false;
					}
				}
			}
			else{
				list=new ArrayList<>();
			}
		}
		
		return true;
	}

	private static boolean fun4(String str) {

		char[] c = str.toCharArray();

		int k;

		List<Character> list1=new ArrayList<>();
		List<Character> list2=new ArrayList<>();

		for (int i = 0; i < c.length; i++) {
			if(IsFun1(c[i])){
				list1.add(c[i]);
				list2=new ArrayList<>();
				k=list1.size();
				if(k>=3){
					if(list1.get(k-1)-list1.get(k-2)==1&&list1.get(k-2)-list1.get(k-3)==1){
						return false;
					}
				}
			}
			else if(IsFun2(c[i])){
				list2.add(c[i]);
				list1=new ArrayList<>();
				k=list2.size();
				if(k>=3){
					if(list2.get(k-1)-list2.get(k-2)==1&&list2.get(k-2)-list2.get(k-3)==1){	
						return false;
					}
				}
			}
			else{
				list1=new ArrayList<>();
				list2=new ArrayList<>();
			}
		}

		return true;
	}

	private static boolean fun5(String str) {

		String[] s = new String[] { "password", "admin", "qwerty", "hello", "iloveyou", "112233" };

		for (String c : s) {
			if (str.contains(c)) {
				return false;
			}
		}

		return true;
	}

	private static boolean IsFun1(char c) {

		if ('a' <= c && 'z' >= c) {
			return true;
		}

		return false;
	}

	private static boolean IsFun2(char c) {

		if ('A' <= c && 'Z' >= c) {
			return true;
		}

		return false;
	}

	private static boolean IsFun3(char c) {

		if ('0' <= c && '9' >= c) {
			return true;
		}

		return false;
	}

	private static boolean IsFun4(char c) {

		char[] tc=new char[]{'!','@','#','$','%','^','&','*','(',')','_','-','=','+','[',']','{','}',',','.','<','>','/','?'};
		
		for(char t:tc){
			if(t==c){
				return true;
			}
		}

		return false;
	}

}
