#include<iostream>
#include<algorithm>
using namespace std;
int compare(const void * a,const void * b){
	return *(int*)a - *(int*)b;
}
int main(void)
{
	int n;
	int a[100];
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>a[i];
	}
	qsort(a,n,sizeof(int),compare);
	for(int i=0;i<n;i++){
		cout<<a[i]<<" ";
	}
	sort(a,a+n);
	for(int i=0;i<n;i++){
		cout<<a[i]<<" ";
	}
	return 0;
} 
