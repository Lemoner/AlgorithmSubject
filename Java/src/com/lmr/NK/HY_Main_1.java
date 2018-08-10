package com.lmr.NK;

import java.util.Scanner;

public class HY_Main_1 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int t,n;
        t=in.nextInt();
        
        for(int k=0;k<t;k++){
        	n=in.nextInt();
        	System.out.println(fun(n));
        }
        
    }

	private static int fun(double n) {
		
		double t;
		double sum;
		
		sum=0;
		
		if(n>5000){
			n-=5000;
			t=n;
			if(n<=3000){
				sum+=n*0.03;
			}
			else{
				sum+=3000*0.03;
				n-=3000;
				if(t<=12000){
					sum+=n*0.1;
				}
				else{
					sum+=9000*0.1;
					n-=9000;
					if(t<=25000){
						sum+=n*0.2;
					}
					else{
						sum+=13000*0.2;
						n-=13000;
						if(t<=35000){
							sum+=n*0.25;
						}
						else{
							sum+=10000*0.25;
							n-=10000;
							if(t<=55000){
								sum+=n*0.3;
							}
							else{
								sum+=20000*0.3;
								n-=20000;
								if(t<=80000){
									sum+=n*0.35;
								}
								else{
									sum+=25000*0.35;
									n-=25000;
									if(t>80000){
										sum+=n*0.45;
									}
								}
							}
						}
					}
				}
			}
		}
		
		int result;
		result=(int) sum;
		if(sum+0.5>=result+1){
			result+=1;
		}
		
		return result;
	}
	
}
