#include <stdio.h>
#include <string.h>

int main(void)
{
	int n;
	int a[33];
	while(scanf("%d",&n)!=EOF){
		memset(a,0,sizeof(a));
		a[0]=1;
		for(int i=0;i<n;i++){
			printf("%d",a[0]);
			for(int j=i;j;j--){
				a[j]+=a[j-1];
			}
			for(int j=1;j<=i;j++){
				printf(" %d",a[j]);
			}
			printf("\n");
		} 	
		printf("\n");
	}
	return 0;
}
