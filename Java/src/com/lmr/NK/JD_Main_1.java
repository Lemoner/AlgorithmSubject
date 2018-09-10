package com.lmr.NK;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Data{
	int a;
	int b;
	int c;
	public Data(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public String toString() {
		return "Data [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
}

public class JD_Main_1 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n,a,b,c,result;
		n=scanner.nextInt();
		
		ArrayList<Data> list=new ArrayList<>(n+1);
		
		for(int i=0;i<n;i++){
			a=scanner.nextInt();
			b=scanner.nextInt();
			c=scanner.nextInt();
			list.add(new Data(a, b, c));
		}
		
//		list.sort(new Comparator<Data>() {
//
//			@Override
//			public int compare(Data d1, Data d2) {
//				if(d1.a==d2.a){
//					if(d1.b==d2.b){
//						return d1.c>d2.c?1:-1;
//					}
//					return d1.b>d2.b?1:-1;
//				}
//				return d1.a>d2.a?1:-1;
//			}
//		});
		
		result=0;
//		for(int i=list.size()-1;i>=0;i--){
//			for(int j=i-1;j>=0;j--){
//				Data d1=list.get(i);
//				Data d2=list.get(j);
//				if(d1.a>d2.a&&d1.b>d2.b&&d1.c>d2.c){
//					result++;
//				}
//			}
//		}
		for(int i=0;i<list.size();i++){
			for(int j=0;j<list.size();j++){
				Data d1=list.get(i);
				Data d2=list.get(j);
				if(d2.a>d1.a&&d2.b>d1.b&&d2.c>d1.c){
					result++;
					break;
				}
			}
		}
		
		System.out.println(result);
		
	}
	
}
