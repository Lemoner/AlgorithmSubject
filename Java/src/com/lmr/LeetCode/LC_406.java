package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LC_406 {

	public int[][] reconstructQueue(int[][] people) {
		
		int temp[],index;
		
		//≈≈–Ú
		for(int i=1;i<people.length;i++){
			temp=people[i];
			index=i-1;
			while(index>=0){
				if((temp[0]>people[index][0])||(temp[0]==people[index][0]&&temp[1]<people[index][1])){
					people[index+1]=people[index];
					index--;
				}
				else{
					break;
				}
			}
			people[index+1]=temp;
		}
		
		//≤Â»Î
		for(int i=1;i<people.length;i++){
			temp=people[i];
			index=temp[1];
			if(index<i){
				for(int j=i;j>index;j--){
					people[j]=people[j-1];
				}
				people[index]=temp;
			}
		}
		
//		System.out.println("----------------------");
//		for(int i=0;i<people.length;i++){
//			System.out.println(people[i][0]+" - "+people[i][1]);
//		}
		
		return people;

	}
	
	public int[][] reconstructQueue1(int[][] people) {
		Arrays.sort(people, new Comparator<int[]>() {
			public int compare(int[] p1, int[] p2) {
				if (p1[0] != p2[0]) {
					return p2[0] - p1[0]; // higher height in front
				}
				return p1[1] - p2[1]; // fewer persons in front
			}
		});

		List<int[]> list = new ArrayList<>();
		for (int[] p : people) {
			list.add(p[1], p); // in p[1]'s postion insert p
		}
		return list.toArray(new int[0][0]);
    }
	
	public static void main(String[] args) {
		
		LC_406 lc=new LC_406();
		
		int people[][]={{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
		
		lc.reconstructQueue(people);
		
	}

}
