package com.lmr.SwordOffer;

public class SO_44_GetUglyNumber {

	public int GetUglyNumber_Solution(int index) {
		
		if(index==0){
			return 0;
		}
		
		int[] a=new int[index];
		int t2,t3,t5,count;
		
		t2=t3=t5=count=0;
		
		a[count++]=1;
		
		while(count<index){
			a[count]=Math.min(a[t2]*2, Math.min(a[t3]*3, a[t5]*5));
			while(a[t2]*2<=a[count]){
				t2++;
			}
			while(a[t3]*3<=a[count]){
				t3++;
			}
			while(a[t5]*5<=a[count]){
				t5++;
			}
			count++;
		}
		
        return a[index-1];
    }
	
}
