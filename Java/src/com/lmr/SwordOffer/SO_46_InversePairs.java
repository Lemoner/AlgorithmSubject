package com.lmr.SwordOffer;

public class SO_46_InversePairs {
	
	public static void main(String[] args) {
		
		SO_46_InversePairs so=new SO_46_InversePairs();
		int[] array=new int[]{7,5,6,4};
		
		System.out.println(so.InversePairs(array));
		
	}

	public int InversePairs(int[] array) {
		
		if(array==null||array.length==0){
			return 0;
		}

		return (int) (Fun(array,new int[array.length], 0, array.length-1)%1000000007);
		
	}
	
	public long Fun(int[] array, int[] copy, int start, int end){
		
		if(start==end){
			return 0;
		}
		
		long left,right,count;
		int mid,li,ri,index;
		
		mid=(start+end)/2;
		left=Fun(array, copy, start, mid);
		right=Fun(array, copy, mid+1, end);
		
		count=0;
		li=mid;
		ri=end;
		index=end;
		while(li>=start&&ri>=mid+1){
			if(array[li]>array[ri]){
				count+=ri-mid;
				copy[index--]=array[li--];
			}
			else{
				copy[index--]=array[ri--];
			}
		}
		while(li>=start){
			copy[index--]=array[li--];
		}
		while(ri>=mid+1){
			copy[index--]=array[ri--];
		}
		
		for(int i=start;i<=end;i++){
			array[i]=copy[i];
		}
		
		return left+right+count;
		
	}

}
