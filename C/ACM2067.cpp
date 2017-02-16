#include<stdio.h>
int main(void)
{
	__int64 a[36][36];
	int n,t;
	for(int i=0;i<36;i++){
		a[i][0]=1;
	}
	for(int i=1;i<36;i++){
		for(int j=1;j<=i;j++){
			if(i==j){
				a[i][j]=a[i][j-1];
			}
			else{
				a[i][j]=a[i][j-1]+a[i-1][j];
			}
		}
	}
	t=1;
	while(scanf("%d",&n),n+1){
		printf("%d %d %I64d\n",t++,n,2*a[n][n]);
	}
	return 0;
}
