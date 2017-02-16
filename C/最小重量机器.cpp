#include<iostream>
using namespace std;
int n,m,d,sw=0,sc=0,bestw=9999;
int x[10],best[10],c[10][10],w[10][10];
void fun(int t)
{
	if(t>n){
		if (bestw>sw){
			bestw=sw;
			for(int i=1;i<=n;i++){
				best[i]=x[i];
			}
		}
		return;
	}
	for(int i=1;i<=m;i++){
		if(sc+c[t][i]<=d){
			sc+=c[t][i];
			sw+=w[t][i];
			x[t]=i;
			fun(t++);
			sc-=c[t][i];
			sw-=w[t][i];
		}
	}
}
int main(void)
{
	cin>>n>>m>>d;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=m;j++){
			cin>>c[i][j];
		}
	}
	for(int i=1;i<=n;i++){
		for(int j=1;j<=m;j++){
			cin>>w[i][j];
		}
	}
	fun(1);
	cout<<bestw<<endl;
	for(int i=1;i<=n;i++){
		cout<<best[i]<<" ";
	} 
	return 0;
} 
