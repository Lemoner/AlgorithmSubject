package com.lmr.SwordOffer;

public class SO_75_LastRemaining {
	
	public static void main(String[] args) {
		
		SO_75_LastRemaining so=new SO_75_LastRemaining();
		
		int n=7,m=2;
		
		so.LastRemaining_Solution(n, m);
	}

	public int LastRemaining_Solution(int n, int m) {
		
		if(n<1||m<1){
			return -1;
		}
		
		int last=0,t=1;
		for(int i=2;i<=n;i++){
			last=(last+m)%i;
			System.out.println(t+++" "+last);
		}
		
		return last;
		
	}

}
