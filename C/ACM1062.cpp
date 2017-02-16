#include<stdio.h>
#include<string.h>
char a[100];

void fun(int len)
{
	for(int i=len-1;i>=0;i--){
		printf("%c",a[i]);
	}
}

int main(void)
{
	int n,len;
	char c;
	scanf("%d%*c",&n);
	while(n--){
		len=0;
		while(1){
			c=getchar();
			if(c=='\n'){
				fun(len);
				printf("%c",c);
				break;
			}
			else if(c==' '){
				fun(len);
				len=0;
				printf("%c",c);
			}
			else{
				a[len++]=c;
			} 
		}
	}
	return 0;
}
