package com.lmr.LeetCode;

public class LC_122 {
	public int maxProfit(int[] prices) {
		
		if(prices==null||prices.length==0){
			return 0;
		}
		
		int result,min,max,flag;
		
		result=0;
		min=prices[0];
		max=0;
		flag=0;
		
		for(int i=1;i<prices.length;i++){
			if(flag==1){
				if(prices[i]>=max){
					max=prices[i];
				}
				else{
					result+=max-min;
					min=prices[i];
					flag=0;
				}
			}
			else{
				if(prices[i]<=min){
					min=prices[i];
				}
				else{
					max=prices[i];
					flag=1;
				}
			}
		}
		if(flag==1){
			result+=max-min;
		}
		
		return result;

	}
	
	public int maxProfit2(int[] prices) {
        if(prices==null || prices.length==0){
        	return 0;
        }
        int maxPro = 0;
        for(int i=1;i<prices.length;i++){
        	if(prices[i]>prices[i-1]){
        		maxPro+=prices[i]-prices[i-1];
        	}
        }
    	return maxPro;
    }
}
