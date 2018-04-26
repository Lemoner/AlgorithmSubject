package com.test;

public class TestThree {

	public static void main(String[] args) {
		
		
		for(int a1=1;a1<100;a1++){
			for(int a2=1;a2<100;a2++){
				for(int b1=1;b1<100;b1++){
					for(int b2=1;b2<100;b2++){
						
						int x1,x2,x3,min;
						x1=a1*a2+b1*b2;
						x2=a1*b1+a2*b2;
						x3=b1*b2+a1*a2;
						min=Math.min(x1, Math.min(x2, x3));
						
						int a1a2,a1b1,b1b2,temp;
						a1a2=a1*a2;
						a1b1=a1*b1;
						b1b2=b1*b2;
						
						if(a1a2<a1b1&&a1a2<b1b2){
							temp=a1*a2+b1*b2;
						}
						else if(a1b1<a1a2&&a1b1<b1b2){
							temp=a1*b1+a2*b2;
						}
						else{
							temp=b1*b2+a1*a2;
						}
						
						System.out.println(a1+" "+a2+" "+b1+" "+b2+" "+min+" "+temp+" "+(min==temp));
						
					}
				}
			}
		}
		
		
	}
	
}
