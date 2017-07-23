#include <stdio.h>
#include <string.h>
#include <iostream>
using namespace std;

const int maxn = 1000001;

int main(void){

	int n,k,x,p,u,maxlength;
	char t[maxn]="";
	char a[maxn]="";
	
	maxlength=0;
	
	cin>>n;
	
	while(n--){
		
		cin>>t; 
		cin>>k;
		
		u=strlen(t);
		p=0;
		
		while(k--){
			
			cin>>x;
			
			p=p>x?p:x;
			
			for(int i=p;i<x+u;i++){
				a[i]=t[i-x];
			}
			
			p=x+u;
		}
		
		if(maxlength<p){
			maxlength=p;
		}
		
	}
	
	for(int i=1;i<maxlength;i++){
		if(a[i]){
			cout<<a[i];
		}
		else{
			cout<<'a';
		}
	}
	
}
