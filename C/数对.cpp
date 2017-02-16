#include<iostream>
#include<math.h>
using namespace std;
int n;
void fun(int i){
	if(i<=sqrt(n)){
		if(n%i==0){
		cout<<i<<" * "<<n/i<<" = "<<n<<endl;
		fun(i+1);
		if(n/i!=i){
			cout<<n/i<<" * "<<i<<" = "<<n<<endl;
		}
	}
	else
	fun(i+1);
	}
	
}
int main(void)
{
	cin>>n;
	fun(1);
	return 0;
}
