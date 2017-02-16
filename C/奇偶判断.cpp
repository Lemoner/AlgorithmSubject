#include<stdio.h>
int main(void)
{
	__int64 x;
	scanf("%I64d",&x);
	if(x%2==0)
	printf("even");
	else
	printf("odd");
	return 0;
}
