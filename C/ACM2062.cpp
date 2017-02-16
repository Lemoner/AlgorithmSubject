#include<stdio.h>

int main(void)
{
	int n,k;
	int a[21]={0};
	__int64 m,t;
	__int64 c[21]={0};
	for(int i=1;i<21;i++){
		c[i]=(i-1)*c[i-1]+1;
//		printf("%I64d ",c[i-1]);
	}
	while(scanf("%d%I64d",&n,&m)!=EOF){
		for(int i=1;i<=n;i++){
			a[i]=i;
		}
		while(m>0){
			if(m%c[n]==0){
				t=m/c[n];
			}
			else{
				t=m/c[n]+1;
			}
			printf("%d",a[t]);
			k=a[t];
			for(int i=t;i<n;i++){
				a[i]=a[i+1];
			}
			a[n]=k;
			m=m-(t-1)*c[n]-1;
			n--;
			if(m>0){
				printf(" ");
			}
		}
		printf("\n");
	}
	return 0;
}
