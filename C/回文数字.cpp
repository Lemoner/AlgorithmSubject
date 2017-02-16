#include<stdio.h>
int main()
{
	int n,a,b,c,sum=0;
	scanf("%d",&n);
	for(a=1;a<10;a++){
		for(b=0;b<10;b++){
	        c=n-(a+b)*2;
			if(c>=0&&c<10){
				sum++;
				printf("%d%d%d%d%d\n",a,b,c,b,a);
			}		    		
	    }
    }
	if(n%2==0){
	    for(a=1;a<10;a++){
		    for(b=0;b<10;b++){
		    	c=n/2-a-b;
		    	if(c>=0&&c<10){
		    		sum++;
		    		printf("%d%d%d%d%d%d\n",a,b,c,c,b,a);
		    	}
	    	}
    	}	
	}
	if(!sum)
	printf("-1");
	return 0;
}
