package com.lmr.SwordOffer;

import java.util.Arrays;

public class SO_73_isContinuous {
	
	public static void main(String[] args) {
		
	}

    public boolean isContinuous(int [] numbers) {

    	if(numbers==null||numbers.length==0){
    		return false;
    	}
    	
    	Arrays.sort(numbers);
    	
    	int zero,count,index;
    	
    	zero=count=index=0;
    	
    	while(numbers[index]==0){
    		zero++;
    		index++;
    	}
    	
    	for(index++;index<numbers.length;index++){
    		if(numbers[index]==numbers[index-1]){
    			return false;
    		}
    		count+=numbers[index]-numbers[index-1]-1;
    	}
    	
    	return zero>=count?true:false;
    	
    }
	
}
