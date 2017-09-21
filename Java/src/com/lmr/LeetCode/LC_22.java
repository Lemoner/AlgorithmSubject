package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC_22 {

	private List<String> result=new ArrayList<>();
	
	public List<String> generateParenthesis1(int n) {
		
		if(n==0){
			return null;
		}
		
		DFS(n,0,0,new char[2*n],0);
		
		return result;

	}
	
	public void DFS(int n, int x, int y, char[] s, int index){
		
		if(n==x){
			while(y<n){
				s[index++]=')';
				y++;
			}
			result.add(new String(s));
		}
		else{
//			if(x==y){
//				s[index]='(';
//				DFS(n,x+1,y,s,index+1);
//			}
//			else{
//				s[index]='(';
//				DFS(n,x+1,y,s,index+1);
//				
//				s[index]=')';
//				DFS(n,x,y+1,s,index+1);
//			}
			
			s[index]='(';
			DFS(n,x+1,y,s,index+1);
			
			if(x>y){
				s[index]=')';
				DFS(n,x,y+1,s,index+1);
			}
		}
		
	}
	
	public List<String> generateParenthesis2(int n) {
        List<String> result = new ArrayList();
        if(n > 0) {
            generate(result, new char[2*n], 0, n, n);
        }
        return result;
    }
    
    private void generate(List<String> result, char[] arr, int index, int leftR, int rightR) {
        if(index == arr.length) {
            result.add(new String(arr));
            return;
        }
        
        if(leftR > 0) {
            arr[index] = '(';
            generate(result, arr, index+1, leftR-1, rightR);
        } 
        
        if(rightR > leftR) {
            arr[index] = ')';
            generate(result, arr, index+1, leftR, rightR-1);
        }
    }
	
	
	
	public static void main(String[] args) {
		
		LC_22 lc=new LC_22();
		
		System.out.println(lc.generateParenthesis1(3).toString());
		
	}

}
