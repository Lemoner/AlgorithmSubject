#include<iostream>
#include<math.h>
using namespace std;
int main(void)
{
	int n,i,t,sum;
	int a[8];
	cin>>n;
	t=0;
	while(n){
		a[t]=n%10;
		n=n/10;
		t++;
	}
	sum=0;
	for(i=t-1;i>0;i--){
		if(a[i]>3)
		sum=sum+3*pow(4,i-1);
		else
		sum=sum+a[i]*pow(4,i-1);
	}
	sum=sum*3;
	if(a[i]>2)
	sum=sum+3;
	else
	sum=sum+a[i];
	cout<<sum<<endl;
	return 0;
}
