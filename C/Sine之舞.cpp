#include<stdio.h>
#include<math.h>
int N;
void A(int n,int i){
	if(n==i){
		printf("sin(%d)",n);
	} 
	else{
		if(pow(-1,i)>0){
			printf("sin(%d+",i);
			i++;
			A(n,i);
			printf(")");
		}
		else{
			printf("sin(%d-",i);
			i++;
			A(n,i);
			printf(")");
		}
	}
}
void S(int n){
	if(n==1){
		A(n,1);
		printf("+%d",N+1-n);
	}
	else{
		printf("(");
		S(n-1);
		printf(")");
		A(n,1);
		printf("+%d",N+1-n); 
	}
}
int main(void)
{
	scanf("%d",&N);
	S(N);
	return 0;
}
