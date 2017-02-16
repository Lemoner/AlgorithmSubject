#include<stdio.h>
int main()
{
	int a,b,c ;
	scanf("%d%d",&a,&b);
	printf("%d/%d=",a,b);
	while(1){
		if(b%a){
			c=b/a+1;
		}
		else{
			c=b/a;
			a=1;
		}
		if(a==1){
			printf("1/%d",c);
			break;
		}
		else{
			printf("1/%d+",c);
		}
		a=a*c-b;
		b=b*c;
	}
	return 0;
}
