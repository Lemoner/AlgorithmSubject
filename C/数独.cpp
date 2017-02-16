#include<iostream>
using namespace std;
int n;
int f[10][10];
int ok(int i,int j)
{
	for(int k=1;k<i;k++){
		if(f[k][j]==f[i][j])
		return 0;
	}
	for(int k=1;k<j;k++){
		if(f[i][k]==f[i][j])
		return 0;
	}
	return 1;
}
void fun(int i,int j)
{
	if(i==n&&j>n){
		for(int a=1;a<=n;a++){
			for(int b=1;b<=n;b++){
				cout<<f[a][b]<<" ";
			}
			cout<<endl;
		}
		cout<<endl;
	}
	else{
		if(j>n&&i<n){
		i++;
		j=1;
	}
		for(int k=1;k<=n;k++){
			f[i][j]=k;
			if(ok(i,j)){
					j++;
					fun(i,j);
					j--; 
			}
		}
	}
} 
int main(void)
{
	cin>>n;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			f[i][j]=0;
		}
	}
	fun(1,1);
	return 0;
} 
