package com.lmr.NK;

import java.util.*;

public class ZJTD_Main_43 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int q = scanner.nextInt();

        char[] s=scanner.nextLine().toCharArray();
        char[] str=new char[s.length/2+2];

        for(int i=0;i<s.length;i=i+2){
            str[i/2+1]=s[i];
        }

        int l,r;
        for(int i=0;i<q;i++){
            l=   scanner.nextInt();
            r=scanner.nextInt();
            System.out.println(Fun(str,l,r));
        }

    }

    private static int Fun(char[] str, int l, int r) {

        LinkedList<Character> list=new LinkedList<>();
        for(int i=l;i<=r;i++){
            list.add(str[i]);
        }

        int sum=0;



        return sum;
    }


}
