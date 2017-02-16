#include<stdio.h>
int main(void)
{
	int x;
	char c;
	scanf("%c",&c);
	x=c-'A';
	if(x>31)
	printf("lower");
	else
	printf("upper");
	return 0;
}
