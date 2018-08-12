//package com.lmr.NK;
//
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Comparator;
//
//public class Test{
//    public static class time{
//        public int x;
//        public int y;
//        public time(int x,int y){
//            this.x=x;
//            this.y=y;
//        }
//    }
//    public static void main(String []args){
//        Scanner sc=new Scanner(System.in 
//
//);
//        int countn=sc.nextInt();
//        int countm=sc.nextInt();
//        ArrayList<time> arrlist=new ArrayList<>();
//        ArrayList<time> reslist=new ArrayList<>();
//        for(int i=0;i<countn;i++){
//            int x=sc.nextInt();
//            int y=sc.nextInt();
//            if(y<x)
//                y+=countm;
//            arrlist.add(new time(x,y));
//        }
//        Comparator c=new Comparator<time>() {
//            @Override
//            public int compare(time o1, time o2) {
//                return o1.y-o2.y;
//            }
//        };
//        arrlist.sort(c);
//        for(int i=0;i<countn;i++){
//            if(i==0||reslist.get(reslist.size()-1).y <= arrlist.get(i).x){
//                if(arrlist.get(i).y>=countm){
//                    arrlist.get(i).y-=countm;
//                    if(arrlist.get(i).y<=reslist.get(0).x){
//                        reslist.add(arrlist.get(i));
//                        break;
//                    }
//                }
//                else
//                    reslist.add(arrlist.get(i));
//            }
//        }
//        System.out.println(reslist.size());
//    }
//}
//
//
//
//
//
//
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Scanner;
//
//class ZNode{
//	int s;
//	int t;
//	
//	public ZNode(int s, int t) {
//		this.s = s;
//		this.t = t;
//	}
//	
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//
//		int n,m,s,t;
//		
//		n=in.nextInt();
//		m=in.nextInt();
//		
//		List<ZNode> list=new ArrayList<>();
//		for(int i=0;i<n;i++){
//			s=in.nextInt();
//			t=in.nextInt();
//			if(s>t){
//				t+=m;
//			}
//			ZNode node=new ZNode(s,t);
//			list.add(node);
//		}
//		
//		list.sort(new Comparator<ZNode>() {
//
//			@Override
//			public int compare(ZNode o1, ZNode o2) {
//				if(o1.t==o2.t){
//					return o1.s-o2.s;
//				}
//				else{
//					return o1.t-o2.t;
//				}
//			}
//		});
//		
//		System.out.println(Fun(list,m));
//	}
//
//	private static int Fun(List<ZNode> list,int m) {
//		
//		int max,t;
//		max=1;
//		t=list.get(0).t;
//		for(int i=1;i<list.size();i++){
//			ZNode node=list.get(i);
//			if(node.s>=t){
//				t=node.t;
//				max++;
//				if(t>=m){
//					t-=m;
//				}
//			}
//		}
//		
//		return max;
//	}
//}
//
