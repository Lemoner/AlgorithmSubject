package com.lmr.common;

public class Test {
	private static int i=1;
    public int getNext(){
         return i++;
    }
    public void fun(){
    	i++;
    }
    public static void main(String [] args){
        Test test=new Test();
        Test testObject=new Test();
        test.getNext();
        testObject.getNext();
        System.out.println(testObject.getNext());
    }
}
