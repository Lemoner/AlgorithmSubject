#include<stdio.h>

void fun(int a,int b){
	if(a!=0){
		fun(a/b,b);
		if(a%b>=10){
			printf("%c",a%b%10+'A');
		}
		else
		printf("%d",a%b);
	}
}

int main(void)
{
	int a,b;
	while(scanf("%d%d",&a,&b)!=EOF){
		if(a<0){
			printf("-");
			a=-a;
		}
		fun(a,b);
		printf("\n");
	}
	return 0;
}
