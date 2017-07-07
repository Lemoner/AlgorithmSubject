#include<stdio.h>
int main(void)
{
	
	int c,v0,v1,a,l,day,daypage;
	
	scanf("%d%d%d%d%d",&c,&v0,&v1,&a,&l);
	
	c=c-v0;
	day=1;
	
	if(c<=0){
//		printf("%d",day);
	}
	else{
		while(c>0){
			c+=l;
			daypage=v0+day*a;
			if(daypage>v1){
				daypage=v1;
			}
			day++;
			c-=daypage;
		}
	}
	
	printf("%d",day);
	
}
