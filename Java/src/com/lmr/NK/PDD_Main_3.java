package com.lmr.NK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PDD_Main_3 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		List<Integer> list=new ArrayList<>();
		
		while(scanner.hasNext()){
			list.add(scanner.nextInt());
		}
		
		Collections.sort(list);
		
		int count;
		count=0;
		while(!list.isEmpty()){
			int a=list.remove(list.size()-1);
			if(a<=200){
			}
			count++;
		}
		
		System.out.println(list.toString());
		
	}
	
}
