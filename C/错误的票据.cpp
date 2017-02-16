#include<iostream>
#include<stdio.h>
using namespace std;
int main(void)
{
	int a[10002]={0};
	int n,x,p,q,sum=0,min=9999;
	cin>>n;
	for(int i=0;i<n;i++){
		while(cin>>x){	
			sum++;
			a[x]+=1;
			if(x<min)
			min=x;
			if(getchar()=='\n')
			break;
		}
	}
	for(int i=min;i<min+sum;i++){
		if(a[i]==0)
		p=i;
		if(a[i]==2)
		q=i;
	}
	cout<<p<<" "<<q;
	return 0; 
} 
