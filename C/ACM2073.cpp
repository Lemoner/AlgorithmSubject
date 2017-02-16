#include<stdio.h>
#include<math.h>
int main(void)
{
	int n,x1,x2,y1,y2,t;
	double sum;
	scanf("%d",&n);
	while(n--){
		scanf("%d%d%d%d",&x1,&y1,&x2,&y2);
		sum=0;
		if(x1==0&&y1==0){
			sum=1;
			y1=1;
		}
		if(x1+y1>x2+y2||(x1+y1==x2+y2&&x1>x2)){
			t=x1;
			x1=x2;
			x2=t;
			t=y1;
			y1=y2;
			y2=t;
		}
		while(x1+y1!=x2+y2){
			sum+=y1*sqrt(2)+sqrt(pow(x1+y1,2)+pow(x1+y1+1,2));
			y1=x1+y1+1;
			x1=0;
		}
		sum+=(y1-y2)*sqrt(2);
		printf("%.3f\n",sum);
	}
	return 0;
}
