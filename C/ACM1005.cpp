#include<stdio.h>
int main()
{
	long int f[100];
	int a,b,i;
	long int n;
	
	while(scanf("%d%d%ld",&a,&b,&n),a+b+n)
	{
		f[0]=1;
		f[1]=1;
		for(i=2;i<48;i++)
		{
			f[i]=(a*f[i-1]+b*f[i-2])%7;
		}
		n=(n-1)%48;
		printf("%ld\n",f[n]);
	}
	return 0;
}
