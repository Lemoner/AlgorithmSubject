package com.lmr.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC_49 {

	public List<List<String>> groupAnagrams(String[] strs) {
		
		int dict[][]=new int[strs.length][26];
		int temp[]=new int[26];
		int check,dictsize;
		
		List<List<String>> result=new ArrayList<>();
		dictsize=0;
		
		for(int i=0;i<strs.length;i++){
			Arrays.fill(temp, 0);
			for(int j=0;j<strs[i].length();j++){
				temp[strs[i].charAt(j)-'a']++;
			}
			check=CheckEqualAndUpadate(dict,temp,dictsize);
			if(check==-1){
				result.add(new ArrayList<String>());
				result.get(result.size()-1).add(strs[i]);
				dictsize++;
			}
			else{
				result.get(check).add(strs[i]);
			}
		}
		
		return result;

	}
	
	private int CheckEqualAndUpadate(int[][] dict, int[] temp, int dictsize) {
		
		int i,j;
		
		for(i=0;i<dictsize;i++){
			for(j=0;j<26;j++){
				if(dict[i][j]!=temp[j]){
					break;
				}
			}
			if(j==26){
				return i;
			}
		}

		for(i=0;i<26;i++){
			dict[dictsize][i]=temp[i];
		}
		
		return -1;
		
	}
	
	public List<List<String>> groupAnagrams1(String[] strs) {
		
		List<List<String>> result=new ArrayList<>();
		Map<String, List<String>> map=new HashMap<>();
		
		for(String str:strs){
			char temp[]=new char[26];
			for(int i=0;i<str.length();i++){
				temp[str.charAt(i)-'a']++;
			}
			String key=new String(temp);
			if(map.containsKey(key)){
				map.get(key).add(str);
			}
			else{
				List<String> value=new ArrayList<>();
				value.add(str);
				map.put(key, value);
			}
		}
		
		for(List<String> list:map.values()){
			result.add(list);
		}
				
		return result;
		
	}
	
	public List<List<String>> groupAnagrams2(String[] strs) {
		
		Map<String, List<String>> map=new HashMap<>();
		
		for(String str:strs){
			char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
            
			if(map.containsKey(key)){
				map.get(key).add(str);
			}
			else{
				List<String> value=new ArrayList<>();
				value.add(str);
				map.put(key, value);
			}
		}
				
		return new ArrayList<>(map.values());
		
	}
	
	public List<List<String>> groupAnagrams3(String[] strs) {
		
		int[] temp = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
		Map<Integer, List<String>> map=new HashMap<>();
		
		for(String str:strs){
			int key=1;
			for(int i=0;i<str.length();i++){
				key*=temp[str.charAt(i)-'a'];
			}
			if(map.containsKey(key)){
				map.get(key).add(str);
			}
			else{
				List<String> value=new ArrayList<>();
				value.add(str);
				map.put(key, value);
			}
		}
		
		return new ArrayList<>(map.values());
		
	}

	public static void main(String[] args) {
		
		LC_49 lc=new LC_49();
		
		String strs[]={"eat", "tea", "tan", "ate", "nat", "bat"};
		
		System.out.println(lc.groupAnagrams1(strs).toString());
		
	}

}
