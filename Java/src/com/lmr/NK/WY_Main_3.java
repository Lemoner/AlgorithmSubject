package com.lmr.NK;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class WY_Main_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n, m, k;

		n = in.nextInt();
		m = in.nextInt();
		k = in.nextInt();

		char[] arr = new char[n + m];

		for (int i = 0; i < n; i++) {
			arr[i] = 'a';
		}
		for (int i = n; i < n + m; i++) {
			arr[i] = 'z';
		}

		List<String> result = new ArrayList();

		DFS(arr, 0, result);

		result.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});

		if (k>result.size()) {
			System.out.println("-1");
		} else {
			System.out.println(result.get(k - 1));
		}

	}

	private static void DFS(char[] arr, int index, List<String> result) {

		if (index == arr.length-1 && !result.contains(new String(arr))) {
			result.add(new String(arr));
			return;
		}

		for (int i = index; i < arr.length; i++) {
			Swap(arr, i, index);
			DFS(arr, index + 1, result);
			Swap(arr, i, index);
		}

	}

	private static void Swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
