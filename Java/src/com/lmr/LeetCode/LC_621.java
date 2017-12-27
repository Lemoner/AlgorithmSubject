package com.lmr.LeetCode;

import java.util.Arrays;

public class LC_621 {

	public int leastInterval(char[] tasks, int n) {
		
		int T[]=new int[26];
		int num,count,i,j;
		
		for(i=0;i<tasks.length;i++){
			T[tasks[i]-'A']++;
		}
		
		Arrays.sort(T);
		
		num=0;
		count=0;
		while(true){
			for(i=0,j=T.length-1;i<n+1&&j>=0;j--){
				if(T[j]>0){
					T[j]--;
					num++;
					count++;
					i++;
				}
			}
			if(num==tasks.length){
				break;
			}
			if(i<n+1){
				count+=n-i+1;
			}
			Arrays.sort(T);
		}
		
		return count;

	}
	
	public static void main(String[] args) {
		
		LC_621 lc=new LC_621();
		
		char tasks[]={'A','A','A','B','B','B'};
		int n=2;
		
		System.out.println(lc.leastInterval(tasks, n));
		
	}

}
