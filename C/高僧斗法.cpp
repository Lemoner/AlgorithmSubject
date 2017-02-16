#include<stdio.h>
int main(void)
{
	int a[100],b[100];
	int i,j,k,count,sum,t;
	i=0;
	char c; 
	while(1){
		scanf("%d%c",&a[i++],&c);
		if(c=='\n')
		break;
	}
	count=i;
	for(i=0;i<count-1;i++){
		b[i]=a[i+1]-a[i]-1;
	}

	sum=b[0];
	for(i=2;i<count-1;i=i+2){
		sum^=b[i];
	} 
	if(sum==0){
		t=a[1]-a[0]-1;
		if(t==0||(t==1&&count%2!=0))
		printf("no!");
		else
		printf("%d %d",a[0],a[0]+t);
	}
	else{
		for(i=0;i<count-1;i++){
			for(j=1;j<=b[i];j++){
				b[i]-=j;
				if(i!=0){
					b[i-1]+=j;
				}
				sum=b[0];
				for(k=2;k<count-1;k=k+2){
				    sum^=b[k];
				} 
				if(sum==0){
					printf("%d %d",a[i],a[i]+j);
					break;
				}
				b[i]+=j;
				if(i!=0){
					b[i-1]-=j;
				}
			}
		}	
	}
	return 0;
}
