package com.lmr.SwordOffer;

import java.util.ArrayList;
import java.util.Comparator;

public class SO_37_ArrangementSOfStrings {

	public static void main(String[] args) {
		SO_37_ArrangementSOfStrings so = new SO_37_ArrangementSOfStrings();
		String str = "abca";
		System.out.println(so.Permutation(str).toString());
//		str = "aabc";
//		System.out.println(so.Permutation(str).toString());
	}
	
	public ArrayList<String> Permutation(String str) {

		ArrayList<String> result = new ArrayList<>();

		if (str == null || str.equals("")) {
			return result;
		}

		DFS(0, str.toCharArray(), result);
		
		result.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});

		return result;

	}

	private void DFS(int index, char[] c, ArrayList<String> result) {

		if (index == c.length - 1) {
			result.add(new String(c));
			return;
		}
		for (int i = index; i < c.length; i++) {
			if (IsSwap(c, index, i)) {
				Swap(c, index, i);
				DFS(index + 1, c, result);
				Swap(c, index, i);
			}
		}

	}

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
