#include<stdio.h>
int main(void)
{
	
	__int64 a[200001];
	int n;
	__int64 flag;
	
	scanf("%d",&n);
	
	for(int i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	
	flag=1;
	for(int i=n-1;i>0;i--){
		for(int j=0;j<i;j++){
			if(flag%2==1){
				a[j]=a[j]+a[j+1];
			}
			else{
				a[j]=a[j]-a[j+1];
			}
			a[j]=a[j]%(1000000000+7);//防止大数出现 
			flag++;
		}
	}
	
	if(a[0]%(1000000000+7)>=0){
		printf("%I64d",a[0]%(1000000000+7));
	}
	else{
		printf("%I64d",1000000000+7+a[0]%(1000000000+7));
	}
	 
}
