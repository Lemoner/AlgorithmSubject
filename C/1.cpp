#include<stdio.h>
int main (void)
{
	int a,t;
	for(a=100;a<1000;a++){
		t=a*a;
		if((a/100==t/100000)||(a/10%10==t%10)||(t/10000%10==t%100/10))
		printf("%d\n",a);
	}
}
