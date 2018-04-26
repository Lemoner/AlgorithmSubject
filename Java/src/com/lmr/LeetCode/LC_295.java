package com.lmr.LeetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LC_295 {

	public static void main(String[] args) {
		
		MedianFinder mf=new MedianFinder();
		
		mf.addNum(5);
		mf.addNum(9);
		mf.addNum(6);
		System.out.println(mf.findMedian());
		mf.addNum(3);
		System.out.println(mf.findMedian());
		
	}
	
}

class MedianFinder {

	private PriorityQueue<Integer> min;
	private PriorityQueue<Integer> max;
	
    /** initialize your data structure here. */
    public MedianFinder() {
    	
    	min=new PriorityQueue<>();
    	max=new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.intValue()-o1.intValue();
			}
		});
    	
    }
    
    public void addNum(int num) {
        if(min.size()==0){
        	min.add(num);
        }
        else if(min.size()>max.size()){
        	if(num>min.peek()){
        		max.add(min.poll());
        		min.add(num);
        	}
        	else{
        		max.add(num);
        	}
        }
		else if(min.size()<max.size()){
			if(num<max.peek()){
				min.add(max.poll());
        		max.add(num);
        	}
        	else{
        		min.add(num);
        	}   	
		}
		else{
			if(num<max.peek()){
        		max.add(num);
        	}
        	else{
        		min.add(num);
        	} 
		}
    }
    
    public double findMedian() {
    	
    	if(min.size()==max.size()){
    		return (min.peek()+max.peek())*1.0/2;
    	}
    	else if(min.size()>max.size()){
        	return min.peek();
        }
    	else{
    		return max.peek();
    	}
    	
    }
}


//class MedianFinder {
//
//	int[] a;
//	int size;
//	
//    /** initialize your data structure here. */
//    public MedianFinder() {
//        a=new int[100];
//        size=0;
//    }
//    
//    public void addNum(int num) {
//    	
//    	if(size==a.length){
//    		a=Arrays.copyOf(a, a.length*2);
//    	}
//    	
//    	int index=0;
//    	while(index<size){
//    		if(a[index]>num){
//    			break;
//    		}
//    		else{
//    			index++;
//    		}
//    	}
//    	
//    	for(int i=size;i>index;i--){
//    		a[i]=a[i-1];
//    	}
//        a[index]=num;
//        
//        size++;
//        
//    }
//    
//    public double findMedian() {
//		return size%2==0?(a[size/2]+a[size/2-1])*1.0/2:a[size/2];
//        
//    }
//}
