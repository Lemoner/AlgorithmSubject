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
    printf("输入顶点个数和弧的个数：\n");  
    scanf("%d%d",&G.vexnum,&G.arcnum);//输入顶点个数，弧额条数，以及是否有关于弧的相关信息   
      
    printf("输入各个顶点的名称（数字）：\n");   
    for(i=0;i<G.vexnum;i++)  
    scanf("%d",&G.vexs[i]);//输入各个顶点，这里顶点的数据类型默认为int类型  
      
    for(i=0;i<G.vexnum;i++)  
       for(j=0;j<G.vexnum;j++)  
       if(i==j)G.arcs[i][j]=0;//顶点自身到自身的权值为0   
       else G.arcs[i][j]=INFINITY;//初始化图  
         
    printf("输入各条弧的两个顶点和权值：\n");     
    for(k=0;k<G.arcnum;k++){  
        int v1,v2,weight;  
        scanf("%d %d %d",&v1,&v2,&weight);//输入弧的两个顶点   
        i=LocateVex(G,v1);j=LocateVex(G,v2);//寻找两个顶点在矩阵中的位置   
        G.arcs[i][j]=weight;  
        G.arcs[j][i]=G.arcs[i][j];//置<v1,v2>的对称弧<v2,v1>   
    }      
}  
bool P[MAX_VERTEX_NUM][MAX_VERTEX_NUM];//p[v][w]==ture代表w是从v0到v的最短路径中的顶点   
bool final[MAX_VERTEX_NUM];//final[v]代表已经找到v0到v的最短路径   
int D[MAX_VERTEX_NUM];//最短路径的带权长度   
void ShortestPath_DLJ(MGraph G,int v0){  
    int v,w,i,j;  
    for(v=0;v<G.vexnum;v++){  
        final[v]=false; //初始化   
        D[v]=G.arcs[v0][v];  
        for(w=0;w<G.vexnum;w++)  P[v][w]=false;//每条路径都先设为空   
        if(D[v]<INFINITY){P[v][v0]=true;  P[v][v]=true;}//如果v与v0直接连接，则添加路径   
    }  
    D[v0]=0;  final[v0]=true; //初始化，v0顶点属于S集合，即找到最短路径的集合   
    for(i = 1;i<G.vexnum;i++){//每次循环求得一个v0到某个v顶点的最短路径，并将v加到S集合   
        int minn=INFINITY;  
        for(w = 0;w<G.vexnum;w++)  
        if(!final[w])  
          if(D[w]<minn){v = w;minn = D[w];}//找到距离v0最近的点   
    final[v]=true;  
    for(w = 0;w<G.vexnum;w++)//更新当前最短路径及距离   
       if(!final[w]&&(minn+G.arcs[v][w])<D[w]){//修改D[w]和P[w],w属于V-S   
        D[w] = minn+G.arcs[v][w];  
        for(j=0;j<G.vexnum;j++){//将v的路径赋值给P[w]   
        if(P[v][j]=true)P[w][j]=true;         
        }   
        P[w][w]=true;//添加路径的最后一个点w   
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
    printf("输入起始顶点：\n");   
    scanf("%d",&v0);//最短路径的起始点v0   
    ShortestPath_DLJ(G,v0);//求出从v0出发至各个点的最短路径   
    Print_ShortestPath(G,v0); //输出从v0出发至各个点的最短路径权值合   
    return 0;  
}  
