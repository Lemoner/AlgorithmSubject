package com.lmr.LeetCode;

public class LC_309 {

	public int maxProfit(int[] prices) {
		
		if(prices==null||prices.length<=0){
			return 0;
		}
		
		int a[]=new int[prices.length];
		int b[]=new int[prices.length];
		int c[]=new int[prices.length];
		
		a[0]=0;
		b[0]=-prices[0];
		c[0]=Integer.MIN_VALUE;
		
		for(int i=1;i<prices.length;i++){
			a[i]=Math.max(a[i-1], c[i-1]);
			b[i]=Math.max(a[i-1]-prices[i], b[i-1]);
			c[i]=b[i-1]+prices[i];
		}
		
		return Math.max(a[prices.length-1], c[prices.length-1]);

	}
	
	public int maxProfit1(int[] prices) {

		if (prices == null || prices.length <= 0) {
			return 0;
		}
		
		int buy[]=new int[prices.length];
		int sell[]=new int[prices.length];
		int rest[]=new int[prices.length];
		
		buy[0]=-prices[0];
		sell[0]=0;
		rest[0]=0;
		
//		for(int i=1;i<prices.length;i++){
//			buy[i]=Math.max(rest[i-1]-prices[i], buy[i-1]);
//			sell[i]=Math.max(buy[i-1]+prices[i], sell[i-1]);
//			rest[i]=Math.max(sell[i-1], rest[i-1]);
//		}
		
		for(int i=1;i<prices.length;i++){
			buy[i]=Math.max(rest[i-1]-prices[i], buy[i-1]);
			sell[i]=Math.max(buy[i-1]+prices[i], sell[i-1]);
			rest[i]=sell[i-1];
		}
		
		return sell[prices.length-1];

	}
	
	public int maxProfit2(int[] prices) {

		if (prices == null || prices.length <= 0) {
			return 0;
		}
		
		int buy,sell,leastsell,t;
		
		buy=-prices[0];
		sell=0;
		leastsell=0;
		
		for(int i=1;i<prices.length;i++){
			t=sell;
			sell=Math.max(buy+prices[i], sell);
			buy=Math.max(leastsell-prices[i], buy);
			leastsell=t;
		}
		
		return sell;
		
	}
	
	public static void main(String[] args) {
		
		LC_309 lc=new LC_309();
		
		int prices[]={1,2,3,0,2};
		
		System.out.println(lc.maxProfit2(prices));
		
	}
	
}
