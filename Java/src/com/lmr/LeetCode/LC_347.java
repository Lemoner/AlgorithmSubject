package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LC_347 {

	public List<Integer> topKFrequent(int[] nums, int k) {
		
		int sum[][]=new int[nums.length][2];
		int temp[];
		int count,index;
		
		count=0;
		
		for(int i=0;i<nums.length;i++){
			index=count;
			for(int j=0;j<count;j++){
				if(sum[j][0]==nums[i]){
					index=j;
					break;
				}
			}
			if(index==count){
				sum[index][0]=nums[i];
				sum[index][1]=1;
				count++;
			}
			else{
				sum[index][1]++;
				index--;
				while(index>=0){
					if(sum[index+1][1]>sum[index][1]){
						temp=sum[index+1];
						sum[index+1]=sum[index];
						sum[index]=temp;
						index--;
					}
					else{
						break;
					}
				}
			}
		}
		
		List<Integer> result=new ArrayList<>();
		
		for(int i=0;i<k;i++){
			result.add(sum[i][0]);
		}
		
		return result;

	}
	
	public List<Integer> topKFrequent1(int[] nums, int k) {
		
		Map<Integer, Integer> summap=new HashMap<>();
		List<Integer> bucket[]=new ArrayList[nums.length+1];
		List<Integer> result=new ArrayList<>();
		
		for(int i=0;i<nums.length;i++){
			summap.put(nums[i], summap.getOrDefault(nums[i], 0)+1);
		}
		
		for (Entry<Integer, Integer> entry : summap.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();
			if (bucket[value] == null) {
				bucket[value] = new ArrayList<>();
			}
			bucket[value].add(key);
		}
		
		for(int i=nums.length;i>=0&&k>0;i--){
			if(bucket[i]!=null){
				result.addAll(bucket[i]);
				k-=bucket[i].size();
			}
		}
		
		return result;
		
	}
	
	public List<Integer> topKFrequent3(int[] nums, int k) {
        List<Integer> res = new ArrayList<Integer> ();
        int min = nums[0];
        int max = nums[0];
        
        
        for(int n : nums){
            min = min < n ? min : n;
            max = max > n ? max : n;
        }
        int[] data = new int[max - min + 1];
        for(int n : nums) {
            data[n - min] ++;
        }
        
        List[] bucket = new List[nums.length + 1];
        for(int i = data.length -1 ; i >= 0; i --){
            if(data[i] > 0){
                if(bucket[data[i]] == null) 
                    bucket[data[i]] = new ArrayList<Integer>();
              
                List<Integer> list = bucket[data[i]];
                list.add(i + min);
                bucket[data[i]] = list;
            }
        }
      
        for(int i = bucket.length - 1 ; i >= 0 && res.size() < k; i-- ) {
            if(bucket[i] != null)
            res.addAll(bucket[i]);
        }
        
        return res;
    }
	
	public static void main(String[] args) {
		
		LC_347 lc=new LC_347();
		
		int nums[]={4,1,-1,2,2,-1,3};
		int k=2;
		
		System.out.println(lc.topKFrequent3(nums, k).toString());
		
	}
	
}
