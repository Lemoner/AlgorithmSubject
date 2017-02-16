#include<stdio.h>
#include<string.h>
int main(void)
{
	int n;
	char s[11];
	scanf("%d",&n);
	while(n--){
		scanf("%s",&s);
//		printf("6");
//		for(int i=6;i<11;i++){
//			printf("%c",s[i]);
//		}
//		printf("\n");
		printf("6%s\n",s+6);
	}
	
//	int i;
//	char c;
//	scanf("%d%*c",&n);
//	while(n--){
//		putchar('6');
//		for(i=0;i<12;i++){
//			c=getchar();
//			if(i>5){
//				putchar(c);
//			}
//		}
//		putchar('\n');
//	}
	
	return 0;
}
