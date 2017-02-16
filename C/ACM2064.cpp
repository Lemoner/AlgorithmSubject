#include<stdio.h>
#include<math.h> 
//int count;
//
//void fun(int n)
//{
//	if(n>0){
//		fun(n-1);
//		count++;
//		fun(n-1);
//		count++;
//		fun(n-1);
//	} 
//} 

int main(void)
{
	int n;
	while(scanf("%d",&n)!=EOF){
		printf("%.0f\n",pow(3,n)-1);
	}
	return 0;
}
