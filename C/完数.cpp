#include<iostream>
#include<math.h> 
using namespace std;
int main(void)
{
	int n,sum=1;
	cin>>n;
	if(n==1)
	cout<<"no";
	else{
		for(int i=2;i<=sqrt(n);i++){
		if(n%i==0){
			sum+=i+(n/i);
		}
	}
	if(sum==n)
	cout<<"yes";
	else
	cout<<"no";
	}
	return 0;
	
}
