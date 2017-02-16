#include<stdio.h>
#include<string.h>
int main(void)
{
	char a[100],b[100];
	char *x,*t;
	while(scanf("%s%s",a,b)!=EOF){
		x=strstr(a,b);
	    	printf("%s\n",x);
	    	
			t=strstr(x,b);
	    	printf("%s\n",t); 
		
	}
	return 0;
}
