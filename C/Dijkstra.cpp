#include<stdio.h>
#include<iostream>
using namespace std;

const int  MAXINT = 32767;
const int MAXNUM;
int dist[MAXNUM];
int prev[MAXNUM];

int A[MAXUNM][MAXNUM];

void Dijkstra(int v0)
{
  int S[MAXNUM]={0};                                  // �ж��Ƿ��Ѵ���õ㵽S������
      int n=MAXNUM;
  ����for(int i=1; i<=n; ++i)
 ���� {
      ����dist[i] = A[v0][i];
      ����S[i] = 0;                                // ��ʼ��δ�ù��õ�
      ����if(dist[i] == MAXINT)    
            ����prev[i] = -1;
 ����     else 
            ����prev[i] = v0;
   ����}
   �� dist[v0] = 0;
   �� S[v0] = 1; ����
 ���� for(int i=2; i<=n; i++)
 ���� {
       ����int mindist = MAXINT;
       ����int u = v0; ����                            // �ҳ���ǰδʹ�õĵ�j��dist[j]��Сֵ
      ���� for(int j=1; j<=n; ++j)
      ����    if((!S[j]) && dist[j]<mindist)
      ����    {
         ����       u = j;                             // u���浱ǰ�ڽӵ��о�����С�ĵ�ĺ��� 
         �� ��      mindist = dist[j];
       ����   }
       ����S[u] = 1; 
       ����for(int j=1; j<=n; j++)
       ����    if((!S[j]) && A[u][j]<MAXINT)
       ����    {
           ��    ��if(dist[u] + A[u][j] < dist[j])     //��ͨ���¼����u��·���ҵ���v0����̵�·��  
           ��    ��{
                   ����dist[j] = dist[u] + A[u][j];    //����dist 
                   ����prev[j] = u;                    //��¼ǰ������ 
            ����    }
        ��    ��}
   ����}
}

int main(void)
{
	int n,m;
	int a,b,c;
	scanf("%d%d",&MAXNUM,&m);
	for(int i=0;i<m;i++){
		scanf("%d%d%d",&a,&b,&c);
		A[a][b]=c;
	}
	Dijkstra(1);
	printf("%d",MAXINT);
	
} 
