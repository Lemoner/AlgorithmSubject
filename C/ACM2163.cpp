#include<stdio.h>
#include<string.h>
int main(void)
{
	char s[56];
	int i,len,t;
	t=0;
	while(scanf("%s",s),strcmp(s,"STOP")){
		len=strlen(s);
		i=0;
		while(i<len/2){
			if(s[i]==s[len-i-1]){
				i++;
			}
			else{
				break;
			}
		}
		if(i<len/2){
			printf("#%d: NO\n",++t);
		}
		else{
			printf("#%d: YES\n",++t);
		}
	}
	return 0;
}
