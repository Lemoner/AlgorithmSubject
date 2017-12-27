package com.lmr.LeetCode;

public class LC_461 {

	public int hammingDistance(int x, int y) {
		
		int result,mx,my;
		
		result=0;
		
		while(x!=0&&y!=0){
			mx=x%2;
			my=y%2;
			if(mx!=my){
				result++;
			}
			x=x/2;
			y=y/2;
		}
		
		if(x==0){
			x=y;
		}
		
		while(x!=0){
			mx=x%2;
			if(mx==1){
				result++;
			}
			x=x/2;
		}
		
		return result;

	}
	
	public int hammingDistance1(int x, int y) {
		
		int result,num;
		
		num=x^y;//异运算
		result=0;
		
		while(num!=0){
			result+=num&1;//取 X 二进制数 的最低位.X 为偶数,最低位 0,X 为奇数,最低位 1
			num=num>>1;//x除2,<<为乘法
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		LC_461 lc=new LC_461();
		
		int x,y;
		
		x=7;
		y=12;
		
		System.out.println(lc.hammingDistance1(x, y));
		
	}

}
