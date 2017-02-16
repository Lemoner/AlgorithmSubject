#include<stdio.h>
#include<string.h>
int main(void)
{
	char c;
	int n,t;
	t=0;
	while(scanf("%c",&c),c!='@'){
		scanf("%d%*c",&n);
		if(t!=0){
			printf("\n");
		}
		for(int i=n-1;i>0;i--){
			for(int j=0;j<i;j++){
				printf(" ");
			}
			printf("%c",c);
			if(n-i-1>0){
				for(int j=0;j<2*(n-i-1)-1;j++){
					printf(" ");
				}
				printf("%c",c);
			}
			printf("\n");
		}
		for(int i=0;i<2*n-1;i++){
			printf("%c",c);
		}
		printf("\n");
		t++;
	}
	return 0;
}
