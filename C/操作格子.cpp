#include<iostream>
using namespace std;
int main(void){
	int a[100002];
	int n,m,p,x,y,max=0,sum=0;
	cin>>n>>m;
	for(int i=1;i<=n;i++)
	cin>>a[i];
	for(int i=0;i<m;i++){
		cin>>p>>x>>y;
		if(p==1){
			a[x]=y;
		}
		else if(p==2){
			for(int j=x;j<=y;j++)
			sum+=a[j];
			cout<<sum<<endl;
			sum=0;
		}
		else if(p==3){
			for(int j=x;j<=y;j++){
				if(a[j]>max)
				max=a[j];
			}
			cout<<max<<endl;
			max=0;
		}
	}
	return 0;
}
