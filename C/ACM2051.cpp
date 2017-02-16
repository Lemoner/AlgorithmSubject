#include<stdio.h>

void fun(int n)
{
	if(n>0){
		fun(n/2);
		printf("%d",n%2);
	}
}

int main(void)
{
	int n;
	while(scanf("%d",&n)!=EOF){
		fun(n);
		printf("\n");
	}
	return 0;
}
