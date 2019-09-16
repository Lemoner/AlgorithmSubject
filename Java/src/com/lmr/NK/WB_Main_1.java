package com.lmr.NK;

import java.util.*;

public class WB_Main_1 {

    public static class Node{
        String str;
        Integer count;
        public Node(String str,Integer count){
            this.str=str;
            this.count=count;
        }

        @Override
        public String toString() {
            return str+"="+count;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] strs = in.nextLine().split(",");

        HashMap<String, Integer> map = new HashMap<>();

        for (String str : strs) {
            char c = str.charAt(str.length() - 1);
            if (c == 'd' || c == 'e') {
                if (map.containsKey(str)) {
                    map.put(str, map.get(str) + 1);
                } else {
                    map.put(str, 1);
                }
            }
        }

        List<Node> list=new ArrayList<>();

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            list.add(new Node(entry.getKey(),entry.getValue()));
        }

        list.sort(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if(o1.count>o2.count){
                    return -1;
                }else if(o1.count==o2.count){
                    return o1.str.compareTo(o2.str);
                }else{
                    return 1;
                }
            }
        });

        String s=list.toString();
        System.out.println("{"+s.substring(1,s.length()-1)+"}");


    }


}
