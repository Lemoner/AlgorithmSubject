#include<iostream>
#include<algorithm>
using namespace std;
int n,sum=0;
int a[10];
void Swap(int &a,int &b){
	int temp;
	temp=a;
	a=b;
	b=temp;
}
int ok(int i,int k){
	if(i>k){
		for(int t=k;t<i;t++)
		if(a[t]==a[i])
		return 0;
	}
	return 1;
}
void fun(int k){
	if(k==n){
		sum++;
		for(int i=0;i<n;i++)
		cout<<a[i];
		cout<<endl;
	}
	else{
		for(int i=k;i<n;i++){
			if(ok(i,k)){
//				sort(a+k,a+n);//×ÖµäÐò 
				Swap(a[k],a[i]);
				fun(k+1);
			    Swap(a[k],a[i]);
			}
		}
	}
}
int main(void){
	cin>>n;
	for(int i=0;i<n;i++)
	cin>>a[i];
	fun(0);
	cout<<sum<<endl;
	return 0;
	
}

