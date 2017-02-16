#include<stdio.h>
#include<string.h>
int main(void)
{
	char a[100001],b[100001];
	int len_a,len_b;
	while(scanf("%s",a)!=EOF){
		scanf("%s",b);
		len_a=strlen(a);
		len_b=strlen(b);
		if(len_a<len_b){
			printf("no\n");
		}
		else{
			for(int i=0;i<len_a;i++){
				a[len_a+i]=a[i];
			}
			a[2*len_a]='\n';
			if(strstr(a,b)){
				printf("yes\n");
			}
			else{
				printf("no\n");
			}
		}
	}
}
