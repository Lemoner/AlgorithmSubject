#include<stdio.h>
#include<math.h>
int main(void)
{
	__int64 n,m,a;
	while(scanf("%I64d%I64d",&n,&m),n+m){
		for(int i=(int)sqrt(2*m);i>0;i--){
			a=m/i-(i-1)/2;
			if((a+a+i-1)*i==2*m&&a+i-1<=n){
				printf("[%I64d,%I64d]\n",a,a+i-1);
			}
		}
		printf("\n");
	}
	return 0;
} 
