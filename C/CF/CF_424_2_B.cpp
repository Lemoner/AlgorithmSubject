#include<stdio.h>
#include<string.h>
int main()
{
	
	char oldstr[26];
	char newstr[26];
	char str[1001];
	
	scanf("%s%s%s",oldstr,newstr,str);
	
	for(int i=0;i<strlen(str);i++){
		
		if((str[i]>='a'&&str[i]<='z')||(str[i]>='A'&&str[i]<='Z')){
			for(int j=0;j<26;j++){
				if(str[i]==oldstr[j]){
					printf("%c",newstr[j]);
				}
				else if(str[i]==oldstr[j]-32){
					printf("%c",newstr[j]-32);
				} 
			}
		}
		else{
			printf("%c",str[i]);
		}
		
	}
	
}
