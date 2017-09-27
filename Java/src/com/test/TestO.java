package com.test;

import java.util.List;

public class TestO {

	public List<String> A(int n){
		
		int[] a={0,1,-1,-1,-1,-1,9,-1,8,6};
		int x,y,t,num,flag;
		
		for(int i=(int) Math.pow(10, n-1);i<(int) Math.pow(10, n);i++){

			t=n;
			num=i;
			flag=1;
			
			while(num>=10){
				x=num/((int) Math.pow(10, t-1));
				y=num%10;
				if(a[x]!=-1&&a[y]!=-1&&a[x]==y){
					num=num%((int) Math.pow(10, t-1));
					num=num/10;
					t--;
				}
				else{
					flag=0;
					break;
				}
			}
			
			if(flag!=0){
				if(a[num]!=-1&&num!=6&&num!=9){
					System.out.println(i);
				}
			}
			
		}
		
		return null;
		
	}
	
	public static void main(String[] args) {
		
		TestO test=new TestO();
		test.A(4);
		
	}
	
	
}
