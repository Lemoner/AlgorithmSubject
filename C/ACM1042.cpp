#include<stdio.h>
int main(void)
{
	int a[50000];
	int n,k,w,len;
	while(scanf("%d",&n)!=EOF){
		if(n==0){
			printf("%d\n",n+1);
		}
		else{
		
	len=0;
	k=n;
	while(k){
		a[++len]=k%10;
		k=k/10;
	}
	for(int i=2;i<n;i++){
		w=0;
		for(int j=1;j<=len;j++){
			a[j]=a[j]*i+w;
			w=a[j]/10;
			a[j]=a[j]%10;
		}
		while(w){
			a[++len]=w%10;
			w=w/10;
		}
	}
	for(int m=len;m>=1;m--){
			printf("%d",a[m]);
		}
		printf("\n");
	}
	}
	return 0;
} 
