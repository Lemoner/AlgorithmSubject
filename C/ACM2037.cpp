#include<stdio.h>
int main(void)
{
	int n,sum,max,j;
	int a[101][2];
	while(scanf("%d",&n),n!=0){
	
	for(int i=1;i<=n;i++){
		scanf("%d%d",&a[i][0],&a[i][1]);
		a[0][0]=a[i][0];
		a[0][1]=a[i][1];
		for(j=i-1;j>0;j--){
			if(a[0][1]>=a[j][1]){
				break;
			}
			a[j+1][0]=a[j][0];
			a[j+1][1]=a[j][1];
		}
		a[j+1][0]=a[0][0];
		a[j+1][1]=a[0][1];
	}
	max=a[1][1];
		sum=1;
		for(int i=2;i<=n;i++){
			if(a[i][0]>=max){
				max=a[i][1];
				sum++;
			}
		}
		printf("%d\n",sum);
}
	return 0;
}
