package com.lmr.n;

import java.util.Scanner;

public class TestTwo {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int count = 0;
        for(int i=n;i>=k;i--){
        	count+=n-i;
        	if(i%(i/2+1)>=k){
        		count+=i%(i/2+1)-k+1;
        	}
        	for(int j=i/2;j>0;j--){
        		if((i % j) >= k) count++;
        	}
        }
        System.out.println(count);
        
        n=30;
        for(int i=n;i>1;i--){
        	System.out.println(i+" "+n%i);
        }
        System.out.println("----------------");
        n=100;
        for(int i=n;i>1;i--){
        	System.out.println(i+" "+n%i);
        }
        
    }
}