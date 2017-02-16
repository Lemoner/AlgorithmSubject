#include<iostream>
#include<algorithm>
using namespace std;
int a[4000],b[4000];
int F(int i,int j)
{
	int k;
	for(k=i;k<=j-1;k++){
		if(a[k+1]-a[k]!=1)
		return 0;
	}
	return 1; 
}
int main()
{
	int n,i,j,k,sum=0;
	cin>>n;
	for(i=0;i<n;i++){
		cin>>a[i];
		b[i]=a[i];
	}
	for(i=0;i<n-1;i++){
		for(j=i+1;j<n;j++){
			sort(a+i,a+j+1);
			if(F(i,j))
			sum++;
			for(k=i;k<j+1;k++)
			a[k]=b[k];
		}
	}
	sum+=n;
	cout<<sum<<endl;
	return 0;
}
