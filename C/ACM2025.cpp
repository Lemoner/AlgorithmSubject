#include<stdio.h>
#include<string.h> 
#include<stdlib.h>
int main(void)
{
	char a[101];
	char c; 
	int t;
	while(gets(a)){
		c=a[0];
		t=strlen(a);
		for(int i=1;i<t;i++){
			if(c<a[i]){
				c=a[i];
			}
		}
		for(int i=0;i<t;i++){
			printf("%c",a[i]);
			if(a[i]==c){
				printf("(max)");
			}
		}
		printf("\n");
	}
	return 0;
}
