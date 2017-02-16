#include<stdio.h>
int main()
{
	int year,month,day,t;
	while((scanf("%d%d%d",&year,&month,&day))!=EOF){
	t=(day+2*month+3*(month+1)/5+year+year/4-year/100+year/400+1)%7;//输入1月或2月时，要按上一年的输入，月份改为13或14。例如2014-2-10要输成2013-14-10 
	printf("%d\n",t);	
	}
	
	return 0;
} 
