#include <stdio.h>
#include<time.h> 
#include <stdlib.h>
int main(void){
	srand(time(0));
	int i,j;
	int k[10];
	for(i=0;i<10;i++){
		do{
			k[i]=rand()%10;
			for(j=0;j<i;j++){
				if(k[j]==k[i]){
					break;
				}
			}
		}while(j<i);
	}
	for(i=0;i<10;i++){
		printf("%d ",k[i]);
	}
	return 0;
} 
