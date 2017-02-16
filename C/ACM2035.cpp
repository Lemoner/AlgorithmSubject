#include<stdio.h>
int main(void)
{
	int a,b,sum;
	while(scanf("%d%d",&a,&b),a!=0||b!=0){
		if(a>=1000){
			a=a%1000;
		}
		sum=a;
		for(int i=1;i<b;i++){
			sum*=a;
			if(sum>=1000){
				sum=sum%1000;
			}
		}
		printf("%d\n",sum);
	}
	return 0;
}
