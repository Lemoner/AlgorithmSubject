#include<iostream>
#include<stdlib.h>
using namespace std;
long a[100][100];
string str;
long conv(int i,int j)
{
	string str1=str.substr(i,j);
	return atol(str1.c_str());
}
void fun(int n,int m)
{
	for(int i=1;i<=n;i++)
	a[i][1]=conv(0,i);
	for(int j=2;j<=m;j++){
		for(int i=j;i<=n;i++){
			long temp,max=0;
			for(int k=1;k<i;k++){
				temp=a[k][j-1]*conv(k,i-k);
				if(temp>max){
					max=temp;
				}
			}
			a[i][j]=max;
		}
	}
	
}
int main(void)
{
	int n,m;
	cin>>n>>m;
	cin>>str;
	m++;
	fun(n,m);
	cout<<a[n][m];
	return 0;
}
