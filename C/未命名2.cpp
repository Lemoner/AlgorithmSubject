#include<stdio.h>
int main(void)
{
	int n;
	scanf("%d",&n);
	while(n--){
		scanf("%d%d%d",num,x,y);
		if(num>7){
			x+=(num-7)*8;
			num=7;
		}
		if(num<=7){
			while(num>0){
				x+=7-num+1;
				num--;
			}
		}
	}
	return 0;
}
