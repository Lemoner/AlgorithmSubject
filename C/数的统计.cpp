#include<iostream>
#include<algorithm>
using namespace std;
int main(void){
	int a[1002];
	int n,count=1;
	cin>>n;
	for(int i=0;i<n;i++)
	cin>>a[i];
	sort(a,a+n);
	if(a[0]!=a[1])
	cout<<a[0]<<" "<<count<<endl;
	for(int i=1;i<n;i++){
		if(a[i]!=a[i-1]){
			cout<<a[i-1]<<" "<<count<<endl;
			count=1;
			continue;
		}
		count++;
	}
	cout<<a[n-1]<<" "<<count<<endl;
	return 0;
}
