#include<stdio.h>
#include<math.h>
int main(void)
{
	int c,n;
	__int64 a[21][2]={{1,0},{1,0},{2,1}};
	for(int i=3;i<21;i++){
			a[i][0]=i*a[i-1][0];
			a[i][1]=(i-1)*(a[i-1][1]+a[i-2][1]);
	}
	scanf("%d",&c);
	while(c--){
		scanf("%d",&n);
		printf("%.2f%%\n",a[n][1]*100.0/a[n][0]);
	}
	return 0;
}
