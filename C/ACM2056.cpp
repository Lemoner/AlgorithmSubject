#include<stdio.h>
double max(double a,double b)
{
	if(a>b)
	return a;
	else
	return b;
}
double min(double a,double b)
{
	if(a<b)
	return a;
	else
	return b;
}
double fun(double x)
{
	if(x<0)
	return -x;
	else
	return x;
}
int main(void)
{
	double x1,y1,x2,y2,x3,y3,x4,y4,a1,b1,a2,b2,temp;
	while(scanf("%lf%lf%lf%lf%lf%lf%lf%lf",&x1,&y1,&x2,&y2,&x3,&y3,&x4,&y4)!=EOF){
		if(x1>x2){
			temp=x1;
        	x1=x2;
        	x2=temp;
		}
		if(y1>y2){
			temp=y1;
        	y1=y2;
        	y2=temp;
		}
		if(x3>x4){
			temp=x3;
        	x3=x4;
        	x4=temp;
		}
		if(y3>y4){
			temp=y1;
        	y1=y2;
        	y2=temp;
		}
		a1=max(x1,x3);
		b1=max(y1,y3);
		a2=min(x2,x4);
		b2=min(y2,y4);
		if((a1>a2&&b1<b2)||(b1>b2&&a1<a2)){
			printf("0\n");
		}
		else{
			printf("%.2lf\n",fun(a1-a2)*fun(b1-b2));
		}
	}
	return 0;
}

