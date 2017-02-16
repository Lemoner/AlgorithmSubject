#include<iostream>
using namespace std;
int main(void){
	int a[100];
	int n,k=0;
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>a[i];
		if(a[i]!=0){
			a[k]=a[i];
			k++;
		}
	}
	cout<<k<<endl;
	if(k!=0){
		for(int i=0;i<k;i++)
		cout<<a[i]<<" ";
	}
	return 0;
}
