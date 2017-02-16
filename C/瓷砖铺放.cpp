#include<iostream>
using namespace std;
int a[100];
int count=0;
void F(int n,int t)
{
	if(n==0){
		count++;
		for(int i=0;i<t;i++)
		cout<<a[i]<<" ";
		cout<<endl;
	}
	else{
	for(int i=1;i<=2;i++){
		if(n-i>=0){
		a[t]=i;
		t++;
		F(n-i,t);
		t--;	
		}
	}	
	}
}

int main(void)
{
	int n;
	cin>>n;
	F(n,0);
	cout<<count;
	return 0;
}
