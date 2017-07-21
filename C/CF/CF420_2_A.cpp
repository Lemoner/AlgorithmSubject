#include<iostream>
#include<cstdio>
using namespace std;

int n;
int a[50][50];

int judge(int x, int y)
{
	
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(a[x][i]+a[j][y]==a[x][y]){
				return 1;
			}
		}
	}
	
	return 0;
	
}

int endresult(){
	
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(a[i][j]!=1){
				if(!judge(i,j)){
					return 0;
				}
			}
		}
	}
	
	return 1;
}

int main(void)
{
	cin>>n;
	
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			cin>>a[i][j];
		}
	} 
	
	if(endresult()){
		cout<<"Yes";
	}
	else{
		cout<<"No";
	}
	
	return 0;
	
}
