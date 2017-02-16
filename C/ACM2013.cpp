#include<stdio.h>
int main(void)
{
	int n,sum;
	while(scanf("%d",&n)!=EOF){
		sum=1;
		for(int i=n;i>1;i--){
			sum=(sum+1)*2;
		}
		printf("%d\n",sum);
	}
	return 0;
}
