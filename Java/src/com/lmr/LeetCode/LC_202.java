package com.lmr.LeetCode;

public class LC_202 {

	public boolean isHappy(int n) {
		
		int sum;
		int[] flag=new int[730];
		
		while(n!=1){
			sum=0;
			while(n!=0){
				sum+=(n%10)*(n%10);
				n=n/10;
			}
			n=sum;
			if(flag[n]==1){
				return false;
			}
			flag[n]=1;
		}
		
		return true;
	}
	
	public boolean isHappy1(int n) {
        //用 Linked List Cycle detection problem来解决这个问题，如果设计两个变量，一个每次计算两次fast，另一个计算一次slow，如果两个相等说明一
        //定会有循环,则返回false
        int fast=n;
        int slow=n;
        while(fast>1){
            slow=cal(slow);
        if(slow==1)
            return true;
        fast=cal(cal(fast));
        if(fast==1)
            return true;
        if(slow==fast)
            return false;
        }
        return true;
        
    }
    public int cal(int n){
        int remain=0;
        int sum=0;
        while(n>0){
            remain=n%10;
            sum+=remain*remain;
            n=n/10;
        }
        return sum;
    }
	
	public boolean isHappy2(int n) {
        while (n != 1 && n != 4) {
            int cur = n;
            n = 0;
            while (cur > 0) {
                int d = cur % 10;
                n += d*d;
                cur /= 10;
            }
        }

        return n == 1;
    }

	public static void main(String[] args) {
		
		LC_202 lc=new LC_202();
		
		int n=2;
		
		System.out.println(lc.isHappy(n));
		
	}
	
}
