#include<stdio.h>
int main(void)
{
	__int64 a,m;
	scanf("%I64d%I64d",&a,&m);
	a=a*a;
	m=a%m;
	printf("%I64d",m);
	return 0;
}
