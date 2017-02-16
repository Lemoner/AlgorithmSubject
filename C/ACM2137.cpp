#include<stdio.h>
#include<string.h>
int main(void)
{
	int n,len;
	char a[80];
	while(scanf("%s%d",a,&n)!=EOF){
	len=strlen(a);
	while(n<0){
		n+=8;
	}
	switch(n%8){
		case 0:
		    printf("%s\n",a);
		    break;
		case 1:
			for(int i=len-1;i>=0;i--){
				for(int j=0;j<i;j++){
					printf(" ");
				}
				printf("%c\n",a[i]);
			}
			break;
		case 2:
			for(int i=len-1;i>=0;i--){
				for(int j=0;j<len/2;j++){
					printf(" ");
				}
				printf("%c\n",a[i]);
			}
			break;
		case 3:
			for(int i=len-1;i>=0;i--){
				for(int j=0;j<len-i-1;j++){
					printf(" ");
				}
				printf("%c\n",a[i]);
			}
			break;
		case 4:
			for(int i=len-1;i>=0;i--){
				printf("%c",a[i]);
			}
			printf("\n");
			break;
		case 5:
			for(int i=0;i<len;i++){
				for(int j=0;j<len-i-1;j++){
					printf(" ");
				}
				printf("%c\n",a[i]);
			}
			break;
		case 6:
		    for(int i=0;i<len;i++){
		    	for(int j=0;j<len/2;j++){
					printf(" ");
				}
		    	printf("%c\n",a[i]);
		    }
		    break;
		case 7:
		    for(int i=0;i<len;i++){
		    	for(int j=0;j<i;j++){
		    		printf(" ");
		    	}
		    	printf("%c\n",a[i]);
		    }
			break;	
	}
}
	return 0;
} 
