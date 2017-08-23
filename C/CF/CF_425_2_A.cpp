#include <iostream>   
using namespace std;

typedef long long ll;

int main()
{
	
	ll n,k,x;
	
	cin>>n>>k;
	
	x=n/k;
	
	if(x%2==0){
		cout<<"NO";
	}
	else{
		cout<<"YES";
	}
	
}
