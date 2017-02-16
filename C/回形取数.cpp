#include<stdio.h>
int main(void)
{
	int n,m,i,j,t,x,sum;
	int a[310][310];
	scanf("%d%d",&n,&m);
	for(i=0;i<n;i++){
		for(j=0;j<m;j++){
			scanf("%d",&a[i][j]);
		}
	}
	sum=0;
	t=1;
	i=0;
	j=0;
	while(sum<(n*m)){
		while((a[i][j]!=-1)&&(i>=0)&&(j>=0)&&(i<n)&&(j<m)){

			printf("%d ",a[i][j]);
			a[i][j]=-1;
			sum++;
		
		x=t%4;
		switch(x){
				case 0:j--;break;
				case 1:i++;break;
				case 2:j++;break;
				case 3:i--;break;
			}
		}
		switch(x){
				case 0:j++;i++;break;
				case 1:i--;j++;break;
				case 2:j--;i--;break;
				case 3:i++;j--;break;
		}
		t++;
	}
	return 0;
}
