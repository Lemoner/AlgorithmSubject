#include<stdio.h>
#include<math.h>
int is(int n){
	int i;
	for(i=2;i<=sqrt(n);i++){
		if(n%i==0)
		return 0;
	} 
	return 1;
}
int main(void)
{
	int n,m,i,j,x;
	j=0; 
	int a[10000]; 
	scanf("%d%d",&n,&m);
	for(i=2;i<=m;i++){
		if(is(i)==1){
			a[j]=i;
			j++;
		}
	}
	for(i=n;i<=m;i++){
		printf("%d=",i);
		if(is(i)==1){
			printf("%d",i);
		}
		else{
			x=i;
			while(is(x)!=1){
				for(j=0;;j++){
					if(x%a[j]==0){
						printf("%d*",a[j]);
						break;
					}
				}
				x=x/a[j];
			}
			printf("%d",x); 
		}
		printf("\n");
	}
	return 0;
}
