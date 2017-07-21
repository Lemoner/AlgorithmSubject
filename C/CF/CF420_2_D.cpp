#include<iostream>
#include<cstdio>
using namespace std;

int a[10001][10001];
int n,m;
int minsum=99999;

void DFS(int x, int y)
{
	
	if(x==n&&y==m){
		
	}
	
}

int main(void)
{
	
	int k,r,c;
	
	cin>>n>>m>>k;
	
	for(int i=0;i<=n;i++){
		for(int j=0;j<=m;j++){
			a[i][j]=0;
		}
	}
	
	for(int i=0;i<k;i++){
		cin>>r>>c;
		a[r][c]=1;
	}
	
	DFS(1,1);
	
}
