#include<stdio.h>
#include<string.h>
int main(void)
{
	int n,count;
	char c,t;
	scanf("%d%*c",&n);
	while(n--){
		count=0;
		t=' ';
		while(c=getchar(),c!='\n'){
			if(c!=t){
				if(t!=' '){
					if(count>1){
						printf("%d%c",count,t);
					}
					else{
						printf("%c",t);
					}
					count=0;
				}
				count++;
				t=c;
			}
			else{
				count++;
			}
		}
		if(count>1){
			printf("%d%c",count,t);
		}
		else{
			printf("%c",t);
		}
		if(n!=1){
			printf("\n");
		}
	}
	return 0;
}
