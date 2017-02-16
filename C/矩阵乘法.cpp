#include<stdio.h>
int main(void)
{
	int i,j,n,m,x,y,t,q,sum;
	int a[35][35],b[35][35],c[35][35];
	scanf("%d%d",&n,&m);
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			scanf("%d",&a[i][j]);
			b[i][j]=a[i][j];
		}
	}
	if(m==0){
		for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			if(i==j)
			b[i][j]=1;
			else
			b[i][j]=0;
		}
	}
	}
	else{
	for(t=1;t<m;t++){
	    for(i=0;i<n;i++){
        	for(j=0;j<n;j++){
        		x=0;y=0;
			sum=0;
			for(q=0;q<n;q++){
				sum+=a[i][y]*b[x][j];
				x++;y++;
			}
			c[i][j]=sum;
		    }
		}
		for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			b[i][j]=c[i][j];
		}
	}
	}
}
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			printf("%d ",b[i][j]);
		}
		printf("\n");
	}
	return 0;
}
