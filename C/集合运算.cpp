#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	int n,m,i,t,j; 
	int a[1005],b[2010],c[1005];
	cin>>n;
	for(i=0;i<n;i++){
		cin>>a[i];
		b[i]=a[i];
	}
	cin>>m;
	for(i=0;i<m;i++){
		cin>>b[n+i];
	}
	sort(a,a+n);
	sort(b,b+n+m);
	t=0;
	for(i=0;i<n+m-1;i++){
		if(b[i]==b[i+1]){
			c[t]=b[i];
			cout<<b[i]<<' ';
			b[i+1]=-1;
			t++;
			i++; 
		}
	}
	cout<<endl;
	for(i=0;i<n+m;i++){
		if(b[i]==-1)
		continue;
		cout<<b[i]<<' ';
	}
	cout<<endl;
	j=0;
	for(i=0;i<t;i++){
		while(c[i]!=a[j]){
		cout<<a[j]<<' ';
		j++;			
		}
		j++;
	}
	if(j<n){
		for(i=j;j<n;j++)
		cout<<a[j]<<' ';
	}
	return 0;
} 
