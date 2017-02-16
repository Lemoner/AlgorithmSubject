#include<stdio.h>
int main(void)
{
	int a[51];
	int n,i,x,y,t,sum;
	x=0;y=0;t=0;sum=1;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	scanf("%d",&a[i]);
	if(a[0]>0){
		for(i=1;i<n;i++){
			if((a[i]<0)&&(-a[i]>a[0])){
			t=1;
			x++;
			}
			if((a[i]>0)&&(-a[i]<a[0])){
			y++;
			}
		}
		if(t==1){
			sum=x+y+1;
		}		
	}
	if(a[0]<0){
		for(i=1;i<n;i++){
			if((a[i]>0)&&(a[i]<-a[0])){
			t=1;
			x++;
			}
			if((a[i]<0)&&(a[i]<a[0])){
			y++;
			}
		}
		if(t==1){
			sum=x+y+1;
		}		
	}
	printf("%d",sum);
	return 0;
} 
