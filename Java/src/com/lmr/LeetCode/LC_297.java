package com.lmr.LeetCode;

public class LC_297 {
	
	private StringBuffer sb;
	
	// Encodes a tree to a single string.
    public String serialize(TreeNode root) {
    	
    	sb=new StringBuffer();
    	
    	DFSSe(root);
    	
    	return sb.toString();
    	
    }
    
    private void DFSSe(TreeNode root){
    	
    	if(root==null){
    		sb.append("n");
    		return ;
    	}
    	
    	sb.append(root.val);
    	sb.append(",");
    	DFSSe(root.left);
    	sb.append(",");
    	DFSSe(root.right);
    	
		return ;
		
    }

    private int index;
    private String[] result;
    
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
    	
    	index=0;
    	result=data.split(",");
    	
		return DFSDe();
        
    }
    
    private TreeNode DFSDe() {
    	
    	if(result[index].equals("n")){
    		index++;
    		return null;
    	}
    	
    	TreeNode node=new TreeNode(Integer.parseInt(result[index++]));
    	node.left=DFSDe();
    	node.right=DFSDe();
    	
		return node;
	}

	public static void main(String[] args) {
		
    	LC_297 lc=new LC_297();
    	
    	TreeNode root=new TreeNode(1);
    	TreeNode node1=new TreeNode(2);
    	TreeNode node2=new TreeNode(3);
    	TreeNode node3=new TreeNode(4);
    	
    	root.left=node1;
    	root.right=node2;
    	node2.left=node3;
    	
//    	TreeNode root=null;
    	
    	String data=lc.serialize(root);
    	
    	System.out.println(data);
    	
    	TreeNode.Allorder(lc.deserialize(data));
    	
	}
	
}
