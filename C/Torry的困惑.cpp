#include<stdio.h>
#define M 50000;
int main(void)
{
	int n,i,j,t,product;
	scanf("%d",&n);
	int a[100000]={0};
	product=2;
	i=3;
	t=1;
	while(t<n){
		if(!a[i]){
			t++;
			product=(product*i)%M;
			for(j=i*i;j<=100000;j=j+2*i){
				a[j]=1;
			}
		}
		i=i+2;
	} 
	printf("%d",product);
	return 0;
}
