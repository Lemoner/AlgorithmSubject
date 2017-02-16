#include<stdio.h>
int main(void)
{
	char s[3];
	char temp;
	while(scanf("%s",s)!=EOF){
		for(int i=0;i<3;i++){
			for(int j=i+1;j<3;j++){
				if(s[i]>s[j]){
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		printf("%c %c %c\n",s[0],s[1],s[2]);
	}
	return 0;
} 
