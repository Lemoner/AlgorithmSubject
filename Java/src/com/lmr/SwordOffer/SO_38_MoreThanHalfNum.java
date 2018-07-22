package com.lmr.SwordOffer;

public class SO_38_MoreThanHalfNum {

	public int MoreThanHalfNum_Solution(int[] array) {
		
		if(array==null||array.length<=0){
			return 0;
		}
		
		int r,c;
		r=array[0];
		c=1;
		for(int i=1;i<array.length;i++){
			if(c==0){
				r=array[i];
				c=1;
			}
			else if(r==array[i]){
				c++;
			}
			else{
				c--;
			}
		}
		
		c=0;
		for(int i=0;i<array.length;i++){
			if(r==array[i]){
				c++;
			}
		}
		if(c*2<=array.length){
			r=0;
		}
		
		return r;
		
	}

}
