#include<stdio.h>
#include<string.h> 
#include<stdlib.h>
int main(void)
{
	char a[101];
	int len;
	while(gets(a)){
		len=strlen(a);
		printf("%c",a[0]-32);
		for(int i=1;i<len;i++){
			if(a[i]==' '&&i+1<len){
				i++;
				printf(" %c",a[i]-32);
			}
			else{
				printf("%c",a[i]);
			}
		}
		printf("\n");
	} 
	return 0;
} 
