package com.lmr.LeetCode;

public class LC_337 {
	
	public int rob(TreeNode root) {
		
		int result[]=DFS(root);
		
		return Math.max(result[0], result[1]);

	}

	
	private int[] DFS(TreeNode rootnode) {
		
		if(rootnode==null){
			return new int[]{0,0};
		}
		
		int left[]=DFS(rootnode.left);
		int right[]=DFS(rootnode.right);
		
		int root[]=new int[2];
		root[0]=Math.max(left[0], left[1])+Math.max(right[0], right[1]);
		root[1]=rootnode.val+left[0]+right[0];
		
		return root;
	}
	
	public int rob2(TreeNode root) {
        if (root == null) return 0;
        int[] result = help(root); //return int[]{with root, without root}
        return Math.max(result[0], result[1]);
    }
    
    private int[] help(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }
        int[] left = help(root.left);
        int[] right = help(root.right);
        //with root
        int with = root.val + left[1] + right[1];
        int without = left[0] + right[0];
        with = Math.max(with, without);
        int[] result = new int[]{with, without};
        return result;
    }


	public static void main(String[] args) {
		
		LC_337 lc=new LC_337();
		
		TreeNode root=new TreeNode(4);
		TreeNode node1=new TreeNode(8);
		TreeNode node2=new TreeNode(5);
		TreeNode node3=new TreeNode(1);
		TreeNode node4=new TreeNode(2);
		TreeNode node5=new TreeNode(6);
		TreeNode node6=new TreeNode(1);
		
		root.left=node1;
		root.right=node2;
		node1.left=node3;
		node1.right=node4;
		node2.left=node5;
		node2.right=node6;
		
		System.out.println(lc.rob(root));
		System.out.println(lc.rob2(root));
		
	}

}
