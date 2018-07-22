package com.lmr.SwordOffer;

public class SO_41_NumberOf1Between1AndN {
	
	public static void main(String[] args) {
		
		SO_41_NumberOf1Between1AndN so=new SO_41_NumberOf1Between1AndN();
		int n=1;
		System.out.println(so.NumberOf1Between1AndN_Solution1(n));
		
	}
	
	public int NumberOf1Between1AndN_Solution1(int n) {
	    
		if(n<=0){
			return 0;
		}
		
		int sum,a,b,c,t;
		sum=0;
		t=1;
		
		while(n>=t){
			a=n/t/10;
			b=n/t%10;
			c=n%t;
			
			if(b<1){
				sum+=a*t;
			}
			else if(b==1){
				sum+=a*t+c+1;
			}
			else{
				sum+=(a+1)*t;
			}
			
			t*=10;
		}
		
		return sum;
		
    }

	public int NumberOf1Between1AndN_Solution(int n) {
	    
		if(n<=0){
			return 0;
		}
		
		return Fun(String.valueOf(n).toCharArray(),0);
		
    }

	private int Fun(char[] s, int index) {
		
		int t,len,x,c1,c2,c3;
		t=s[index]-'0';
		len=s.length;
		
		if(index==len){
			return 0;
		}
		if(index==len-1){
			if(t==0){
				return 0;
			}
			else{
				return 1;
			}
		}
		if(t==0){
			return Fun(s, index+1);
		}
		
		if(t==1){
			x=0;
			for(int i=index+1;i<len;i++){
				x=x*10+(s[i]-'0');
			}
			c1=x+1;
		}
		else{
			c1=(int) Math.pow(10, len-index-1);
		}
		
		c2=t*(len-index-1)*(int) Math.pow(10, len-index-2);
		c3=Fun(s, index+1);
		
		return c1+c2+c3;
	}

}
