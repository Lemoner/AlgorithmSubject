#include<stdio.h>
int main(void)
{
	int t,n,a,start,sum,maxstart,maxend,maxsum;
	scanf("%d",&t);
	for(int i=1;i<=t;i++){
		scanf("%d",&n);
		sum=0;
		maxsum=-999999;
		start=1;
		for(int j=1;j<=n;j++){
			scanf("%d",&a);
			sum+=a;
			if(sum>=maxsum){
				maxsum=sum;
				maxstart=start;
				maxend=j;
			}
			if(sum<0){
				sum=0;
				start=j+1;
			}
		}
		printf("Case %d:\n%d %d %d\n",i,maxsum,maxstart,maxend);
		if(i!=t){
			printf("\n");
		}
	}
	return 0;
}
