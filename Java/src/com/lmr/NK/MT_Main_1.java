package com.lmr.NK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class MNode{
	int num;
	int value=0;
	int len=0;
	
	public MNode(int num){
		this.num=num;
	}
}

public class MT_Main_1 {

	public static void main(String[] args) {
		
		int n,x,y;
		Map<Integer, List<MNode>> map=new HashMap<>();
		
		Scanner scanner=new Scanner(System.in);
		
		n=scanner.nextInt();
		
		for(int i=1;i<n;i++){
			x=scanner.nextInt();
			y=scanner.nextInt();
			if(map.get(x)==null){
				List<MNode> list=new ArrayList<>();
				list.add(new MNode(y));
				map.put(x, list);
			}
			else{
				map.get(x).add(new MNode(y));
			}
		}
		
		MNode root=new MNode(1);
		DFSNum(map,root);
		
		int index=1,count=0;
//		while(map.get(index)!=null&&map.get(index).size()==1){
//			index=map.get(index).get(0).num;
//			count++;
//		}
		
		int sum=root.value-root.len+count;
		System.out.println(sum);
		
	}

	private static void DFSNum(Map<Integer, List<MNode>> map, MNode root) {
		
		if(map.get(root.num)==null){
			return ;
		}
		
		int sum=0,maxlen=0;
		for(MNode node:map.get(root.num)){
			DFSNum(map, node);
			sum+=node.value;
			sum+=2;
			maxlen=Math.max(maxlen, node.len);
		}
		root.value=sum;
		root.len=maxlen+1;
	}
	
}
