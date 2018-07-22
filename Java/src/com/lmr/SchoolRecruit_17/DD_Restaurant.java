package com.lmr.SchoolRecruit_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Data {
	int person;
	int money;
	public Data(int person, int money) {
		super();
		this.person = person;
		this.money = money;
	}
}

public class DD_Restaurant {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n, m;
		n = scanner.nextInt();
		m = scanner.nextInt();
		
		List<Integer> desklist = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			desklist.add(scanner.nextInt());
		}
		Collections.sort(desklist);
		
		List<Data> datalist = new ArrayList<>();
		for(int i=0;i<m;i++){
			Data data=new Data(scanner.nextInt(), scanner.nextInt());
			if(data.person<=desklist.get(n-1)){
				datalist.add(data);
			}
		}
		Collections.sort(datalist, new Comparator<Data>() {

			@Override
			public int compare(Data o1, Data o2) {
				if(o1.money<o2.money){
					return -1;
				}
				else if(o1.money==o2.money&&o1.person<o2.person){
					return -1;
				}
				return 1;
			}
		});
		
		long count=0;
		for(int i=datalist.size()-1;i>=0&&desklist.size()>0;i--){
			Data data=datalist.get(i);
			if(desklist.get(desklist.size()-1)>=data.person){
				int index=Find(desklist,data.person);
				count+=data.money;
				desklist.remove(index);
			}
		}
		
		System.out.println(count);

	}

	private static int Find(List<Integer> desklist, int person) {
		
		int start,end,mid;
		start=0;
		end=desklist.size()-1;
		
		while(start<=end){
			mid=(start+end)/2;
			if(desklist.get(mid)==person){
				return mid;
			}
			else if(desklist.get(mid)<person){
				start=mid+1;
			}
			else{
				end=mid-1;
			}
		}
		
		return start;
	}

}
