#include<stdio.h>
int main(void)
{
	int a[101],b[101];
	int n,m,temp,min;
	while(scanf("%d%d",&n,&m),n!=0||m!=0){
		for(int i=0;i<n;i++){
			scanf("%d",&a[i]);
		}
		for(int i=0;i<m;i++){
			scanf("%d",&b[i]);
			for(int j=0;j<n;j++){
				if(a[j]==b[i]){
					temp=a[n-1];
					a[n-1]=a[j];
					a[j]=temp;
					n--;
					break;
				}
			}
		}
		if(n==0){
			printf("NULL\n");
		}
		else{
			for(int i=0;i<n;i++){
				min=i;
				for(int j=i+1;j<n;j++){
					if(a[min]>a[j]){
						min=j;
					}
				}
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
			for(int i=0;i<n;i++){
				printf("%d ",a[i]);
			}
			printf("\n");
		}
	}
	return 0;
}
