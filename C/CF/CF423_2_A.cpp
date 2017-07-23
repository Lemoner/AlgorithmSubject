#include <stdio.h>
#include <iostream>
using namespace std;

int main(void){
	
	int n,a,b,c,sum,t;
	
	cin>>n>>a>>b;
	
	sum=0;
	c=0;
	
	for(int i=0;i<n;i++){
		cin>>t;
		
		if(t==1){
			if(a>0){
				a--;
			}
			else if(b>0){
				b--;
				c++;
			}
			else if(c>0){
				c--;
			}
			else{
				sum++;
			}
		}
		else{
			if(b>0){
				b--;
			}
			else{
				sum+=2;
			}
		}
		
	}
	
	cout<<sum;
	
}
