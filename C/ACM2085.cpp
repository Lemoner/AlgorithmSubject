#include<stdio.h>
int main(void)
{
	int n;
	__int64 a,b;
	while(scanf("%d",&n),n+1){
		a=1;
		b=0;
		while(n--){
			b=a+b;
			a=a+2*b;
		}
		printf("%I64d, %I64d\n",a,b);
	}
	return 0;
}
