package com.lmr.LeetCode;

import java.util.Arrays;

public class LC_66 {
	public int[] plusOne(int[] digits) {
		
		int index,flag;
		index=digits.length-1;
		flag=0;
		digits[index]=digits[index]+1;
		while(index>=0){
			if(digits[index]+flag>=10){
				digits[index]=(digits[index]+flag)%10;
				flag=1;
			}
			else{
				digits[index]=(digits[index]+flag)%10;
				flag=0;
			}
			index--;
		}
		
		if(flag==1){
			int[] r=new int[digits.length+1];
			index=0;
			
			r[index++]=1;
			while(index<r.length){
				r[index]=digits[index-1];
				index++;
			}
			
			return r;
			
		}
		else{
			index=0;
			
			while(index<digits.length){
				if(digits[index]!=0){
					break;
				}
				index++;
			}
			
			if(index==digits.length){
				index--;
			}
			
			return Arrays.copyOfRange(digits, index, digits.length);
		}
		
	}
	
	public int[] plusOne1(int[] digits) {
        
	    int n = digits.length;
	    for(int i=n-1; i>=0; i--) {
	        if(digits[i] < 9) {
	            digits[i]++;
	            return digits;
	        }
	        
	        digits[i] = 0;
	    }
	    
	    int[] newNumber = new int [n+1];
	    newNumber[0] = 1;
	    
	    return newNumber;
	}
	
	public static void main(String[] args) {
		
		LC_66 lc=new LC_66();
		
		int[] digits={0,9,0};
		
		System.out.println(Arrays.toString(lc.plusOne1(digits)));
		
	}
}
