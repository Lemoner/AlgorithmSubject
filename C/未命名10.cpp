#include<stdio.h>
#include<string.h>
int main(void)
{
	char c;
	while(scanf("%c",&c)!=EOF){
		printf("%d\n",c-'!');
	}
	return 0;
} 
