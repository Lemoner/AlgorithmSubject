#include<stdio.h>
#include<iostream>
#include<algorithm>
using namespace std;
int main(void)
{
	int a[105];
	int n,i,sum;
	scanf("%d",&n);
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	sum=0;
	for(i=0;i<n-1;i++){
		sort(a+i,a+n);
		a[i+1]=a[i]+a[i+1];
		sum=sum+a[i+1];
	}
	printf("%d",sum);
	return 0;
} 
