package com.lmr.NK;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ZJTD_Main_5 {

	static class ZNode{
		int s;
		int t;

		public ZNode(int s, int t) {
			this.s = s;
			this.t = t;
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n,m,s,t;
		
		n=in.nextInt();
		m=in.nextInt();
		
		List<ZNode> list=new ArrayList<>();
		for(int i=0;i<n;i++){
			s=in.nextInt();
			t=in.nextInt();
			if(s>t){
				t+=m;
			}
			ZNode node=new ZNode(s,t);
			list.add(node);
		}
		
		list.sort(new Comparator<ZNode>() {

			@Override
			public int compare(ZNode o1, ZNode o2) {
				if(o1.t==o2.t){
					return o1.s-o2.s;
				}
				else{
					return o1.t-o2.t;
				}
			}
		});
		
		System.out.println(Fun(list,n,m));
	}

	private static int Fun(List<ZNode> list,int n,int m) {
	
		List<ZNode> temp=new ArrayList<>();
		
		for(int i=0;i<n;i++){
			if(i==0||temp.get(temp.size()-1).t<=list.get(i).s){
				if(list.get(i).t>=m){
					list.get(i).t-=m;
					if(list.get(i).t<=temp.get(0).s){
						temp.add(list.get(i));
						break;
					}
				}
				else{
					temp.add(list.get(i));
				}
			}
		}
		
		return temp.size();
	}
}
