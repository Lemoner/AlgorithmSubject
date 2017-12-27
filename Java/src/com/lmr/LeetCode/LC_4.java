package com.lmr.LeetCode;

public class LC_4 {
	
	public double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        
        int i,j,count,index,temp;
        double num;
        i=0;
        j=0;
        count=0;
        index=(nums1.length+nums2.length)/2;
        num=0;
        temp=0;
        
        while(i<nums1.length||j<nums2.length){
            
            if(i<nums1.length&&j<nums2.length){
                if(nums1[i]<nums2[j]){
                    temp=nums1[i];
                    i++;
                }
                else{
                    temp=nums2[j];
                    j++;
                }
            }
            else if(i<nums1.length){
                temp=nums1[i];
                i++;
            }
            else{
                temp=nums2[j];
                j++;
            }
            
            count++;
            
            if(count>=index){
                num=num+temp;
            }
            
            if(count==index+1){
                break;
            }
            
        }
        
        if((nums1.length+nums2.length)%2==0){
            return num/2;
        }
        else{
            return temp;
        }
        
    }
	
	public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
		
		int total=nums1.length+nums2.length;
		
		if(total%2==0){
			return FindKthNum(nums1,0,nums2,0,0);
		}
		else{
			return FindKthNum(nums1,0,nums2,0,0);
		}
		
	}

	private double FindKthNum(int[] nums1, int index1, int[] nums2, int index2, int k) {
		
//		if(nums1.length-index1>nums2.length-index2){
//			return FindKthNum(nums2,index2,nums1,index1,k);
//		}
//		
//		if(index1>=nums1.length){
//			return nums2[index2+k];
//		}
//			
//		if(k==1){
//			return Math.min(nums1[index1], nums2[index2]);
//		}
//		
//		int c1=k,c2=k-c1;
//		
//		int mid1=index1+c1<nums1.length?nums1[index1+c1]:Integer.MAX_VALUE;
//		int mid2=index2+c2<nums2.length?nums2[index2+c2]:Integer.MAX_VALUE;
//		
//		if(mid1>mid2){
//			return FindKthNum(nums1, index1+c1, nums2, index2, k-c1);
//		}
//		else if(mid1<mid2){
//			return FindKthNum(nums1, index1, nums2, index2+c2, k-c2);
//		}
//		else{
//			return mid1;
//		}
		
		if (index1 >= nums1.length)
			return nums2[index2 + k - 1];

		if (index2 >= nums2.length)
			return nums1[index1 + k - 1];

		if (k == 1)
			return Math.min(nums1[index1], nums2[index2]);

		int m1 = index1 + k / 2 - 1;
		int m2 = index2 + k / 2 - 1;

		int mid1 = m1 < nums1.length ? nums1[m1] : Integer.MAX_VALUE;
		int mid2 = m2 < nums2.length ? nums2[m2] : Integer.MAX_VALUE;

		if (mid1 < mid2) {
			return FindKthNum(nums1, m1+1, nums2, index2, k - k / 2);
		} else {
			return FindKthNum(nums1, index1, nums2, m2+1, k - k / 2);
		}
		
	}
	
	public double findMedianSortedArrays3(int[] nums1, int[] nums2) {
		
		return FindKthNum2(nums1, nums2, 3);
		
	}
	
	public int FindKthNum2(int[] nums1, int[] nums2, int k){
		
		if(nums1.length>nums2.length){
			return FindKthNum2(nums2, nums1, k);
		}
		
		int C1,C2,L1,L2,R1,R2,start,end;
		
		L1=0;
		L2=0;
		
		start=0;
		if(nums1.length>k){
			end=2*k;
		}
		else{
			end=2*nums1.length;
		}
		
		while(start<=end){
			
			C1=(start+end)/2;
			C2=2*k-C1;
			
//			L1=(C1==0)?Integer.MIN_VALUE:nums1[C1];
//			R1=(C1>=nums1.length-1)?Integer.MAX_VALUE:nums1[C1+1];
//			L2=(C2==0)?Integer.MIN_VALUE:nums2[C2];
//			R2=(C2>=nums2.length-1)?Integer.MAX_VALUE:nums2[C2+1];
			
			L1=(C1==0)?Integer.MIN_VALUE:nums1[(C1-1)/2];
			R1=(C1==2*nums1.length)?Integer.MAX_VALUE:nums1[C1/2];
			L2=(C2==0)?Integer.MIN_VALUE:nums2[(C2-1)/2];
			R2=(C2==2*nums2.length)?Integer.MAX_VALUE:nums2[C2/2];
			
			if(L1>R2){
				end=C1-1;
			}
			else if(L2>R1){
				start=C1+1;
			}
			else{
				break;
			}
			
		}
		
		return Math.max(L1, L2);
		
	}
	
}
