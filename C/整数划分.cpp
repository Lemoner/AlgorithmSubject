#include<iostream>
using namespace std;
int a[10];
void F(int n,int t)
{
	if(n==0){
		for(int i=0;i<t;i++)
		cout<<a[i]<<" ";
		cout<<endl;
	}
	for(int i=1;i<=n;i++){
		a[t]=i;
		F(n-i,t+1);
	}
}

int main(void)
{
	int n;
	cin>>n;
	F(n,0);
	return 0;
}
