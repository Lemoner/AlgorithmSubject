#include<stdio.h>
#include<math.h>
#include<string.h>
int main(void)
{
	int i,t;
	char a[12],b[12];
	scanf("%s%s",a,b);
	if(strlen(a)!=strlen(b)){
		printf("1");
	}
	else if(strcmp(a,b)==0){
		printf("2");
	}
	else{
		t=strlen(a);
		for(i=0;i<t;i++){
			if(fabs(a[i]-b[i])!=32&&a[i]!=b[i]){
				printf("4");
				break;
			}
		}
		if(i>=t){
			printf("3");
		}
	}
	return 0;
} 
