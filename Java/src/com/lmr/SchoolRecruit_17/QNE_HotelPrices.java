package com.lmr.SchoolRecruit_17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

class HotelData implements Comparable<HotelData>{
	int start;
	int end;
	int price;
	
	public HotelData(int start, int end, int price) {
		super();
		this.start = start;
		this.end = end;
		this.price = price;
	}

	@Override
	public int compareTo(HotelData o) {
		
		if(start<o.start){
			return -1;
		}
		else if(start==o.start){
			if(end<o.end){
				return -1;
			}
			else{
				return 1;
			}
		}
		return 1;
		
	}
	
	public void setStart(int start) {
		this.start = start;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "[" + start + ", " + end + ", " + price + "]";
	}
	
	
}

public class QNE_HotelPrices {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		List<HotelData> datas=new ArrayList<>();
		
		while(scanner.hasNext()){
			datas.add(new HotelData(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
		}

		SortedSet<HotelData> sets=new TreeSet<>();
		int s,e,p,es = -1;
		for(int i=datas.size()-1;i>=0;i--){
			HotelData hotel=datas.get(i);
			s=hotel.start;
			e=hotel.end;
			p=hotel.price;
			List<HotelData> addHotel=new ArrayList<>();
			for(HotelData data:sets){
				es=data.end;
				if(s<data.start){
					if(e<data.start){
						HotelData hd=new HotelData(s, e, p);
						addHotel.add(hd);
						break;
					}
					else if(e<=data.end){
						HotelData hd=new HotelData(s, data.start-1, p);
						addHotel.add(hd);
						break;
					}
					else{
						HotelData hd=new HotelData(s, data.start-1, p);
						s=data.end+1;
						addHotel.add(hd);
					}
				}
				else if(s<=data.end){
					if(e<=data.end){
						break;
					}
					else{
						s=data.end+1;
					}
				}
			}
			if(s>es){
				HotelData hd=new HotelData(s, e, p);
				addHotel.add(hd);
			}
			
			for(HotelData data:addHotel){
				sets.add(data);
			}
			
		}
		
		Iterator<HotelData> iterator=sets.iterator();
		HotelData hotel=iterator.next();
		s=hotel.start;
		e=hotel.end;
		p=hotel.price;
		while(iterator.hasNext()){
			HotelData data=iterator.next();
			if(p==data.price&&e+1==data.start){
				e=data.end;
			}
			else{
				System.out.print("["+s+", "+e+", "+p+"],");
				s=data.start;
				e=data.end;
				p=data.price;
			}
		}
		System.out.print("["+s+", "+e+", "+p+"]");
		
	}
	
}
