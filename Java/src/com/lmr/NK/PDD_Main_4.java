package com.lmr.NK;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PDD_Main_4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n, k;
		int[] a = new int[10];
		String str;
		char[] result = null;
		List<String> list=new ArrayList<>();

		n = scanner.nextInt();
		k = scanner.nextInt();
		scanner.nextLine();
		str = scanner.nextLine();

		char[] c = str.toCharArray();

		for (int i = 0; i < c.length; i++) {
			a[c[i] - '0']++;
		}

		int min, cc, ci, ck;
		int[] s;
		min = Integer.MAX_VALUE;

		for (int i = 0; i < 10; i++) {
			if (a[i] == 0) {
				continue;
			}
			cc = 0;
			ci = 1;
			ck = k - a[i];
			s = new int[10];
			while (ck > 0) {
				if (i - ci >= 0 && a[i - ci] > 0) {
					if (ck > a[i - ci]) {
						cc += ci * a[i - ci];
						ck -= a[i - ci];
						s[i - ci] = a[i - ci];
					} else {
						cc += ci * ck;
						s[i - ci] = ck;
						ck = 0;
					}
				}
				if (ck > 0 && i + ci <= 9 && a[i + ci] > 0) {
					if (ck > a[i + ci]) {
						cc += ci * a[i + ci];
						ck -= a[i + ci];
						s[i + ci] = a[i + ci];
					} else {
						cc += ci * ck;
						s[i + ci] = ck;
						ck = 0;
					}
				}
				ci++;
			}
			if (cc < min) {
				min = cc;
				
				list=new ArrayList<>();
				
				result=str.toCharArray();
				for(int ii=0;ii<result.length;ii++){
					if(result[ii]-'0'>i&&s[result[ii]-'0']>0){
						s[result[ii]-'0']--;
						result[ii]=(char) ('0'+i);
					}
				}
				for(int ii=result.length-1;ii>=0;ii--){
					if(result[ii]-'0'<i&&s[result[ii]-'0']>0){
						s[result[ii]-'0']--;
						result[ii]=(char) ('0'+i);
					}
				}
				
				list.add(new String(result));
			}
			else if(cc==min){
				min = cc;
				
				result=str.toCharArray();
				for(int ii=0;ii<result.length;ii++){
					if(result[ii]-'0'>i&&s[result[ii]-'0']>0){
						s[result[ii]-'0']--;
						result[ii]=(char) ('0'+i);
					}
				}
				for(int ii=result.length-1;ii>=0;ii--){
					if(result[ii]-'0'<i&&s[result[ii]-'0']>0){
						s[result[ii]-'0']--;
						result[ii]=(char) ('0'+i);
					}
				}
				
				list.add(new String(result));
			}
			
		}
		
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});

		System.out.println(min);
		System.out.println(list.get(0));

	}

}
