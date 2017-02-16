#include<stdio.h>
int min(int a,int b)
{
	int t,product;
	product=a*b;
	if(a<b)
	a^=b^=a^=b;
	while(b){
		t=b;
		b=a%b;
		a=t;
	} 
	return product/a;
}
int main(void)
{
	int a,b,c,x;
	scanf("%d%d%d",&a,&b,&c);
	x=min(a,b);
	x=min(x,c);
	printf("%d",x);
	return 0;
}
