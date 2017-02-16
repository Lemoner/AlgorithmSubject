#include<stdio.h>
int main(void)
{
	int t1,t2,v1,v2,s,t,l,x,j;
	scanf("%d%d%d%d%d",&v1,&v2,&s,&t,&l);
	t2=l/v2;
	t1=0,x=0,j=0;
	while((v2*t1<l)||(x<l)){
		if(v2*t1==l){
			t1=t1+(l-x)/v1;
			break;
		}
		if(x==l){                                                               
			break;
		} 		
		if((x-v2*t1)>=s){
			t1=t1+t;
		}
		else{
			t1++;
			j++;
		}		
		x=v1*j;
	}
	if(t1==t2){
		
		printf("D\n%d",t1);
	} 
	else if(t1<t2){
		printf("R\n%d",t1);
	}
	else{
		printf("T\n%d",t2);
	}
	return 0;
} 
