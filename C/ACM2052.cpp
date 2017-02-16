#include<stdio.h>
#include<string.h>
int main(void)
{
	int w,h;
	while(scanf("%d%d",&w,&h)!=EOF){
		printf("+");
		for(int i=1;i<=w;i++){
			printf("-");
		}
		printf("+\n");
		for(int i=1;i<=h;i++){
			printf("|");
			for(int j=1;j<=w;j++){
				printf(" ");
			}
			printf("|\n");
		}
		printf("+");
		for(int i=1;i<=w;i++){
			printf("-");
		}
		printf("+\n");
	} 
	return 0;
}
