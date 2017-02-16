#include<stdio.h>
int main(void)
{
	int a[105][1005]={};
	int n,m,x,y,i,j;
	scanf("%d%d",&n,&m);
	for(i=0;i<m;i++){
		scanf("%d",&x);
		a[x-1][i]=1;
		scanf("%d",&y);
		a[y-1][i]=-1;
	}
	for(i=0;i<n;i++){
		for(j=0;j<m;j++){
			printf("%d ",a[i][j]);
		}
		printf("\n");
	}
	return 0;
}
