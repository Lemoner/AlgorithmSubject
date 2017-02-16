#include<iostream>
#include<stdio.h>
using namespace std;
int main(void)
{
	int n=0,max=0,count=0;
	int a[100],b[100];
	while(cin>>a[n]){
		n++; 
		if(getchar()=='\n')
		break;
	}
	for(int i=0;i<n;i++){
		b[i]=1;
		for(int j=0;j<i;j++){
			if(a[i]<=a[j]){
				int k=b[j]+1;
				if(k>b[i]){
					b[i]=k;
				}
			}
		}
		if(b[i]>max){
			max=b[i];
		}
	}
	cout<<max<<endl;
	max=0;
	for(int i=0;i<n;i++){
		if(a[i]>=max){
			b[count]=a[i];
			count++;
			max=a[i];
		}
		else{
			int minb,min=9999;
			for(int j=0;j<count;j++){
				if(b[j]<min&&b[j]>=a[i]){
					min=b[j];
					minb=j;
				}
			}
			b[minb]=a[i];
			max=0;
			for(int j=0;j<count;j++){
			    if(b[j]>max){
				    max=b[j];
				}
		    }
		}
	}
	cout<<count;
	return 0;
}
