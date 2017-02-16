#include<stdio.h>
int main(void)
{
	int n,m;
	while(scanf("%d%d",&n,&m)!=EOF){
		for(int i=1;i<=n/m;i++){
			if(i==1){
				printf("%d",(2+m*(i-1)*2+m*i*2)/2);
			}
			else{
				printf(" %d",(2+m*(i-1)*2+m*i*2)/2);
			}
		}
		if(n/m*m==n){
			printf("\n");
		}
		else{
			printf(" %d\n",(2+m*(n/m)*2+2*n)/2);
		}
	}
	return 0;

