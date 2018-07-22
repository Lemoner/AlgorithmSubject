package com.lmr.SwordOffer;

import java.util.ArrayList;

public class SO_52_FindContinuousSequence {
	
	public static void main(String[] args) {
		
		SO_52_FindContinuousSequence so=new SO_52_FindContinuousSequence();
		
		int sum=3;
		System.out.println(so.FindContinuousSequence1(sum).toString());
		
	}

	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
	       	
		ArrayList<ArrayList<Integer>> result=new ArrayList<>();
		
		int start,end,s;
		start=1;
		end=2;
		s=start+end;
		
		while(start<=sum/2){
			if(s==sum){
				ArrayList<Integer> list=new ArrayList<>();
				for(int i=start;i<=end;i++){
					list.add(i);
				}
				result.add(list);
				end++;
				s+=end;
			}
			else if(s<sum){
				end++;
				s+=end;
			}
			else{
				s-=start;
				start++;
			}
		}
		
		return result;
		
    }
	
	public ArrayList<ArrayList<Integer> > FindContinuousSequence1(int sum) {
       	
		ArrayList<ArrayList<Integer>> result=new ArrayList<>();
		
		int x,y,mid,s;
		mid=(1+sum)/2;
		
		for(x=1;x<mid;x++){
			y=(int) Math.sqrt(2*sum+x*x-x);
			if(y*(y+1)==2*sum+x*x-x){
				ArrayList<Integer> list=new ArrayList<>();
				for(int i=x;i<=y;i++){
					list.add(i);
				}
				result.add(list);
			}
		}
	
		return result;
		
	}
	
}
