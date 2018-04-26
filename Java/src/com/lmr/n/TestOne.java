package com.lmr.n;

import java.util.Scanner;

public class TestOne {
	
	static int n;
	static int[] x1,x2,y1,y2;
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        x1=new int[n];
        x2=new int[n];
        y1=new int[n];
        y2=new int[n];
        
        for(int i = 0; i < n; i++){
        	x1[i]=sc.nextInt();
        	x2[i]=sc.nextInt();
        	y1[i]=sc.nextInt();
        	y2[i]=sc.nextInt();
        } 
    }
}
