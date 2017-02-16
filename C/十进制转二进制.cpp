#include<stdio.h>
void fun(int n){
	if(n==1)
	printf("1");
	else{
		fun(n/2);
		printf("%d",n%2);
	}
} 
int main(void){
	int n;
	scanf("%d",&n);
	fun(n);
	return 0;
}
