#include<stdio.h>
#include<string.h>
int main(void)
{
	char a[203];
	int count,len;
	while(gets(a)){
		count=0;
		len=strlen(a);
		for(int i=2;i<len;i++){
			if(a[i]==a[0]||a[0]==a[i]-32||a[0]==a[i]+32){
				count++;
			}
		}
		printf("%.5f\n",(double)count/(len-2));
	}
	return 0;
}
