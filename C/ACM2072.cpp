#include<stdio.h>
#include<string.h>
int main(void)
{
	char s[1000];
	char a[100][100];
	int i,t,sum,len,flag;
	while(gets(s),s[0]!='#'){
		memset(a,'\0',sizeof(a));
		len=strlen(s);
		sum=0;
		t=0;
		flag=0;
		while(t<len){
			if(s[t]==' '){
				if(flag>0){
					for(i=0;i<sum;i++){
						if(!strcmp(a[i],a[sum])){
							break;
						}
					}
					if(i<sum){
						for(i=0;i<flag;i++){
							a[sum][i]='\0';
						}
					}
					else{
						sum++;
					}
					flag=0;
				}
			}
			else{
				a[sum][flag++]=s[t];
			}
			t++;
		}
		if(flag>0){
			for(i=0;i<sum;i++){
						if(!strcmp(a[i],a[sum])){
							break;
						}
					}
					if(i<sum){
						for(i=0;i<flag;i++){
							a[sum][i]='\0';
						}
					}
					else{
						sum++;
					}
		}
//		for(int i=0;i<sum;i++){
//			printf("%s ",a[i]);
//		}
		printf("%d\n",sum);
	}
	return 0;
}
