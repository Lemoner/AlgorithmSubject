#include<stdio.h>
unsigned a[10000];
unsigned b[10000];
int main(void)

{
	int n,i,j,w,k=0;
	scanf("%d",&n);
	int s=n;
	while(s){
		k++;
		a[k]=s%10;
		s=s/10;
	}
	for(i=n-1;i>0;i--){
		w=0;
		for(j=1;j<=k;j++){
			a[j]=a[j]*i+w;
			w=a[j]/10;
			a[j]=a[j]%10;
		}
		while(w){
			k++; 
			a[k]=w%10;
			w=w/10;
		}
		int t=k;
		while(t){
		printf("%d",a[t]);
		t--;
	}printf("\n");
	}
	while(k){
		printf("%d",a[k]);
		k--;
	}printf("\n");
	return 0;
}
