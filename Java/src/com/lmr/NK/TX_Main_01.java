package com.lmr.NK;

import java.util.Scanner;

public class TX_Main_01 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int k,a,x,b,y;
        
        k=sc.nextInt();
        a=sc.nextInt();
        x=sc.nextInt();
        b=sc.nextInt();
        y=sc.nextInt();
        
        int t,sa,sb;
        long sum=0,count;
        
        for(int i=0;i<=k/a;i++){
        	sa=i;
        	t=k-sa*a;
        	sb=t/b;
        	if(sa<=x&&sb<=y&&sb*b==t&&(sa>0||sb>0)){
        		count=1;
        		if(sa!=0){
        			count=count*Fun(x,sa)%1000000007;
        		}
        		if(sb!=0){
        			count=count*Fun(y,sb)%1000000007;
        		}
        		sum+=count%1000000007;
        	}
        }
        
        System.out.println(sum%1000000007);
    }

	private static long Fun(int a, int b) {
		
		long x=1,y=1;
		
		for(int i=0;i<b;i++){
			x=x*a;
			a--;
		}
		
		while(b>1){
			y=y*b;
			b--;
		}
		
		return x/y;
	}
}