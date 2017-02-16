#include<stdio.h>
int main(void)
{
	int n,a,b,sum;
	while(scanf("%d",&n),n){
		sum=0;
		b=0;
		for(int i=0;i<n;i++){
			scanf("%d",&a);
			if(a>b){
				sum+=(a-b)*6+5;
			}
			else if(a<b){
				sum+=(b-a)*4+5;
			}
			b=a;
		}
		printf("%d\n",sum);
	}
	return 0;
}
