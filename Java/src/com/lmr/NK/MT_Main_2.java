package com.lmr.NK;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MT_Main_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,k,t,result;
		
		n = sc.nextInt();
		k = sc.nextInt();
		t = sc.nextInt();
		
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		result = 0;
		for (int i = 0; i < n; i++) {
			int p = i;
			int l = (k - 1 + p);
			Map<Integer, Integer> map = new HashMap<>();
			for (int j = p; l < n && j <= l; j++) {
				if (map.get(a[j]) == null) {
					map.put(a[j], 1);
				} 
				else {
					map.put(a[j], map.get(a[j]) + 1);
				}
			}
			for (Integer key : map.keySet()) {
				if (map.get(key) >= t)
					result++;
			}
		}
		System.out.println(result);
	}
}