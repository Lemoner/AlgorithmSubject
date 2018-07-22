package com.lmr.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class CollectionArrangement {
	
	public static void main(String[] args) {
		
		CollectionArrangement ca=new CollectionArrangement();
		String str="aba";
		System.out.println(ca.Permutation(str).toString());
		
	}

	public ArrayList<String> Permutation(String str) {

		ArrayList<String> result = new ArrayList<>();

		if (str == null || str.equals("")) {
			return result;
		}

		char[] c=str.toCharArray();
		Arrays.sort(c);
		
		DFS(0, c, result);
		
		//∞¥’’◊÷µ‰–Ú≈≈–Ú
//		result.sort(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			}
//		});

		return result;

	}

	private void DFS(int index, char[] c, ArrayList<String> result) {

		if (index == c.length - 1) {
			result.add(new String(c));
			return;
		}
		for (int i = index; i < c.length; i++) {
			
			if(i!=index&&c[i]==c[index]){
				continue;
			}
			Swap(c, index, i);
			DFS(index + 1, c, result);
			Swap(c, index, i);
			
//			if (IsSwap(c, index, i)) {
//				Swap(c, index, i);
//				DFS(index + 1, c, result);
//				Swap(c, index, i);
//			}
		}

	}

	//»•÷ÿ
	private boolean IsSwap(char[] c, int index, int k) {
		for(int i=index;i<k;i++){
			if(c[i]==c[k]){
				return false;
			}
		}
		return true;
	}

	public void Swap(char[] c, int i, int j) {
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
	}
	
}
