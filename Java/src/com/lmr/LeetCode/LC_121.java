package com.lmr.LeetCode;

public class LC_121 {

	public int maxProfit(int[] prices) {
		
		int maxresult,minprices;
		
		if(prices.length==0){
			return 0;
		}
		
		maxresult=0;
		minprices=prices[0];
		for(int i=1;i<prices.length;i++){
			if(prices[i]>minprices){
				maxresult=Math.max(maxresult, prices[i]-minprices);
			}
			else{
				minprices=prices[i];
			}
		}
		
		return maxresult;

	}

}
