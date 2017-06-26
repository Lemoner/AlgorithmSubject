#include<stdio.h>  
#define MAX_VERTEX_NUM 100  
#define INFINITY 2000000000  
typedef struct {  
    int vexs[MAX_VERTEX_NUM];  
    int arcs[MAX_VERTEX_NUM][MAX_VERTEX_NUM];  
    int vexnum,arcnum;  
}MGraph;  
int LocateVex(MGraph G,int v){  
    for(int i=0;i<G.vexnum;i++){  
        if(G.vexs[i]==v)return i;  
    }  
}  
void CreateUDN(MGraph &G){  
    int i,j,k;  
    printf("���붥������ͻ��ĸ�����\n");  
    scanf("%d%d",&G.vexnum,&G.arcnum);//���붥������������������Լ��Ƿ��й��ڻ��������Ϣ   
      
    printf("���������������ƣ����֣���\n");   
    for(i=0;i<G.vexnum;i++)  
    scanf("%d",&G.vexs[i]);//����������㣬���ﶥ�����������Ĭ��Ϊint����  
      
    for(i=0;i<G.vexnum;i++)  
       for(j=0;j<G.vexnum;j++)  
       if(i==j)G.arcs[i][j]=0;//�������������ȨֵΪ0   
       else G.arcs[i][j]=INFINITY;//��ʼ��ͼ  
         
    printf("��������������������Ȩֵ��\n");     
    for(k=0;k<G.arcnum;k++){  
        int v1,v2,weight;  
        scanf("%d %d %d",&v1,&v2,&weight);//���뻡����������   
        i=LocateVex(G,v1);j=LocateVex(G,v2);//Ѱ�����������ھ����е�λ��   
        G.arcs[i][j]=weight;  
        G.arcs[j][i]=G.arcs[i][j];//��<v1,v2>�ĶԳƻ�<v2,v1>   
    }      
}  
bool P[MAX_VERTEX_NUM][MAX_VERTEX_NUM];//p[v][w]==ture����w�Ǵ�v0��v�����·���еĶ���   
bool final[MAX_VERTEX_NUM];//final[v]�����Ѿ��ҵ�v0��v�����·��   
int D[MAX_VERTEX_NUM];//���·���Ĵ�Ȩ����   
void ShortestPath_DLJ(MGraph G,int v0){  
    int v,w,i,j;  
    for(v=0;v<G.vexnum;v++){  
        final[v]=false; //��ʼ��   
        D[v]=G.arcs[v0][v];  
        for(w=0;w<G.vexnum;w++)  P[v][w]=false;//ÿ��·��������Ϊ��   
        if(D[v]<INFINITY){P[v][v0]=true;  P[v][v]=true;}//���v��v0ֱ�����ӣ������·��   
    }  
    D[v0]=0;  final[v0]=true; //��ʼ����v0��������S���ϣ����ҵ����·���ļ���   
    for(i = 1;i<G.vexnum;i++){//ÿ��ѭ�����һ��v0��ĳ��v��������·��������v�ӵ�S����   
        int minn=INFINITY;  
        for(w = 0;w<G.vexnum;w++)  
        if(!final[w])  
          if(D[w]<minn){v = w;minn = D[w];}//�ҵ�����v0����ĵ�   
    final[v]=true;  
    for(w = 0;w<G.vexnum;w++)//���µ�ǰ���·��������   
       if(!final[w]&&(minn+G.arcs[v][w])<D[w]){//�޸�D[w]��P[w],w����V-S   
        D[w] = minn+G.arcs[v][w];  
        for(j=0;j<G.vexnum;j++){//��v��·����ֵ��P[w]   
        if(P[v][j]=true)P[w][j]=true;         
        }   
        P[w][w]=true;//���·�������һ����w   
    }       
    }  
}   
void Print_ShortestPath(MGraph G,int v0){  
    int i,j;  
    for(i=0;i<G.vexnum;i++){  
        printf("%d->%d:",v0,i);  
        printf("%d\n",D[i]);  
    }  
}  
int main(){  
    MGraph G;  
    CreateUDN(G);  
    int v0;  
    printf("������ʼ���㣺\n");   
    scanf("%d",&v0);//���·������ʼ��v0   
    ShortestPath_DLJ(G,v0);//�����v0����������������·��   
    Print_ShortestPath(G,v0); //�����v0����������������·��Ȩֵ��   
    return 0;  
}  
