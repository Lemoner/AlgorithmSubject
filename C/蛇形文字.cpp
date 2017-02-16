#include<iostream>
using namespace std;
int main()
{
	int n,x,y,i,j,t,sum;
	int a[10][10];
	cin>>n;
	sum=1;
	a[0][0]=sum++;
	a[n-1][n-1]=n*n;
	t=1;
	while(t<n){
		x=t;
		y=0;
		t++;
		while(x>=0&&y>=0){
			a[n-1-x][n-1-y]=1+n*n-sum;
			a[x--][y++]=sum++;
		}
		x++;
		y--;
		if(t!=n){
			y++;
			t++;
			while(x>=0&&y>=0){
				a[n-1-x][n-1-y]=1+n*n-sum;
				a[x++][y--]=sum++;
			}
		}
	}
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			cout<<a[i][j]<<" ";
		}
		cout<<endl;
	}
}
