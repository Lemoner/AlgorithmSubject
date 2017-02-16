//#include<stdio.h>
//int main(void)
//{
//	int m,a,b,sum;
//	scanf("%d",&m);
//	while(m--){
//		scanf("%d%d",&a,&b);
//		sum=0;
//		for(int i=1;i<=a/2;i++){
//			if(a%i==0){
//				sum+=i;
//			}
//			
//		}
//		if(sum==b)
//		printf("YES\n");
//		else
//		printf("NO\n");
//	}
//	return 0;
//}
#include<stdio.h>

int fun(int n)
{
	int sum=0;
	for(int i=1;i<=n/2;i++){
		if(n%i==0){
			sum+=i;
		}
	}
	return sum;
}
int main(void)
{
	int a;
	for(int i=1;i<60000;i++){
		a=fun(i);
		if(i==fun(a)){
			printf("%d %d\n",i,a);
		}
	}
	return 0;
}
