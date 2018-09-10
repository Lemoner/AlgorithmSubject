package com.lmr.NK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ZJTD_Main_21 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int mod=1000000007;
		
		int n;
		n=in.nextInt();
		
		
		long[] ap=new long[n+1];
		long[] bp=new long[n+1];
//		long[] cp=new long[n+1];
		long sum;
		
		ap[1]=10;
//		bp[1]=10;
//		cp[1]=10;
		
		for(int i=2;i<=n;i++){
			
			ap[i]=ap[i-1]*10%mod;
			
			if(i>2){
				bp[i]=(ap[i-2]+bp[i-2])%mod;
			}
			
			sum=0;
//			for(int k=1;k<i-1;k++){
//				if(k*2==i-1){
//					sum+=(ap[k]+bp[k])*(ap[i-1-k]+bp[i-1-k])%mod;
//				}
//				else{
//					sum+=(ap[k]+bp[k])*(ap[i-1-k]+bp[i-1-k])*2%mod;
//				}
//			}
			for(int k=1;k<i-1;k++){
				
				sum+=(ap[k]+bp[k])*(ap[i-1-k]+bp[i-1-k])*2%mod;
				System.out.println(sum);
				
			}
			bp[i]=(bp[i]+sum)%mod;
			
		}
		
		System.out.println(Arrays.toString(ap));
		System.out.println(Arrays.toString(bp));
		
		System.out.println((ap[n]+bp[n])%mod);
		
		Fun(n);

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void Fun(int n) {
		
		ArrayList<String> list=new ArrayList<>();
		
		for(int i=0;i<=9;i++){
			list.add(i+"");
		}
		
		ArrayList<ArrayList<String>> ar=new ArrayList<>();
		ArrayList<ArrayList<String>> br=new ArrayList<>();
		
		ar.add(list);
		br.add(new ArrayList());
		
		for(int i=2;i<=n;i++){
			DFS(n,ar,br,i);
		}
		
//		System.out.println(ar.size()+" "+br.size());
		System.out.println(ar.get(n-1).size()%1000000007+" "+br.get(n-1).size()%1000000007);
		
	}

	private static void DFS(int n, ArrayList<ArrayList<String>> ar, ArrayList<ArrayList<String>> br, int index) {
		
		ArrayList<String> al=new ArrayList<>();
		ArrayList<String> bl=new ArrayList<>();
		
		ar.add(al);
		br.add(bl);

		for(String str:ar.get(index-2)){
			for(int i=0;i<=9;i++){
				al.add(str+i);
			}
		}
		
		if(ar.size()>2){
			for(String str:ar.get(index-3)){
				bl.add('('+str+')');
			}
		}
		
		if(br.size()>2){
			for(String str:br.get(index-3)){
				bl.add('('+str+')');
			}
		}
		
		
		for(int k=1;k<index-1;k++){
//			if(k*2==index-1){
//				for(String as:ar.get(k-1)){
//					for(String bs:ar.get(index-k)){
//						bl.add(as+"+"+bs);
//						bl.add(as+"-"+bs);
//					}
//					for(String bs:br.get(index-k)){
//						bl.add(as+"+"+bs);
//						bl.add(as+"-"+bs);
//					}
//				}
//			}
//			else{
				for(String as:ar.get(k-1)){
					for(String bs:ar.get(index-2-k)){
						bl.add(as+"+"+bs);
						bl.add(as+"-"+bs);
					}
					for(String bs:br.get(index-2-k)){
						bl.add(as+"+"+bs);
						bl.add(as+"-"+bs);
					}
				}
				for(String as:br.get(k-1)){
					for(String bs:ar.get(index-2-k)){
						bl.add(as+"+"+bs);
						bl.add(as+"-"+bs);
					}
					for(String bs:br.get(index-2-k)){
						bl.add(as+"+"+bs);
						bl.add(as+"-"+bs);
					}
				}
//			}
		}
		
		
	}


}
