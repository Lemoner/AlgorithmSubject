package com.lmr.SwordOffer;

public class SO_45_FirstNotRepeatingChar {
	
	public static void main(String[] args) {
		
		SO_45_FirstNotRepeatingChar so=new SO_45_FirstNotRepeatingChar();
		String str="google";
		
		System.out.println(so.FirstNotRepeatingChar(str));
		
	}

	public int FirstNotRepeatingChar(String str) {
		
		if(str.equals("")){
			return -1;
		}
		
		int[] a=new int[128];
		int t,min;
		
		for(int i=0;i<a.length;i++){
			a[i]=-1;
		}
		
		for(int i=0;i<str.length();i++){
			t=str.charAt(i)-' ';
			if(a[t]==-1){
				a[t]=i;
			}
			else{
				a[t]=-2;
			}
		}
		
		min=str.length();
		for(int i=0;i<a.length;i++){
			if(a[i]>-1&&a[i]<min){
				min=a[i];
			}
		}
		
        return min;
    }
	
}
