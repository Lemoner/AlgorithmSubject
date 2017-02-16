#include<stdio.h>
int main(void)
{
	int t,n,m;
	__int64 a[21][2]={{1,0},{1,0},{2,1}};
	scanf("%d",&t);
	for(int i=3;i<21;i++){
		a[i][0]=a[i-1][0]*i;
		a[i][1]=(i-1)*(a[i-1][1]+a[i-2][1]);
	}
	while(t--){
		scanf("%d%d",&n,&m);
		printf("%I64d\n",a[n][0]/a[m][0]/a[n-m][0]*a[m][1]);
	}
}
