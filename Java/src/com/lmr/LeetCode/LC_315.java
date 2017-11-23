package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LC_315 {

	public List<Integer> countSmaller(int[] nums) {

		int result[]=new int[nums.length];
		List<Integer> list=new ArrayList<>(nums.length);
		
		for(int i=nums.length-1;i>=0;i--){
			for(int j=0;j<i;j++){
				if(nums[j]>nums[i]){
					result[j]++;
				}
			}
			list.add(0, result[i]);
		}
		
//		for(int i=nums.length-1;i>=0;i--){
//			for(int j=0 ;j<i;j++){
//				if(nums[j]>nums[i]){
//					result.set(j, result.get(j)+1);
//				}
//			}
//		}
		
		return list;
		
	}
	
	public List<Integer> countSmaller1(int[] nums) {
		
		List<Integer> numlist=new ArrayList<>(nums.length);
		List<Integer> result=new ArrayList<>(nums.length);
		
		int len,left,mid,right;
		
		len=nums.length;
		
		for(int i=len-1;i>=0;i--){
			left=0;
			right=len-i-1;
			while(left<right){
				mid=(left+right)/2;
				if(nums[i]<=numlist.get(mid)){
					right=mid;
				}
				else{
					left=mid+1;
				}
			}
			numlist.add(right, nums[i]);
			result.add(0, right);
		}
		
		return result;
		
	}
	
	public List<Integer> countSmaller2(int[] nums) {
		
		int count[]=new int[nums.length];
		int index[]=new int[nums.length];
		
		for(int i=0;i<nums.length;i++){
			index[i]=i;
		}
		
		megre(nums,index,0,nums.length,count);
		
		List<Integer> result=new ArrayList<>(count.length);
		for(int i=0;i<count.length;i++){
			result.add(count[i]);
		}
		
		return result;
		
	}
	
	private void megre(int[] nums, int[] index, int left, int right, int[] count) {
		
		if(left+1>=right){
			return ;
		}
		
		int mid;
		mid=(left+right)/2;
		
		megre(nums, index, left, mid, count);
		megre(nums, index, mid, right, count);
		
		int temp[]=new int[right-left];
		int tempindex[]=new int[right-left];
		int leftindex,rightindex,curindex;
		
		leftindex=left;
		rightindex=mid;
		curindex=0;
		
		while(leftindex<mid&&rightindex<right){
			if(nums[leftindex]<=nums[rightindex]){
				
				count[index[leftindex]]+=rightindex-mid;
				
				temp[curindex]=nums[leftindex];
				tempindex[curindex++]=index[leftindex++];
			}
			else{
				temp[curindex]=nums[rightindex];
				tempindex[curindex++]=index[rightindex++];
			}
		}
		
		while(leftindex<mid){
			
			count[index[leftindex]]+=rightindex-mid;
			
			temp[curindex]=nums[leftindex];
			tempindex[curindex++]=index[leftindex++];
		}
		
		while(rightindex<right){
			temp[curindex]=nums[rightindex];
			tempindex[curindex++]=index[rightindex++];
		}
		
		curindex=0;
		for(int i=left;i<right;i++,curindex++){
			nums[i]=temp[curindex];
			index[i]=tempindex[curindex];
		}
		
	}
	
//	private void megre(int[] nums, int[] index, int left, int right, int[] count) {
//		
//		if(left+1>=right){
//			return ;
//		}
//		
//		int mid,k;
//		mid=(left+right)/2;
//		
//		megre(nums, index, left, mid, count);
//		megre(nums, index, mid, right, count);
//		
//		k=mid;
//		for(int i=left;i<mid;i++){
//			while(k<right){
//				if(nums[i]>nums[k]){
//					k++;
//				}
//				else{
//					break;
//				}
//			}
//			count[index[i]]+=k-mid;
//		}
//		
//		int temp[]=new int[right-left];
//		int tempindex[]=new int[right-left];
//		int leftindex,rightindex,curindex;
//		
//		leftindex=left;
//		rightindex=mid;
//		curindex=0;
//		
//		while(leftindex<mid&&rightindex<right){
//			if(nums[leftindex]<nums[rightindex]){
//				temp[curindex]=nums[leftindex];
//				tempindex[curindex++]=index[leftindex++];
//			}
//			else{
//				temp[curindex]=nums[rightindex];
//				tempindex[curindex++]=index[rightindex++];
//			}
//		}
//		
//		while(leftindex<mid){
//			temp[curindex]=nums[leftindex];
//			tempindex[curindex++]=index[leftindex++];
//		}
//		
//		while(rightindex<right){
//			temp[curindex]=nums[rightindex];
//			tempindex[curindex++]=index[rightindex++];
//		}
//		
//		curindex=0;
//		for(int i=left;i<right;i++,curindex++){
//			nums[i]=temp[curindex];
//			index[i]=tempindex[curindex];
//		}
//		
//	}
	
	class TreeNode {
        int val;
        int count = 1;
        TreeNode left;
        TreeNode right;
        
        public TreeNode(int val) {
            this.val = val;
        }
    }
    
    public List<Integer> countSmaller3(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        if(nums==null||nums.length==0){
        	return result;
        }
        
        TreeNode root=new TreeNode(nums[nums.length-1]);
        result.add(0);
        
        for(int i=nums.length-2;i>=0;i--){
        	result.add(0,AddNode(root,nums[i]));
        }
        
        return result;
    }
    
    private int AddNode(TreeNode root, int target) {
    	
    	int count=0;
    	
    	while(true){
    		if(target<=root.val){
    			root.count++;
    			if(root.left==null){
    				root.left=new TreeNode(target);
    				break;
    			}
    			else{
    				root=root.left;
    			}
    		}
    		else{
    			count+=root.count;
    			if(root.right==null){
    				root.right=new TreeNode(target);
    				break;
    			}
    			else{
    				root=root.right;
    			}
    		}
    	}
    	
		return count;
	}

	public static void main(String[] args) {
		
		LC_315 lc=new LC_315();
		
		int nums[]={5,2,6,1};
		
		System.out.println(lc.countSmaller2(nums).toString());
		
	}

}
