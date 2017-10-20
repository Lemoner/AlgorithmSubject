package com.lmr.LeetCode;

public class LC_105 {
	
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		
		if(preorder.length==0){
			return null;
		}
		
		return NewTreeNode(preorder,inorder,0,preorder.length-1,0,inorder.length-1);

	}

	private TreeNode NewTreeNode(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd) {
		
		if(inStart>inEnd){
			return null;
		}
		
		TreeNode root=new TreeNode(preorder[preStart]);
		int index=FindInorder(preorder[preStart],inorder,inStart,inEnd);
		int left=index-inStart;
		root.left=NewTreeNode(preorder,inorder,preStart+1,preStart+left,inStart,index-1); 
		root.right=NewTreeNode(preorder,inorder,preStart+left+1,preEnd,index+1,inEnd);
		
		return root;
	}
	
	private int FindInorder(int x, int[] inorder, int start, int end) {
		
		for(int i=start;i<=end;i++){
			if(inorder[i]==x){
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		LC_105 lc=new LC_105();
		
		int[] preorder={1,2,3};
		int[] inorder={2,3,1};
		
		LC_94 ll=new LC_94();
		
		System.out.println(ll.inorderTraversal(lc.buildTree(preorder, inorder)));
		
	}
	
}
