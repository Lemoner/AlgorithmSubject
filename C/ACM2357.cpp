#include<stdio.h>
#include<string.h>

int fun(char c)
{
	if(c=='I'){
		return 1;
	}
	else if(c=='V'){
		return 5;
	}
	else if(c=='X'){
		return 10;
	}
	else if(c=='L'){
		return 50;
	}
	else if(c=='C'){
		return 100;
	}
	else if(c=='D'){
		return 500;
	}
	else if(c=='M'){
		return 1000;
	}
	return 0;
}

int main(void)
{
	int n,len,sum;
	char a[1001];
	scanf("%d",&n);
	while(n--){
		scanf("%s",a);
		len=strlen(a);
		sum=0;
		for(int i=0;i<len-1;i++){
			if(fun(a[i])<fun(a[i+1])){
				sum-=fun(a[i]);
			}
			else{
				sum+=fun(a[i]);
			}
		}
		sum+=fun(a[len-1]);
		printf("%d\n",sum);
	}
	return 0;
}
