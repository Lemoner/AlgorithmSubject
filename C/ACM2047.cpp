#include<stdio.h>
int main(void)
{
	__int64 a[40][2]={1,2};
	int n,i;
	for(i=1;i<40;i++){
		a[i][0]=a[i-1][1];
		a[i][1]=2*(a[i-1][0]+a[i-1][1]);
	}
	while(scanf("%d",&n)!=EOF){
		printf("%I64d\n",a[n-1][0]+a[n-1][1]);
	}
	return 0;
}
