#include<stdio.h>
int main()
{
	int year,month,day,t;
	while((scanf("%d%d%d",&year,&month,&day))!=EOF){
	t=(day+2*month+3*(month+1)/5+year+year/4-year/100+year/400+1)%7;//����1�»�2��ʱ��Ҫ����һ������룬�·ݸ�Ϊ13��14������2014-2-10Ҫ���2013-14-10 
	printf("%d\n",t);	
	}
	
	return 0;
} 
