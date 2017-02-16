#include<stdio.h>
#define N 1000000007  
int a[51][51];  
int n,m,k;  
int t=0;    
void dfs(int x,int y,int num,int max){  
    if(x==n-1&&y==m-1){  
        if(a[x][y]>max){  
            if(num==k||num==k-1)
			t++;  
        }  
        else if(num==k){  
            t++;  
        }
	    t%=N;        
    }  
  
    if(x+1<n){  
        if(a[x][y]>max){  
            dfs(x+1,y,num+1,a[x][y]);  
            dfs(x+1,y,num,max);  
        }  
        else {  
             dfs(x+1,y,num,max);  
        }  
    }    
    if(y+1<m){  
        if(a[x][y]>max){  
            dfs(x,y+1,num+1,a[x][y]);  
            dfs(x,y+1,num,max);    
        }  
        else {  
            dfs(x,y+1,num,max);    
        }  
    } 
}  
  
int main(){ 
int i,j; 
	scanf("%d%d%d",&n,&m,&k);
	for(i=0;i<n;i++){
		for(j=0;j<m;j++){
			scanf("%d",&a[i][j]);
		}
	}
	dfs(0,0,0,-1);
    printf("%d",t);   
    return 0;  
}  
