#include<stdio.h>
int main(void)
{
	double ax,ay,bx,by,cx,cy,dx,dy,x,y,r;
	scanf("%lf%lf%lf%lf%lf%lf%lf%lf%lf%lf",&ax,&ay,&bx,&by,&cx,&cy,&dx,&dy,&x,&y);
//	scanf("%lf%lf",&bx,&by);
//	scanf("%lf%lf",&cx,&cy);
//	scanf("%lf%lf",&dx,&dy);
	r=(bx-ax)*(y-ay)-(by-ay)*(x-ax);
	if(r>0)
	printf("Yes\n");
	else if(r==0){
		printf("XXXX");
		return 0;
	}
	else
	printf("No\n");
	r=(cx-bx)*(y-by)-(cy-by)*(x-bx);
	if(r>0)
	printf("Yes\n");
	else if(r==0){
		printf("XXXX");
		return 0;
	}
	else
	printf("No\n");
    r=(dx-cx)*(y-cy)-(dy-cy)*(x-cx);
	if(r>0)
	printf("Yes\n");
	else if(r==0){
		printf("XXXX");
		return 0;
	}
	else
	printf("No\n");
	r=(ax-dx)*(y-dy)-(ay-dy)*(x-dx);
	if(r>0)
	printf("Yes\n");
	else if(r==0){
		printf("XXXX");
		return 0;
	}
	else
	printf("No\n");
	return 0;
}
