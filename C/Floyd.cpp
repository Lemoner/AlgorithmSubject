#include<stdio.h>
int main()
{
	int n,d,x,y,i,j,k;
	int a[105][105];
	scanf("%d",&n);
	for(i=0;i<n;i++){
		for(j=0;j<n;j++)
		a[i][j]=10000;
	} 
	for(k=1;k<n;k++){
		scanf("%d%d%d",&x,&y,&d);
		x--;y--;
		a[x][y]=d;
		a[y][x]=d;
	}
	for(k=0;k<n;k++){
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if((a[i][k]+a[k][j])<a[i][j]&&i!=j)
				a[i][j]=a[i][k]+a[k][j];
			}
		}
	}
/*	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			if(i==j)
			printf("0 ");
			else 
			printf("%d ",a[i][j]);
		}
		printf("\n");
	}*/
	int max=0;
	for(i=0;i<n;i++){
		for(j=i+1;j<n;j++){
			if(max<a[i][j])
			max=a[i][j];
		}
	}
//	printf("%d",max);
	int	sum=0;
	x=11;
	while(max){
		sum+=x;
		x++;
		max--;
	}
	printf("%d",sum);
	return 0;
}
