#include<stdio.h>
int main(void)
{
	int num;
	int a[4001]={0};
	
	while(scanf("%d",&num)!=EOF){
		a[num]++;
//		printf("%d ",a[num]);
	}
	
	for(int i=0;i<4001;i++){
		if(a[i]>0){
			printf("%d %d ",i,a[i]);
		}
	}
	
}
