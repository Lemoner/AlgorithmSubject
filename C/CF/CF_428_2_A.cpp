#include <iostream>   
using namespace std;

int main(void)
{
	
	int n,k,t,sum,index;
	
	cin>>n>>k;
	
	sum=0;
	index=0;
	while(n--){
		cin>>t;
		sum+=t;
		
		if(sum>=8){
			k-=8;
			sum-=8;
		}
		else{
			k-=sum;
			sum=0;
		}
		index++;
		
		if(k<=0){
			break;
		}
		
	}
	
	if(k>0){
		cout<<-1;
	}	
	else{
		cout<<index;
	}
	
}
