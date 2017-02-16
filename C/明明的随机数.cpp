#include<iostream>
using namespace std;
int main(void)
{
	int a[1002]={0};
	int n,x,count=0;
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>x;
		if(a[x]!=1){
			a[x]=1;
			count++;
		}
	}
	cout<<count<<endl;
	for(int i=1;i<=1000;i++){
		if(a[i]==1)
		cout<<i<<" ";
	}
	return 0;
}
