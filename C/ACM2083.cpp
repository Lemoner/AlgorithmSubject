#include<stdio.h>
int main(void)
{
	int a[501];
	int n,m,k,sum;
	scanf("%d",&n);
	while(n--){
		scanf("%d",&m);
		for(int i=1;i<=m;i++){
			scanf("%d",&a[i]);
			a[0]=a[i];
			k=i-1;
			while(a[k]>a[0]){
				a[k+1]=a[k];
				k--;
			}
			a[k+1]=a[0];
		}
		k=(1+m)/2;
		sum=0;
		for(int i=1;i<k;i++){
			sum+=a[k]-a[i];
		}
		for(int i=m;i>k;i--){
			sum+=a[i]-a[k];
		}
		printf("%d\n",sum);
	}
	return 0;
}
