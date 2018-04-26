package com.lmr.LeetCode;

import java.util.Arrays;

public class LC_217 {

	public boolean containsDuplicate(int[] nums) {
		
		if(nums==null||nums.length==0){
			return false;
		}
		
		Arrays.sort(nums);
		
		for(int i=1;i<nums.length;i++){
			if(nums[i]==nums[i-1]){
				return true;
			}
		}
		
		return false;

	}
	
	public boolean containsDuplicate1(int[] nums) {
        //�����鲻���ڣ����߳���С��2ʱ�������ܴ����ظ�����
        if(nums == null || nums.length <= 1 ){
            return false;
        }

        //�ҳ������е����������С��
        int min = nums[0];
        int max = nums[0];
        for(int i = 1, size = nums.length; i < size; i++){
            if(nums[i] < min){
                min = nums[i];
            }else if(nums[i] > max){
                max = nums[i];
            }
        }

        //�������С��������С�����鳤�ȣ��ض������ظ�����
        if((max - min + 1 ) < nums.length){
            return true;
        }
        boolean[] results = new boolean[max - min + 1];
        for(int i = 0,size = nums.length; i < size; i++){
            //��ȥ��С������֤ƫ����Ϊ����
            int index = nums[i] - min;

            //��boolean�����λ�ñ���Ϊtrue����ʾ�����Ѿ����ֹ�
            if(results[index]){
                return true;
            }
            //��boolean��ƫ��λ������Ϊtrue
            results[index] = true;
        }
        return false;
    }

}
