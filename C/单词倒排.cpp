#include<stdio.h>
#include<string.h>
int main(void)
{
	char xx[10][80];
	int n,m,i,j,p,k,s;
char c[80];
char str[80];
	scanf("%d",&n);	gets(c);
	for(i=0;i<n;i++){
		gets(xx[i]);

	}
	for(i=0;i<n;i++){
		s=strlen(xx[i]);
		k=0;
		p=0; 
		for(j=s-1;j>=0;j--){
			k++;
			m=j;
			if(xx[i][j]==' '){
				for(;k>0;k--){
					str[p++]=xx[i][s-m];
					m--;
				}
				str[p++]=' ';	
			}
			k=0;
		}
		str[s]='\0';
			strcpy(xx[i],str);
	}
	for(i=0;i<n;i++){
		printf("%s\n",xx[i]);
	}
} 
