#include <stdio.h>
#include <iostream>
using namespace std;

int main(void){
	
	int n,k,count,x,y,sum;
	
	cin>>n>>k;
	
	count=2;
	
	x=(n-1)/k;
	
	y=(n-1)%k;
	if(y==0){
		sum=2*x;
	}else if(y==1){
		sum=2*x+1;
	}else{
		sum=2*(x+1);
	}
	cout<<sum<<endl;
	
	for(int i=0;i<k;i++){
		cout<<1<<" "<<count<<endl;
		count++;
	}
	
	
	while(count<=n){
		cout<<count-k<<" "<<count<<endl; 
		count++;
	}
	
}
