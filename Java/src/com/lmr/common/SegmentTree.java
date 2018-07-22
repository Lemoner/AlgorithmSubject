package com.lmr.common;

import java.util.Arrays;
import java.util.Scanner;

/**
 * �߶���
 */
public class SegmentTree {

	/**
	 * �ڵ���
	 */
	int n;
	
	int[] A;
	/**
	 * �߶���
	 */
	int[] Sum;
	
	public SegmentTree(int n) {
		this.n=n;
		A=new int[n+1];
		Sum=new int[n<<2];
	}
	
	/**
	 * �����߶���
	 */
	public void Bulid(int l,int r,int index){
		if(l==r){
			Sum[index]=A[l];
			return ;
		}
		int m=(l+r)>>1;
		Bulid(l, m, index<<1);
		Bulid(m+1, r, index<<1|1);
		PushUp(index);
	}
	
	/**
	 * ���½ڵ���Ϣ����Ҷ�ӽڵ㣩
	 */
	public void PushUp(int index){
		Sum[index]=Sum[index<<1]+Sum[index<<1|1];
	}
	
	/**
	 * �޸ĵ�
	 * A[k]+=t
	 */
	public void Update(int k, int t, int l, int r,int index){
		if(l==r){
			Sum[index]+=t;
			A[k]+=t;
			return ;
		}
		int m=(l+r)>>1;
		if(k<=m){
			Update(k, t, l, m, index<<1);
		}
		else{
			Update(k, t, m+1, r, index<<1|1);
		}
		PushUp(index);
	}
	
	/**
	 * ��ѯ
	 * ����[L,R]
	 */
	public int Query(int L,int R, int l,int r,int index){
		if(L<=l&&r<=R){
			return Sum[index];
		}
		int result=0;
		int m=(l+r)>>1;
		
		if(L<=m){
			result+=Query(L, R, l, m, index<<1);
		}
		if(R>m){
			result+=Query(L, R, m+1, r, index<<1|1);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		SegmentTree segmentTree=new SegmentTree(scanner.nextInt());
		
		for(int i=1;i<=segmentTree.n;i++){
			segmentTree.A[i]=scanner.nextInt();
		}
		
		segmentTree.Bulid(1, segmentTree.n, 1);
		System.out.println(Arrays.toString(segmentTree.A));
		System.out.println(Arrays.toString(segmentTree.Sum));
		System.out.println(segmentTree.Query(1, 5, 1, segmentTree.n, 1));
		
		segmentTree.Update(1, 3, 1, segmentTree.n, 1);
		System.out.println(Arrays.toString(segmentTree.A));
		System.out.println(Arrays.toString(segmentTree.Sum));
		System.out.println(segmentTree.Query(1, 4, 1, segmentTree.n, 1));
		
	}
	
}
