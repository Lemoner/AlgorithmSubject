#include<iostream>
using namespace std;
long w[50][50],m[50][50]; 
void fun(int n,int k)
{
	long max,temp;
	for(int i=0;i<n;i++)
	m[i][1]=w[0][i];
	for(int i=0;i<n;i++){
		for(int j=2;j<=k+1;j++){
			max=0;
			for(int d=0;d<i;d++){
				temp=m[d][j-1]+w[d+1][i];
				if(temp>max){
					max=temp;
				}
			}
			m[i][j]=max;
		}
	}
}
int main(void)
{
	int a[50];
	int n,k;
	cin>>n>>k;
	for(int i=0;i<n;i++)
	cin>>a[i];
	for(int i=0;i<n;i++){
		w[i][i]=a[i];
		for(int j=i+1;j<n;j++)
		w[i][j]=w[i][j-1]*10+a[j];
	}
	fun(n,k+1);
	cout<<m[n][k+1];
	return 0;
}
