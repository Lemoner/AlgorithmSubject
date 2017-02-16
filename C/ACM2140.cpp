//#include<stdio.h>
//#include<string.h>
//int main(void)
//{
//	char a[26]={'c',' ','a','d','i','f','g','h','e','j','k','m','l','n','o','p',',','r','s','!','u','v','w','x','y','z'};
//	char s[10000];
//	int len;
//	while(scanf("%s",s)!=EOF){
//		len=strlen(s);
//		for(int i=0;i<len;i++){
//			printf("%c",a[s[i]-'a']);
//		}
//		printf("\n");
//	}
//	return 0;
//}
#include <stdio.h>

int main(void)
{
	char t;
	while((t=getchar()) != EOF)
	{
		switch (t)
		{
			case 'b': t=' ';break;
			case 'q': t=',';break;
			case 't': t='!';break;
			case 'm': t='l';break;
			case 'i': t='e';break;
			case 'c': t='a';break;
			case 'a': t='c';break;
			case 'e': t='i';break;
			case 'l': t='m';break;	
		}
		printf("%c",t);
	}
	return 0;
}
