#include<stdio.h>
#include<string.h>
int main(void)
{
	char a[1001],b[1001];
	char *p;
	int len,count;
	while(scanf("%s",a),a[0]!='#'){
		scanf("%s",b);
		len=strlen(b);
		count=0;
		for(p=a;strstr(p,b);p+=len){
			count++;
			p=strstr(p,b);
		}
		printf("%d\n",count);
	}
	return 0;
}
