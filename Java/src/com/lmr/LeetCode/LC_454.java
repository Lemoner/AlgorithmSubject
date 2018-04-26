package com.lmr.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LC_454 {
	public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
		int count=0;
		for(int a=0;a<A.length;a++){
			for(int b=0;b<B.length;b++){
				for(int c=0;c<C.length;c++){
					for(int d=0;d<D.length;d++){
						if(A[a]+B[b]+C[c]+D[d]==0){
							count++;
						}
					}	
				}	
			}	
		}
		return count;
	}
	
	public int fourSumCount1(int[] A, int[] B, int[] C, int[] D) {
		int count=0;
		Map<Integer, Integer> map=new HashMap<>();
		
		for(int a=0;a<A.length;a++){
			for(int b=0;b<B.length;b++){
				map.put(A[a]+B[b], map.getOrDefault(A[a]+B[b], 0)+1);
			}
		}
		
		for(int c=0;c<C.length;c++){
			for(int d=0;d<D.length;d++){
				count+=map.getOrDefault(-(C[c]+D[d]), 0);
			}
		}
		
		return count;
	}
}
