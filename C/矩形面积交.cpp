#include<stdio.h>
double max(double a,double b){
	if(a>b)
	return a;
	else
	return b;
} 
double min(double a,double b){
	if(a<b)
	return a;
	else
	return b;
}
int main(void)
{
	long double ax,ay,bx,by,cx,cy,dx,dy,minx,miny,maxx,maxy,sum;
	scanf("%lf%lf%lf%lf%lf%lf%lf%lf",&ax,&ay,&bx,&by,&cx,&cy,&dx,&dy);
	minx=max(ax,cx);
	miny=max(ay,cy);
	maxx=min(bx,dy);
	maxy=min(by,dy);
	if(minx>maxx||miny>maxy)
	sum=0;
	else
	sum=(maxx-minx)*(maxy-miny);
	printf("%.2lf",sum);
	return 0; 
} 
