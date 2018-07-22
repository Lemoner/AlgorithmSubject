package com.lmr.NK;

import java.util.Scanner;
import java.util.*;

class Node1{
    int l;
    int r;
    
    public Node1(int l,int r){
        this.l=l;
        this.r=r;
    }
    
}


public class Main2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            
            int n,count;
            List<Node1> nolist=new ArrayList();
            String str;
            
            n=in.nextInt();
            in.nextLine();
            
            count=0;
            for(int i=0;i<n;i++){
                str=in.nextLine();
                Node1 node=isFun(str);
                if(node.l==0&&node.r==0){
                    count++;
                }
                else{
                    nolist.add(node);
                }
            }
            
            count=count*count;
            for(int i=0;i<nolist.size();i++){
                for(int j=0;j<nolist.size();j++){
                    if(i!=j){
                        Node1 p=nolist.get(i);
                        Node1 q=nolist.get(j);
                        if(p.l==q.r&&p.r==0&&q.l==0){
                            count++;
                        }
//                        if(p.r==q.l&&p.l==0&&q.r==0){
//                            count++;
//                        }
                    }
                }
            }
            
            System.out.println(count);
            
        }
    }
    
    public static Node1 isFun(String str){
        int a,b;
        a=b=0;
        for(char c:str.toCharArray()){
            if(c=='('){
                a++;
            }
            else if(c==')'){
                if(a==0){
                    b++;
                }
                else{
                    a--;
                }
            }
        }
        return new Node1(a,b);
    }
    
}