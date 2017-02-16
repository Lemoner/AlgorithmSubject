#include<stdio.h>
#include<math.h>
int main(void)
{
	int a,b,c,x,y,z,sum=0;
	int n;
	scanf("%d",&n);
	for(x=0;x<20;x++){
		for(y=0;y<=13;y++){
			for(z=0;z<10;z++){
				if(2*x+3*y+4*z==n){
					printf("%d %d %d \n",x,y,z);
					if(x==0)
					a=0;
					else
					a=pow((x+1),y);
					if(z==0)
					b=0;
					else
					b=pow((x+y+1),z);
					if(y==0)
					c=0;
					else
					c=pow(2,y);
					sum=sum+a+b+c;
					
				}
				
			}
		}
	}
	printf("%d",sum);
	return 0;
} 
