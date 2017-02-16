#include<stdio.h>
#include<string.h>
int main(void)
{
	char c[1001];
	int flag,len;
	while(scanf("%s",c)!=EOF){
		len=strlen(c);
		flag=0;
		for(int i=0;i<len/2;i++){
			if(c[i]!=c[len-i-1]){
				flag=1;
				break;
			}
		}
		if(flag!=0){
			printf("NO\n");
		}
		else{
			printf("YES\n");
		}
	}
	return 0;
}
