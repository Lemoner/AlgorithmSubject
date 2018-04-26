package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class ZBJ_NumberStrings {
	
	public static boolean Judge(int a, int b) {
		
		String sa=a+"";
		String sb=b+"";
		int index=0;
		char ca,cb;
		
		do{
			ca=sa.charAt(index%sa.length());
			cb=sb.charAt(index%sb.length());
			if(ca==cb){
				index++;
			}
			else if(ca<cb){
				return true;
			}
			else{
				return false;
			}
		}while(index%sa.length()!=0||index%sb.length()!=0);
		
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int N;
		int[] a;
		
		N=scanner.nextInt();
		
		a=new int[N];		
		for(int i=0;i<N;i++){
			a[i]=scanner.nextInt();
		}
		
		int temp;
		
		for(int i=0;i<N;i++){
			for(int j=1;j<N-i;j++){
				if(Judge(a[j-1],a[j])){
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<N;i++){
			System.out.print(a[i]);
		}
		
		System.out.println();
			
		
	}

}
