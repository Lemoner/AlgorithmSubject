package com.lmr.SwordOffer;

public class SO_1_FindInTwoArray {

	public boolean Find(int target, int [][] array) {
        
		int n,m,i,j;
        
        n=array.length;
        m=array[0].length;
        
        i=n-1;
        j=0;
        
        while(i>=0&&j<m){
        	if(array[i][j]==target){
        		return true;
        	}
        	else if(array[i][j]>target){
        		i--;
        	}
        	else{
        		j++;
        	}
        }
        
		return false;
		
    }
	
	public static void main(String[] args) {
		
		SO_1_FindInTwoArray so=new SO_1_FindInTwoArray();
		
		int target=7;
		int array[][]={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		
		System.out.println(so.Find(target, array));
		
	}
	
}
