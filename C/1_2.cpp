#include<stdio.h>
int main(void)
{
	int x,y,n,m,i,j,count;
	char a[5];
	for(i=12345;i<=98765;i++){
		sprintf(a,"%d",i);
		for(i=0;i<4;i++){
			for(j=i+1;j<5;j++){
				if(a[i]==a[j])
				break;
			}
		}
		if(j!=4)continue;
		x=i/1000;
		y=i%1000;
		n=i/10000*100+i%100/10*10+i/1000%10;
		m=i%1000/10*10+i%10;
		if(x*y==n*m)
		count++;
	}
	printf("%d",count);
	
}
