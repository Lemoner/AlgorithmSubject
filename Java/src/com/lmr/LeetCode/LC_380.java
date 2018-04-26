package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class LC_380 {

	public static void main(String[] args) {
		
		RandomizedSet randomSet = new RandomizedSet();
		System.out.println(randomSet.insert(1));
		System.out.println(randomSet.remove(2));
		System.out.println(randomSet.insert(2));
		System.out.println(randomSet.getRandom());
		System.out.println(randomSet.remove(1));
		System.out.println(randomSet.insert(2));
		System.out.println(randomSet.getRandom());
		
	}
	
}

//class RandomizedSet {
//
//	Set<Integer> set;
//	
//    /** Initialize your data structure here. */
//    public RandomizedSet() {
//    	set=new HashSet<>();
//    }
//    
//    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
//    public boolean insert(int val) {
//        return set.add(val);
//    }
//    
//    /** Removes a value from the set. Returns true if the set contained the specified element. */
//    public boolean remove(int val) {
//        return set.remove(val);
//    }
//    
//    /** Get a random element from the set. */
//    public int getRandom() {
//        return (int) set.toArray()[(int) (Math.random()*set.size())];
//    }
//}

class RandomizedSet {

	Map<Integer, Integer> map=new HashMap<>();
	List<Integer> list=new ArrayList<>();
	Random random=new Random();
 	
    /** Initialize your data structure here. */
    public RandomizedSet() {
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
    	
    	if(map.containsKey(val)){
    		return false;
    	}
    	
    	map.put(val, list.size());
    	list.add(val);
    	
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
    	
    	if(!map.containsKey(val)){
    		return false;
    	}
    	
    	int index=map.remove(val);
    	int value=list.remove(list.size()-1);
    	
    	if(index!=list.size()){
    		list.set(index, value);
        	map.put(value, index);
    	}
    	
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}

