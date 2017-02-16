#include <stdio.h>
#include<time.h> 
#include <stdlib.h>

int main(void)
{
    double i,j;
    int n=0;
    //srand((unsigned)time(NULL)); 
     srand(time(0));
    for(int k=0;k<=10;k++){
    	while(n==0){i = (double)rand()/RAND_MAX*5;
    j =  (double)rand()/RAND_MAX*5;
    if(i+j==5){ 
    printf("%f %f\n",i,j);n=1;} 
	}
	n=0;
	}
    return 0;
}
