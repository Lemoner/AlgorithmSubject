package com.lmr.LeetCode;

import java.util.Arrays;

public class LC_338 {

	public int[] countBits(int num) {

		int result[]=new int[num+1];
		
		int count,x,t;
		
		for(int i=0;i<=num;i++){
			count=0;
			x=i;
			while(x!=0){
				t=x%2;
				if(t==1){
					count++;
				}
				x=x/2;
			}
			result[i]=count;
		}
		
		return result;
		
	}
	
	public int[] countBits1(int num) {
		
		if(num==0){
			return new int[0];
		}
		
		int result[]=new int[num+1];
		int t;
		
		result[0]=0;
		
		if(num==0){
			return result;
		}
		
		result[1]=1;
		t=1;
		
		for(int i=2;i<=num;i++){
			if(i%t==0){
				t*=2;
			}
			result[i]=result[i-t]+1;
		}
		
		return result;
		
	}
	
	public int[] countBits3(int num) {

        int [] arr = new int[num + 1];
        arr[0] = 0;

        for(int i = 1; i <= num; i++) {
            arr[i] = arr[i / 2] + (i & 1);
        }

        return arr;
    }
	
	public static void main(String[] args) {
		
		LC_338 lc=new LC_338();
		
		int num=11;
		
		System.out.println(Arrays.toString(lc.countBits1(num)));
		
	}

}
