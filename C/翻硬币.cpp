#include<stdio.h>
#include<string.h>
int main(void)
{
	char a[1000],b[1000];
	int i,n,x;
	n=0;
	scanf("%s",a);
	scanf("%s",b);
	x=strlen(a);
	for(i=0;i<x-1;i++){
		if(a[i]!=b[i]){
			if(a[i]==a[i+1]){
				a[i+1]=b[i];
				a[i]=b[i];
			}
			else{
				a[i+1]=a[i];
				a[i]=b[i];
			}
			n++;
		}
	}
	printf("%d",n);
	return 0;
} 
