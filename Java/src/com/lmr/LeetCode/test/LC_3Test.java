package com.lmr.LeetCode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lmr.LeetCode.LC_3;

public class LC_3Test {

	@Test
	public void testLengthOfLongestSubstring() {
		
		String s="abcabcbb";
		int maxlength;
		
		LC_3 lc=new LC_3();
		maxlength=lc.lengthOfLongestSubstring2(s);
		
		System.out.println(maxlength);
		
	}

}
