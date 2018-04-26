package com.lmr.SwordOffer;

public class SO_6_MinNumberInRotateArray {

	public int minNumberInRotateArray(int [] array) {
		if(array.length==0){
            return 0;
        }
	    int min=Integer.MAX_VALUE;
	    for(int i=0;i<array.length;i++){
	    	if(array[i]<min){
	    		min=array[i];
	    	}
	    }
	    return min;
    }
	
	public int minNumberInRotateArray1(int [] array) {
		if(array.length==0){
            return 0;
        }
		int left,right,mid;
		left=0;
		right=array.length-1;
		mid=0;
		while(left<=right){
			mid=(left+right)/2;
			if(array[mid]<array[mid-1]&&array[mid]<array[mid+1]){
				break;
			}
			if(array[mid]>array[right]){
				left=mid+1;
			}
			else{
				right=mid-1;
			}
		}
		return array[mid];
	}
	
	public static void main(String[] args) {
		
		SO_6_MinNumberInRotateArray so=new SO_6_MinNumberInRotateArray();
		
		int array[]={4,5,6,7,1,2,3};
		
		System.out.println(so.minNumberInRotateArray1(array));
		
	}
	
}
