package com.lmr.NK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class ZNode {
	long l;
	long r;

	public ZNode(long l, long r) {
		this.l = l;
		this.r = r;
	}

}

public class ZJTD_Main_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		long m;

		m = in.nextLong();
		in.nextLine();

		String[] str;
		List<ZNode> list = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			str = in.nextLine().split(";|,");
			for (int j = 0; j < str.length; j += 2) {
				list.add(new ZNode(Long.parseLong(str[j]), Long.parseLong(str[j + 1])));
			}
		}

		list.sort(new Comparator<ZNode>() {

			@Override
			public int compare(ZNode o1, ZNode o2) {
				if (o1.l == o2.l) {
					if (o1.r > o2.r) {
						return 1;
					} else {
						return -1;
					}
				} else {
					if (o1.l > o2.l) {
						return 1;
					} else {
						return -1;
					}
				}
			}
		});

		List<ZNode> result = new ArrayList<>();
		result = Fun(list);

		for (int i = 0; i < result.size(); i++) {
			if (i == 0) {
				System.out.print(result.get(i).l + "," + result.get(i).r);
			} else {
				System.out.print(";" + result.get(i).l + "," + result.get(i).r);
			}
		}

	}

	private static List<ZNode> Fun(List<ZNode> list) {

		List<ZNode> result = new ArrayList<>();

		if (list.size() == 0) {
			return result;
		}

		long l, r;

		l = list.get(0).l;
		r = list.get(0).r;

		for (int i = 1; i < list.size(); i++) {
			ZNode node = list.get(i);
			if (node.l <= r) {
//				if (node.r > r) {
//					r = node.r;
//				}
				r=Math.max(r, node.r);
			} else {
				result.add(new ZNode(l, r));
				l = node.l;
				r = node.r;
			}

		}


		result.add(new ZNode(l, r));


		return result;
	}
}
