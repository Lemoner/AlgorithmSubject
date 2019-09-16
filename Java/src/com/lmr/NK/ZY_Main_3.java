package com.lmr.NK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ZY_Main_3 {

    public static class TreeNode {

        long no;
        long val;
        long max=0;
        List<TreeNode> child = new ArrayList<>();

        TreeNode(long no, long val) {
            this.no = no;
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long u, v, c;
        HashMap<Long, TreeNode> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            map.put((long)i, new TreeNode((long)i,0));
        }

        for (int i = 1; i < n; i++) {
            u = scanner.nextLong();
            v = scanner.nextLong();
            c = scanner.nextLong();
            TreeNode uNode = map.get(u);
            TreeNode vNode = map.get(v);
            uNode.child.add(vNode);
            vNode.val=c;
        }

        DFS(map.get((long)1));

        for (int i = 1; i <n; i++) {
            System.out.print(map.get((long)i).max+" ");
        }
        System.out.print(map.get((long)n).max+" ");

    }

    private static void DFS(TreeNode root) {
        if(root.child.size()==0){
            root.max=0;
            return ;
        }
        long max=Integer.MIN_VALUE;
        for(TreeNode node:root.child){
            if(node.child.size()>0){
                DFS(node);
            }
            long t=node.max+node.val;
            max=t>max?t:max;
        }
        root.max=max;
    }

}
