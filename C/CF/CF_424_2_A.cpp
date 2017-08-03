#include<stdio.h>
#include<iostream>
using namespace std;
int main()
{
	int n,a,front,flag,result;
	cin>>n;
	
	cin>>a;
	n--;
	front=a;
	flag=1;
	result=1;
	
	while(n--){
		
		cin>>a;
		
		if(result==1){
			if(flag==1){
				if(a>front){
					
				}
				else if(a==front){
					flag=0;
				}
				else{
					flag=-1;
				}
			}
			else if(flag==0){
				if(a>front){
					result=0;
				}
				else if(a==front){
					
				}
				else{
					flag=-1;
				}
			}
			else if(flag==-1){
				if(a>=front){
					result=0;
				}
			}
			
			front=a;
		}
		
	}
	
	if(result==1){
		cout<<"YES";
	}
	else{
		cout<<"NO";
	}
	
}
