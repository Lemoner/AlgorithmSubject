#include<iostream>
using namespace std;
int k,count=0;
int a[22];
void fun(int n,int min,int max)
{
	if(n<=k){
		for(int i=0;i<n;i++){
		cout<<a[i]<<" ";
	}
	cout<<endl;
	for(int i=min+1;i<max;i++){
		a[n]=i;
		count++;
		if(a[n]>a[n-1])
		fun(n+1,a[n-1],a[n]);
		else
		fun(n+1,a[n],a[n-1]);
	}
	}
}
int main(void)
{
	cin>>k;
	for(int i=1;i<=k;i++){
		for(int j=i+1;j<=k;j++){
			if(i!=j){
				a[0]=i;
				a[1]=j;
				count++;
				fun(2,a[0],a[1]);
				a[0]=j;
				a[1]=i;
				count++;
				fun(2,a[1],a[0]);
			}
		}
	}
	cout<<count;
	return 0;
} 
