#include<iostream>
#include<algorithm>
using namespace std; 
int main(void)
{
	int a[9],b[9];
	int i,j,t,n,sum;
	cin>>t;
	for(i=0;i<t;i++){
		cin>>n;
		for(j=0;j<n;j++)
			cin>>a[j];
		for(j=0;j<n;j++)
			cin>>b[j];
		sort(a,a+n);
		sort(b,b+n);
		reverse(b,b+n);
		sum=0; 
		for(j=0;j<n;j++){
			sum+=a[j]*b[j];
		}
		cout<<sum<<endl;
	}
}
