#include<stdio.h>
#include<string.h>
int main(void)
{
	int year,month,day,t,len,flag,sum;
	int a[2][13]={{0,31,28,31,30,31,30,31,31,30,31,30,31},{0,31,29,31,30,31,30,31,31,30,31,30,31}};
	char c[10];
	while(scanf("%s",c)!=EOF){
		year=0,month=0,day=0,t=0;
		len=strlen(c);
		for(int i=0;i<len;i++){
			if(c[i]=='/'){
				t++;
				continue;
			}
			if(t==0){
				year=year*10+(c[i]-'0');
			}
			else if(t==1){
				month=month*10+(c[i]-'0');
			}
			else if(t==2){
				day=day*10+(c[i]-'0');
			}
		}
		flag=0;
		if(year%400==0||(year%4==0&&year%100!=0)){
			flag=1;
		}
		sum=day;
		for(int i=1;i<month;i++){
			sum+=a[flag][i];
		}
		printf("%d\n",sum);
	}
	return 0;
}
