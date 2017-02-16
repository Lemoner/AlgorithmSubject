#include<stdio.h>

//int fun(int m){
//	if(m==0)
//	return 0;
//	if(m==1)
//	return 1;
//	return fun(m-1)+fun(m-2);
//}
//
//int main(void)
//{
//	int n,m;
//	scanf("%d",&n);
//	while(n--){
//		scanf("%d",&m);
//		printf("%d\n",fun(m));
//	}
//	return 0;
//}

int main(void)
{
	int n,m,i;
	__int64 a[41]={0,1};

    for (i = 2; i < 41; i++)
        a[i] = a[i-1] + a[i-2];


	scanf("%d",&n);
	while(n--){
		scanf("%d",&m);
		printf("%I64d\n",a[m]);
	}
	return 0;
}
