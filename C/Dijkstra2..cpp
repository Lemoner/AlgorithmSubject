#include<iostream>
#include<cstdio>
using namespace std;

int MAXINT=2767;
int C=5,F;
int D[5][5];
int dist[5];
int prev[5];

void Dijkstra(int v0)
{
	int S[C];
	for(int i=1; i<=C; ++i){
		dist[i]=D[v0][i];
		S[i]=0;
		if(dist[i]==MAXINT){
			prev[i]=-1;
		} 
		else{
			prev[i]=v0;
		}
	}
	dist[v0]=0;
	S[v0]=1;
	for(int i=2; i<=C; i++){
		int mindist=MAXINT; 
		int u=v0; 
	for(int j=1; j<=C; ++j)
	if((!S[j]) && dist[j]<mindist)
	{
	u = j;                             // u保存当前邻接点中距离最小的点的号码 
	mindist = dist[j];
	}
	S[u] = 1; 
	for(int j=1; j<=C; j++)
	if((!S[j]) && D[u][j]<MAXINT)
	{
	if(dist[u] + D[u][j] < dist[j])     //在通过新加入的u点路径找到离v0点更短的路径  
	{
	dist[j] = dist[u] + D[u][j];    //更新dist 
	prev[j] = u;                    //记录前驱顶点 
	}
	}
	}
	
}

int main()
{
	int a,b,c;
	cin>>C>>F;
	for(int i=0;i<F;i++){
		cin>>a>>b>>c;
		D[a][b]=c;
	}
	Dijkstra(1);
	for(int i=1;i<5;i++)
	cout<<dist[i]<<endl;
	
} 
