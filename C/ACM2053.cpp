#include<stdio.h>
#include<math.h> 
int main(void)
{
	int n;
	while(scanf("%d",&n)!=EOF){
		if(sqrt(n)*sqrt(n)==n)
		printf("1\n");
		else
		printf("0\n");
	}
	return 0;
}
