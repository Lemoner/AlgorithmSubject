#include<stdio.h>
int main(void)
{
	int n,x;
	__int64 sum;
	while(scanf("%d",&n)!=EOF){
		sum=1;
		for(int i=0;i<n;i++){
			scanf("%d",&x);
			if(x%2!=0){
				sum*=x;
			}
		}
		printf("%I64d\n",sum);
	}
	return 0;
}
