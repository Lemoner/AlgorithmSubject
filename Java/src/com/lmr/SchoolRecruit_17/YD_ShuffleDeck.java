package com.lmr.SchoolRecruit_17;

import java.util.Scanner;

public class YD_ShuffleDeck {

	public static void ShuffleDeck(int D[], int k){
		
		int DL=D.length;
		int T[]=new int[DL];
		
		while(k-->0){
			for(int i=0;i<DL/2;i++){
				T[i*2]=D[i];
			}
			for(int i=DL/2;i<DL;i++){
				T[2*(i-DL/2)+1]=D[i];
			}
			for(int i=0;i<DL;i++){
				D[i]=T[i];
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t>0){
        	int n,k;
        	n=scan.nextInt();
        	k=scan.nextInt();
        	int D[]=new int[2*n];
        	for(int i=0;i<2*n;i++){
        		D[i]=scan.nextInt();
        	}
        	ShuffleDeck(D, k);
    		for(int i=0;i<2*n-1;i++){
        		System.out.print(D[i]+" ");
        	}
    		System.out.print(D[2*n-1]);
            System.out.println();
        	t--;
        }
		
	}
	
}
