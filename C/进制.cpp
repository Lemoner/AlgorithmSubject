#include<stdio.h>
int main(void)
{
	int n;
	while(scanf("%d",&n)!=EOF){
		printf("%o\n",n);
		printf("%x\n",n);
	}
	return 0;
}
