#include<iostream>
#include<stdio.h>
#include <string.h>
using namespace std;
int main(void){
	char str1[6];
	int a[5]={0};
	gets(str1);
	int t=0;
	int x=strlen(str1);
	for(int i=2,k=0;i<x;i++){
		if(str1[i]==' '){
			for(int j=i-k;j<i;j++)
			a[t]=a[t]*10+(str1[j]-'0');
			k=0;
			t=t+1;
		}
		else
		k++; 
		if(i==x-1){
			for(int j=x-k;j<x;j++)
			a[t]=a[t]*10+(str1[j]-'0');
		}
		
	}
//	printf("%d %d %d ",x,a[0],a[1]);
	if(str1[0]=='+'){
		printf("%d",a[0]+a[1]);
	}
	if(str1[0]=='-'){
		printf("%d",a[0]-a[1]);
	}
	if(str1[0]=='*'){
		printf("%d",a[0]*a[1]);
	}
	if(str1[0]=='/'){
		printf("%d",a[0]/a[1]);
	}
	return 0;
}
