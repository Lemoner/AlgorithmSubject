#include<stdio.h>
int main(void)
{
	int a[100];
	double b[10];
	int i,j;
	double n,m; 
	scanf("%lf",&n);
	scanf("%lf",&m);
	for(i=1;i<=9;i++){
		b[i]=n*i;
	}
	for(i=0;i<300;i++){
		if(m>=n){
			for(j=9;j>=1;j--){
				if(b[j]<=m)break;
			}
			a[i]=j;
			m=m-b[j];
		
		}
		else{
			a[i]=0;	
		}
		m=m*10;
	}

	for(int i=0;i<100;i++){
		printf("%d",a[i]);
	}
} 
