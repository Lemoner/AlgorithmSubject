#include<stdio.h>
int main(void)
{
	double a[10][10];
	int n,sum;
	while(scanf("%d",&n)!=EOF){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n+1;j++){
				scanf("%lf",&a[i][j]);
			}
		}
		for(int i=n;i>1;i--){
			for(int j=1;j<i;j++){
				if(a[j][i]!=0){
					for(int k=1;k<i;k++){
						a[j][k]=a[j][k]*a[i][i]-a[i][k]*a[j][i];
				    }
			    	a[j][n+1]=a[j][n+1]*a[i][i]-a[i][n+1]*a[j][i];
			    	a[j][i]=0;
				}
			}
		}
		for(int i=1;i<=n;i++){
			sum=0;
			for(int j=1;j<i;j++){
				sum=sum+a[i][j]*a[0][j];
			}
			sum=a[i][n+1]-sum;
			a[0][i]=sum/a[i][i];
		}
		for(int i=0;i<=n;i++){
			for(int j=1;j<=n+1;j++){
				printf("%.0lf ",a[i][j]);
			}
			printf("\n");
		}
	}
	return 0;
} 
