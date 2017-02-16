#include<stdio.h>

unsigned long fun(unsigned long a,unsigned long b){
	unsigned long t;
	if(a<b){
		t=a;
		a=b;
		b=t;
	}
	while(b!=0){
		t=a%b;
		a=b;
		b=t;
	}
	return a;
}

int main(void)
{
	unsigned long a,b;
	int n;
	while(scanf("%d",&n)!=EOF){
		a=1;
		while(n--){
			scanf("%lu",&b);
			a=a*b/fun(a,b);
		}
		printf("%lu\n",a);
	}
	return 0;
}
