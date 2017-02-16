#include<iostream>
using namespace std;
int main(void){
	int a[21];
	int max=0,count=0,x,n,i;
	cin>>n;
	if(n>0){
		for(i=0;i<n;i++){
		cin>>a[i];
		if(i==0){
			count++;
		}
		else{
			if(a[i]==a[i-1])
			count++;
			else{
				if(count>max){
					max=count;
					x=i-1;
				}
				count=1;
			}
		}
	}
	if(count>max){
					max=count;
					x=i-1;
				}
	cout<<a[x];
	}
	return 0;
}
