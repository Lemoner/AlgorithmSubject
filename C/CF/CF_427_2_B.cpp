#include <iostream>  
#include <cstring>  
#include <algorithm>   
using namespace std;

typedef long long ll;  

int main(void)
{
	
	ll k,sum,alength,num;
	int a[100001];
	char s[100001];
	
	cin>>k;
	cin>>s;
	
	sum=0;
	alength=0;
	num=0;
	
	for(int i=0;s[i];i++){
		a[i]=s[i]-'0';
		alength++;
		sum+=a[i];
	} 
	
	if(sum>=k){
		cout<<0;
	}
	else{
		sort(a,a+alength);
		for(int i=0;i<alength;i++){
			sum+=9-a[i];
			num++;
			if(sum>=k){
				break;
			}
		}
		cout<<num;
	}
	
}

