package com.lmr.NK;

import java.util.Scanner;
import java.util.Stack;

public class ZJTD_Main_34 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n,t,count,flag;
		n=in.nextInt();
		
		count=0;
		flag=1;
		
		for(int i=0;i<n;i++){
			t=in.nextInt();
			
			if(flag==0){
				continue;
			}
			
			if(count==0){
				if((t&0b1000000)==0){
					count=0;
				}
				else if((t&0b11100000)==0b11000000){
					count=1;
				}
				else if((t&0b11110000)==0b11100000){
					count=2;
				}
				else if((t&0b11111000)==0b11110000){
					count=3;
				}
				else{
//					System.out.println(0);
//					return ;
					flag=0;
				}
			}
			else{
				if((t&0b11000000)!=0b10000000){
//					System.out.println(0);
//					return ;
					flag=0;
				}
				else{
					count--;
				}
			}
			 
		}
		
		if(flag==0||count>0){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }

	}

}
