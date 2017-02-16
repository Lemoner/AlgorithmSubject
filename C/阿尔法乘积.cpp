#include<iostream>
using namespace std;
int main(void)
{
	long long n,t;
	cin>>n;
	while(n>=10){
		t=n;
		n=1;
		while(t>0){
			if(t%10!=0)
			n=n*(t%10);
			t=t/10;
		}
	}
	cout<<n;
	return 0;
} 
