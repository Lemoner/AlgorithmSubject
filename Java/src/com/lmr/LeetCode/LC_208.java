package com.lmr.LeetCode;

public class LC_208 {

	public static void main(String[] args) {
		
		Trie trie=new Trie();
		
		trie.insert("bca");
		trie.insert("bcd");
		trie.insert("abc");
		trie.insert("bca");
		
		WordTreeNode.Inorder(trie.root);
		
		System.out.println(trie.search("ss"));
		System.out.println(trie.search("abc"));
		
		System.out.println(trie.startsWith("bc"));
		
	}
	
}

class Trie {
	
	public WordTreeNode root;

    /** Initialize your data structure here. */
    public Trie() {
        root=null;
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        if(root==null){
        	root=new WordTreeNode(word);
        }
        else{
        	WordTreeNode node=root;
        	while(node!=null){
        		if(word.compareTo(node.val)>=0){
        			if(node.right==null){
        				node.right=new WordTreeNode(word);
        				break;
        			}
        			else{
        				node=node.right;
        			}
        		}
        		else{
        			if(node.left==null){
        				node.left=new WordTreeNode(word);
        				break;
        			}
        			else{
        				node=node.left;
        			}
        		}
        	}
        }
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
    	WordTreeNode node=root;
    	while(node!=null){
    		int compare=word.compareTo(node.val);
    		if(compare==0){
    			return true;
    		}
    		else if(compare>0){
    			node=node.right;
    		}
    		else{
    			node=node.left;
    		}
    	}
    	return false;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
    	WordTreeNode node=root;
    	while(node!=null){
    		boolean start=node.val.startsWith(prefix);
    		if(start==true){
    			return true;
    		}
    		else{
    			int compare=prefix.compareTo(node.val);
        		if(compare==0){
        			return true;
        		}
        		else if(compare>0){
        			node=node.right;
        		}
        		else{
        			node=node.left;
        		}
    		}
    	}
		return false;
    }
    
}

//class Trie {
//	class TreeNode {
//		TreeNode[] children = new TreeNode[27];
//	}
//
//	/** Initialize your data structure here. */
//	TreeNode root;
//
//	public Trie() {
//		root = new TreeNode();
//	}
//
//	/** Inserts a word into the trie. */
//	public void insert(String word) {
//		char[] arr = word.toCharArray();
//		TreeNode cur = root;
//		for (char c : arr) {
//			if (cur.children[c - 'a'] == null)
//				cur.children[c - 'a'] = new TreeNode();
//			cur = cur.children[c - 'a'];
//		}
//		cur.children[26] = new TreeNode();
//	}
//
//	/** Returns if the word is in the trie. */
//	public boolean search(String word) {
//		TreeNode cur = root;
//		for (char c : word.toCharArray()) {
//			if (cur.children[c - 'a'] == null)
//				return false;
//			cur = cur.children[c - 'a'];
//		}
//		return cur.children[26] != null;
//	}
//
//	/**
//	 * Returns if there is any word in the trie that starts with the given
//	 * prefix.
//	 */
//	public boolean startsWith(String prefix) {
//		TreeNode cur = root;
//		for (char c : prefix.toCharArray()) {
//			if (cur.children[c - 'a'] == null)
//				return false;
//			cur = cur.children[c - 'a'];
//		}
//		return true;
//	}
//}
