#include<stdio.h>
int main(void)
{
	__int64 a,b,product;
	scanf("%I64d%I64d",&a,&b);
	if(a>b){
		a=b;
	}
	product=1;
	for(int i=1;i<=a;i++){
		product=product*i;
	}
	
	printf("%I64d",product);
} 
