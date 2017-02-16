#include<stdio.h>
int a[15]={1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384};
void X(int n){
	if(n==1)
	printf("2(0)");
	else if(n==2)
	printf("2");
	else{
		int k=14;
		while(a[k]>n)
		k--;
		if(k>1){
		printf("2(");
		X(k);
		printf(")");	
		}
		else{
			X(k+1);
		}
		n=n-a[k];
		if(n>0){
		printf("+");
		X(n);	
		}
	}
}
int main()
{
	int n;
	scanf("%d",&n);
	X(n);
	return 0;
} 
