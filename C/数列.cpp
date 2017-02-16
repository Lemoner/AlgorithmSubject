#include<iostream> 
#include<math.h>
using namespace std;
int main(void)
{
	int k,n,m;
	long long sum;
	cin>>k>>n;
	m=0;
	sum=0;
	while(n){
		if(n%2==1){
			sum=sum+pow(k,m);
		}
		m++;
		n=n/2;
	}
	cout<<sum;
	return 0;
}
