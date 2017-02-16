#include<stdio.h>
int main(void)
{
	int n,sum;
	char c;
	scanf("%d%*c",&n);
	while(n--){
		sum=0;
		for(;(c=getchar())!='\n';){
			if(c>='0'&&c<='9'){
				sum++;
			}
		}
		printf("%d\n",sum);
	}
	return 0;
}

