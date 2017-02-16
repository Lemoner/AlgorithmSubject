#include<stdio.h>
int main(void)
{
	int a[101];
	int c,n,t,m,k,max;
	scanf("%d",&c);
	while(c--){
		scanf("%d",&n);
		scanf("%d",&a[1]);
		for(int i=2;i<=n;i++){
			m=0;
			for(int j=1;j<=i;j++){
				scanf("%d",&t);
				if(j==1){
					m=a[j];
					a[j]+=t;
				}
				else if(j==i){
					a[j]=m+t;
				}
				else{
					k=m;
					if(m<a[j]){
						k=a[j];
					}
					m=a[j];
					a[j]=k+t;
				}
			}
		}
		max=0;
		for(int i=1;i<=n;i++){
			if(max<a[i]){
				max=a[i];
			}
		}
		printf("%d\n",max);
	}
	return 0;
}
