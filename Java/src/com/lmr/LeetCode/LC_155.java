package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LC_155 {

	public static void main(String[] args) {

		LC_155 lc = new LC_155();

		MinStack minStack = new MinStack();

		minStack.push(10);
		minStack.push(15);
		minStack.push(3);
		System.out.println(minStack.top());
		minStack.pop();
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.getMin());
		minStack.pop();

	}

}

class MinStack {

	Stack<Integer> stack;
	List<Integer> minlist = new ArrayList<>();

	public MinStack() {
		stack = new Stack<Integer>();
		minlist.add(Integer.MAX_VALUE);
	}

	public void push(int x) {
		stack.push(x);
		int stacksize = stack.size();
		if (x <= minlist.get(stacksize - 1)) {
			minlist.add(x);
		} else {
			minlist.add(minlist.get(stacksize - 1));
		}
	}

	public void pop() {
		stack.pop();
		minlist.remove(minlist.size() - 1);
	}

	public int top() {
		return stack.peek();

	}

	public int getMin() {
		return minlist.get(stack.size());

	}
}

//class MinStack {
//	
//	Stack<Integer> stack;
//	int min;
//
//	public MinStack() {
//		stack = new Stack<>();
//		min = Integer.MAX_VALUE;
//	}
//
//	public void push(int x) {
//		if (min >= x) {
//			stack.push(min);
//			min = x;
//		}
//		stack.push(x);
//	}
//
//	public void pop() {
//		if (stack.pop() == min) {
//			min = stack.pop();
//		}
//	}
//
//	public int top() {
//		return stack.peek();
//	}
//
//	public int getMin() {
//		return min;
//	}
//
//}