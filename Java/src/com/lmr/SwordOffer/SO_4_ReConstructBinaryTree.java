package com.lmr.SwordOffer;

public class SO_4_ReConstructBinaryTree {

	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		
		if(pre.length==0){
			return null;
		}
		
		return NewTreeNode(pre,in,0,pre.length-1,0,in.length-1);
		
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

}
