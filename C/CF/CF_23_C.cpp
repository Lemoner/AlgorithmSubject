#include <iostream>  
using namespace std;

typedef long long ll; 

ll fun(ll x)
{
	
	ll y;
	y=x;
	while(y>0){
		x=x-y%10;
		y=y/10;
	}
	return x;
	
}

int main(void){
	
	ll n,s,m;
	
	cin>>n>>s;
	
	m=s;
	
	while(true){
		if(fun(m)>=s){
			break;
		}
		m++;
	}
	
	
	if(n<m){
		cout<<0;
	}
	else{
		cout<<n-m+1;
	}
	
}
