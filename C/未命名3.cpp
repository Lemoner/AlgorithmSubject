#include<stdio.h>

int fun(int n)
{
	int t;
	while(n!=0){
		t=n%10;
		if(t==2||t==3||t==5||t==7){
			n=n/10;
		}
		else{
			return 0;
		}
	}
	return 1;
}

int main(void)
{
	int a[4]={2,3,5,7};
	int n,m,product;
	for(int i=0;i<4;i++){
		for(int j=0;j<4;j++){
			for(int k=0;k<4;k++){
				for(m=2;m<4;m++){
					n=a[i]*100+a[j]*10+a[k];
					product=n*a[m];
					if(fun(product)!=0){
						printf("%d*%d=%d\n",n,a[m],product);
					}
				}
			}
		}
	}
	return 0;
}
