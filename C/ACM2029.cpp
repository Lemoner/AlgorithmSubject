#include<stdio.h>
#include<string.h>
int main(void)
{
	int n,len,flag;
	char c[1000];
	scanf("%d",&n);
	while(n--){
		scanf("%s",c);
		len=strlen(c);
		flag=0;
		for(int i=0;i<len/2;i++){
			if(c[i]!=c[len-i-1]){
				flag=1;
				break;
			}
		}
		if(flag==1){
			printf("no\n");
		}
		else{
			printf("yes\n");
		}
	}
	return 0;
} 
