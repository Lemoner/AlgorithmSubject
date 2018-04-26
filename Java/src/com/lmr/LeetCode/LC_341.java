package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LC_341 {

}

class NestedIterator implements Iterator<Integer> {

	int index;
	List<Integer> allList;
	
    NestedIterator(List<NestedInteger> nestedList) {
    	allList=extract(nestedList);
    	index=0;
    }
    
    public List<Integer> extract(List<NestedInteger> nestedList){
    	List<Integer> list=new ArrayList<>();
    	for(NestedInteger nested:nestedList){
    		if(nested.isInteger()){
        		list.add(nested.getInteger());
        	}
        	else{
        		list.addAll(extract(nested.getList()));
        	}
    	}
    	return list;
    }

    @Override
    public Integer next() {
		return allList.get(index++);
        
    }

    @Override
    public boolean hasNext() {
		return index<allList.size();
        
    }
}
