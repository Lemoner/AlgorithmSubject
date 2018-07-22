package com.lmr.SwordOffer;

public class SO_50_FindNumsAppearOnce {

	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {

		if(array==null){
			return ;
		}
		
		int x,index;
		x=0;
		for(int i=0;i<array.length;i++){
			x^=array[i];
		}
		
		index=FindFirstOne(x);
		
		num1[0]=0;
		num2[0]=0;
		
		for(int i=0;i<array.length;i++){
			if(IsIndex(array[i],index)){
				num1[0]^=array[i];
			}
			else{
				num2[0]^=array[i];
			}
		}
		
	}

	private boolean IsIndex(int x, int index) {
		
		x=x>>index;
		
		return (x&1)==0;
	}

	private int FindFirstOne(int x) {

		int count=0;
		
		while((x&1)==0){
			x=x>>1;
			count++;
		}
		
		return count;
	}

}
