#include<stdio.h>
void F(int n){
	if(n==1){
		printf("%c",n-1+'A');
	}
	else{
		F(n-1);
		printf("%c",n-1+'A');
		F(n-1);
	}
}
int main(void)
{
	int n;
	scanf("%d",&n);
	F(n);
	return 0;
}
