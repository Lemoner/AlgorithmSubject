package com.lmr.NK;

import java.util.Scanner;

class TNode{
	
	int index;
	int flag=0;
	String name;
	TNode[] next=new TNode[10];
	
}

public class HY_Main_4 {
	
	static TNode root=new TNode();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int T, M, N;
		String str;

		T = in.nextInt();

		for(int k=0;k<T;k++){
			M = in.nextInt();
			in.nextLine();

			for (int i = 0; i < M; i++) {
				str = in.nextLine();
				Fun1(str);
			}

			N = in.nextInt();
			in.nextLine();

			for (int i = 0; i < N; i++) {
				str = in.nextLine();
				Fun2(str);
			}

		}

	}

	private static void Fun1(String str) {

		String[] s=str.split(" ");
		char[] c=s[0].toCharArray();
		int index;
		
		TNode rn=root;
		TNode p;
		
		for(char t:c){
			if(t=='x'){
				
				for(int i=0;i<10;i++){
					if(rn.next[i]==null){
						rn.next[i]=new TNode();
					}
					p=rn.next[i];
					if(p.flag!=2){
						p.flag=2;
						p.name=s[1];
					}
					p.index=i;
				}
				
				rn.flag=2;
				rn.name=s[1];
				break;
			}
			else{
				index=t-'0';
				if(rn.next[index]==null){
					rn.next[index]=new TNode();
				}
				rn=rn.next[index];
				if(rn.flag==0){
					rn.flag=1;
				}
				rn.index=index;
			}
		}
		
		if(c[c.length-1]!='x'){
			rn.flag=2;
			rn.name=s[1];
		}
		
	}

	private static void Fun2(String str) {
		
		char[] c=str.toCharArray();
		int index;
		
		TNode rn=root;
		
		for(char t:c){
			index=t-'0';
			rn=rn.next[index];
			if(rn==null||rn.flag==0){
				System.out.println("unknown");
				break;
			}
			else if(rn.flag==2){
				System.out.println(rn.name);
				break;
			}
		}
		
	}

}

