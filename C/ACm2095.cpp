//#include<stdio.h>
//int main(void)
//{
//	int a,b;
//	a=0;
//	while(scanf("%d",&b)!=EOF){
//		a=a^b;
//		printf("%d\n",a); 
//	}
//	return 0;
//}
#include <stdio.h>
int main(void)
{
	int s,n,a;
	while(s=0,scanf("%d",&n),n)
	{
		while(scanf("%d",&a),s^=a,--n);
		printf("%d\n",s);
	}
}
