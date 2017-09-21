package com.lmr.LeetCode;

public class LC_5 {

	public String longestPalindrome1(String s) {
		
		int start,end,max,maxstart,maxend;
		
		max=0;
		maxstart=0;
		maxend=0;
		
		for(int i=0;i<s.length();i++){
			start=i;
			end=i;
			while(start>=0&&end<s.length()&&s.charAt(start)==s.charAt(end)){
				start--;
				end++;
			}
			if(end-start-1>max){
				max=end-start-1;
				maxstart=start+1;
				maxend=end-1;
			}
			
			start=i;
			end=i+1;
			while(start>=0&&end<s.length()&&s.charAt(start)==s.charAt(end)){
				start--;
				end++;
			}
			if(end-start-1>max){
				max=end-start-1;
				maxstart=start+1;
				maxend=end-1;
			}
		}
		
		return s.substring(maxstart, maxend+1);
		
	}
	
	public String longestPalindrome2(String s) {
		
		StringBuffer sb=new StringBuffer();
		
		sb.append('#');
		for(int i=0;i<s.length();i++){
			sb.append(s.charAt(i));
			sb.append('#');
		}
		
		String ns=sb.toString();
		
		int start,end,max,maxstart,maxend;
		
		max=0;
		maxstart=0;
		maxend=0;
		
		for(int i=0;i<ns.length();i++){
			
			start=i;
			end=i;
			while(start>=0&&end<ns.length()&&ns.charAt(start)==ns.charAt(end)){
				start--;
				end++;
			}
			if(end-start-1>max){
				max=end-start-1;
				maxstart=start+1;
				maxend=end-1;
			}
			
		}

		return s.substring(maxstart/2, maxend/2);
		
	}
	
	public String longestPalindrome3(String s) {
		
		StringBuffer sb=new StringBuffer();
		
		sb.append('#');
		for(int i=0;i<s.length();i++){
			sb.append(s.charAt(i));
			sb.append('#');
		}
		
		String ns=sb.toString();
		
		int p,mid,max,maxstart,maxend;
		int[] len=new int[ns.length()];
		
		p=0;
		mid=0;
		max=0;
		maxstart=0;
		maxend=0;
		len[0]=1;
		
		for(int i=1;i<ns.length();i++){
			
			if(i<p){
				len[i]=Math.min(p-i, len[2*mid-i]);
			}
			else{
				len[i]=1;
			}
			
			while(i-len[i]>=0&&i+len[i]<ns.length()&&ns.charAt(i-len[i])==ns.charAt(i+len[i])){
				len[i]++;
			}
			
			if(i+len[i]>p){
				p=i+len[i];
				mid=i;
				
				if(max<len[i]-1){
					max=len[i]-1;
					maxstart=i-len[i]+1;
					maxend=i+len[i]-1;
				}
					
			}
			
		}
		
		return s.substring(maxstart/2, maxend/2);
	}
	
	public static void main(String[] args) {
		
		LC_5 lc=new LC_5();
		
//		String s="cbbd";
		String s="babad";
		System.out.println(lc.longestPalindrome2(s));
		
	}

}
