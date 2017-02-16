#include<stdio.h>
#include<string.h>
int main(void)
{
	char s[100];
	int count,len;
	count=0;
	while(scanf("%s",s)!=EOF){
		if(!strcmp(s,"<br>")){
			printf("\n");
			count=0;
		}
		else if(!strcmp(s,"<hr>")){
			if(count!=0){
				printf("\n");
			}
			printf("--------------------------------------------------------------------------------\n");
			count=0;
		}
		else{
			len=strlen(s);
			if(count+len+1<=80){
				if(count==0){
					printf("%s",s);
					count=len;
				}
				else{
					printf(" %s",s);
					count+=len+1;
				}
			}
			else{
				printf("\n%s",s);
				count=len;
			}
		}
	}
	printf("\n");
	return 0;
}
