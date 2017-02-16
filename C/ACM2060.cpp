#include<stdio.h>
int main(void)
{
	int n,num,x,y;
	scanf("%d",&n);
	while(n--){
		scanf("%d%d%d",&num,&x,&y);
		if(num>6){
			x+=(num-6)*8;
			num=6;
		}
		if(num<=6){
			while(num>0){
				x+=7-num+1;
				num--;
			}
		}
		if(x>=y){
			printf("Yes\n");
		}
		else{
			printf("No\n");
		}
	}
	return 0;
}
