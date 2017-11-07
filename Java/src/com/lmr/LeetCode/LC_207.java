package com.lmr.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class LC_207 {

	public boolean canFinish(int numCourses, int[][] prerequisites) {
		
		Map<Integer, HashSet<Integer>> graph=new HashMap<>();
		int x,y;
		
		for(int i=0;i<numCourses;i++){
			graph.put(i, new HashSet<Integer>());
		}
		
		for(int i=0;i<prerequisites.length;i++){
			x=prerequisites[i][0];
			y=prerequisites[i][1];
			graph.get(x).add(y);
		}
		
		while(true){
			int current = -1;
			for(Entry<Integer, HashSet<Integer>> entry:graph.entrySet()){
				if(entry.getValue().size()==0){
					current=entry.getKey();
					break;
				}
			}
			
			if(current==-1){
				break;
			}
			
			graph.remove(current);
			for(Entry<Integer, HashSet<Integer>> entry:graph.entrySet()){
				entry.getValue().remove(current);
			}
		}
		
		if(graph.isEmpty()){
			return true;
		}
		return false;

	}
	
	public boolean canFinish1(int numCourses, int[][] prerequisites) {
		if (numCourses < 2)
			return true;
		int[] pre = new int[numCourses];
		Arrays.fill(pre, -1);
		for (int[] p : prerequisites) {
			int cur = p[1];
			while (cur >= 0) {
				cur = pre[cur];
				if (cur == p[0])
					return false;

			}
			pre[p[0]] = p[1];
		}
		return true;
	}
	
//	public boolean canFinish(int numCourses, int[][] prerequisites) {
//		
//		List<HashSet<Integer>> graph=new ArrayList<>();
//		int x,y;
//		
//		for(int i=0;i<numCourses;i++){
//			graph.add(i, new HashSet<Integer>());
//		}
//		
//		for(int i=0;i<prerequisites.length;i++){
//			x=prerequisites[i][0];
//			y=prerequisites[i][1];
//			graph.get(x).add(y);
//		}
//		
//		while(true){
//			for(int i=0;i<numCourses;i++){
//				if(graph.get(i).size()==0){
//					
//				}
//			}
//		}
//		
//		return false;
//
//	}
	
	public static void main(String[] args) {
		
		LC_207 lc=new LC_207();
		
		int numCourses=5;
		int prerequisites[][]={{1,0},{0,1}};
		
		System.out.println(lc.canFinish1(numCourses, prerequisites));
	}

}
