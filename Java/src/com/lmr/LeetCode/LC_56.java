package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LC_56 {

	public List<Interval> merge1(List<Interval> intervals) {
		
		if(intervals==null||intervals.size()==0){
			return new ArrayList<>();
		}
		
		Collections.sort(intervals, new Comparator<Interval>() {

			@Override
			public int compare(Interval o1, Interval o2) {
				
				return o1.start-o2.start;
				
			}
		});
		
		List<Interval> result=new ArrayList<>();
		Interval max=new Interval();
		
		for(Interval interval:intervals){
			if(result.size()==0){
				result.add(interval);
				max=interval;
			}
			else{
				if(interval.start<=max.end){
					if(interval.end>max.end){
						max.end=interval.end;
					}
				}
				else{
					result.add(interval);
					max=interval;
				}
			}
		}
		
		return result;

	}
	
	public List<Interval> merge2(List<Interval> intervals) {
		
		if(intervals==null||intervals.size()==0){
			return new ArrayList<>();
		}
		
		int[] start=new int[intervals.size()];
		int[] end=new int[intervals.size()];
		int index;
		
		index=0;
		for(Interval interval:intervals){
			start[index]=interval.start;
			end[index]=interval.end;
			index++;
		}
		
		Arrays.sort(start);
		Arrays.sort(end);
		
		int istart,iend;
		List<Interval> result=new ArrayList<>();
		
//		for(index=0;index<intervals.size();index++){
//			istart=start[index];
//			while(index<intervals.size()-1&&end[index]>=start[index+1]){
//				index++;
//			}
//			result.add(new Interval(istart, end[index]));
//		}
		
		for(istart=0,iend=0;iend<intervals.size();iend++){
			if(iend==intervals.size()-1||end[iend]<start[iend+1]){
				result.add(new Interval(start[istart], end[iend]));
				istart=iend+1;
			}
		}
		
		return result;
		
	}

	public static void main(String[] args) {

		LC_56 lc = new LC_56();
		
		List<Interval> intervals=new ArrayList<>();
		intervals.add(new Interval(1, 3));
		intervals.add(new Interval(3, 6));
		intervals.add(new Interval(8, 10));
		intervals.add(new Interval(10, 18));
		
//		intervals.add(new Interval(1, 4));
//		intervals.add(new Interval(0, 4));

		System.out.println(lc.merge2(intervals));
		// Given [1,3],[2,6],[8,10],[15,18],
		// return [1,6],[8,10],[15,18].

	}

}
