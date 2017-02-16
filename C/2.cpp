#include<stdio.h>
#include<math.h>
int main (void)
{
	int i=1;
	double k;
	while(1){
		k=sqrt(111*111*111+(i-1)*(i-1));
		if(k-(int)k==0){
		printf("%d %lf",i,k);
		break;}
		i++;
		
		
	}
	return 0;
}
