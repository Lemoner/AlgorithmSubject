package com.lmr.SwordOffer;

import java.util.ArrayList;

public class SO_51_FindNumbersWithSum {
	
	public static void main(String[] args) {
		
		SO_51_FindNumbersWithSum so=new SO_51_FindNumbersWithSum();
		int[] array=new int[]{1,2,4,7,11,15};
		int sum=15;
		System.out.println(so.FindNumbersWithSum(array, sum).toString());
		
	}

	public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {

		if(array==null||array.length<2){
			return new ArrayList<>();
		}
		
		ArrayList<Integer> result=new ArrayList<>();
		
		int start,end,s,p,s1,s2;
		start=0;
		end=array.length-1;
		p=0;
		s1=0;
		s2=0;
		
		while(start<end){
			s=array[start]+array[end];
			if(s==sum){
				if(p==0||p>array[start]*array[end]){
					p=array[start]*array[end];
					s1=array[start];
					s2=array[end];
				}
				start++;
			}
			else if(s<sum){
				start++;
			}
			else{
				end--;
			}
		}
		
		if(p!=0){
			result.add(s1);
			result.add(s2);
		}
		
		return result;
		
	}

}
