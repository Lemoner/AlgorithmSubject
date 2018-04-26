package com.lmr.LeetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LC_210 {
	public int[] findOrder(int numCourses, int[][] prerequisites) {
		
		int[] result=new int[numCourses];
		int[] map=new int[numCourses];
		int index = 0;
		
		for(int i=0;i<numCourses;i++){
			map[i]=0;
		}
		
		for(int i=0;i<prerequisites.length;i++){
			map[prerequisites[i][0]]++;
		}
		
		for(int i=0;i<numCourses;i++){
			for(int j=0;j<numCourses;j++){
				if(map[j]==0){
					index=j;
					break;
				}
			}
			if(map[index]!=0){
				return new int[0];
			}
			for(int j=0;j<prerequisites.length;j++){
				if(prerequisites[j][1]==index){
					map[prerequisites[j][0]]--;
				}
			}
			map[index]--;
			result[i]=index;
		}
		
		return result;

	}
		
	public int[] findOrder1(int numCourses, int[][] prerequisites) {
		
		int[] result=new int[numCourses];
		int[] map=new int[numCourses];
		int index,course;
		Queue<Integer> queue=new LinkedList<>();

		for(int i=0;i<prerequisites.length;i++){
			map[prerequisites[i][0]]++;
		}
		
		for(int i=0;i<numCourses;i++){
			if(map[i]==0){
				queue.add(i);
			}
		}
		index=0;
		while(!queue.isEmpty()){
			course=queue.poll();
			for(int i=0;i<prerequisites.length;i++){
				if(prerequisites[i][1]==course){
					map[prerequisites[i][0]]--;
					if(map[prerequisites[i][0]]==0){
						queue.add(prerequisites[i][0]);
					}
				}
			}
			result[index++]=course;
		}
		
		return index<numCourses?new int[0]:result;
	
	}
	
	public static void main(String[] args) {
		
		LC_210 lc=new LC_210();
		
		int numCourses=3;
		int[][] prerequisites={{1,0},{1,2},{0,1}};
		
		System.out.println(Arrays.toString(lc.findOrder1(numCourses, prerequisites)));
		
	}
}
