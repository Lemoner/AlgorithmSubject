package com.lmr.LeetCode;

import java.util.Stack;

public class LC_55 {

	public boolean canJump1(int[] nums) {

		if(nums==null||nums.length<=1){
			return true;
		}
		
		Stack<Integer> stack=new Stack<>();
		int index;
		
		stack.push(0);
		
		while(!stack.isEmpty()){
			index=stack.pop();
			if(index+nums[index]>=nums.length-1){
				return true;
			}
			else{
				for(int i=1;i<=nums[index];i++){
					if(nums[index+i]!=0){
						stack.push(index+i);
					}
				}
				nums[index]=0;
			}
		}
		
		return false;

	}
	
	public boolean canJump2(int[] nums) {

		if(nums==null||nums.length<=1){
			return true;
		}
		
		int max=0;
		
		for(int i=0;i<nums.length;i++){
			if(i>max){
				return false;
			}
			max=Math.max(max, i+nums[i]);
			if(max>=nums.length-1){
				return true;
			}
		}
		
		return false;
		
	}
	
	public boolean canJump3(int[] nums) {

		if(nums==null||nums.length<=1){
			return true;
		}
		
		int index=nums.length-1;
		
		for(int i=nums.length-1;i>=0;i--){
			if(i+nums[i]>=index){
				index=i;
			}
		}
		
		return index==0;
		
	}
	
	public boolean canJump4(int[] nums) {
        if (nums == null || nums.length == 0){
            return false;
        }
        
        int len = nums.length - 1;
        if (nums[0] == len){
            return true;
        }
        
        //循环获取0点。
        int extinct = 0;
        for (int i=len-1; i>=0; --i){
            int data = nums[i];
            if (data == 0){
                //初始化范围
                extinct = 1;
                //进行向前感染
                for (int j=i-1 ;j>=0; --j){
                    int value = nums[j];
                    //进行感染
                    if (value <= extinct){
                        nums[j] = -1;
                        extinct++;
                    }
                    else{
                        //无法感染
                        break;
                    }
                }
                
                //判断起始点是否被感染
                if (nums[0] <= 0){
                    return false;
                }
            }
        }
        return true;
    }
	
	public boolean canJump5(int[] nums) {

		if(nums[0]>=nums.length-1){
			return true;
		}
		
		int t,flag;
		for(int i=nums.length-2;i>=0;i--){
			if(nums[i]==0){
				t=1;
				flag=1;
				for(int j=i-1;j>=0;j--){
					if(nums[j]<=t){
						t++;
					}
					else{
						flag=0;
						i=j;
						break;
					}
				}
				if(flag==1){
					return false;
				}
			}
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		
		LC_55 lc=new LC_55();
		
//		int[] nums={2,3,1,1,4};
		int[] nums={1,1,1,0};
		
		System.out.println(lc.canJump5(nums));
		
	}

}
