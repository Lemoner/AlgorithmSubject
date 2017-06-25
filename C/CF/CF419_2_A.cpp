#include<stdio.h>
#include<string.h>

int num(int a,int b){
	if(a==0){
		return b;
	}
	else{
		return a*10+b;
	}
}

int flag(int a,int b){
	if(a/10==b%10&&a%10==b/10){
		return 1;
	}
	else{
		return 0;
	}
}

int main(void)
{
	
	char s[5];
	int hh,mm,count;
	scanf("%s",s);
	
	hh=num(s[0]-'0',s[1]-'0');
	mm=num(s[3]-'0',s[4]-'0');
	
	count=0;
	while(!flag(hh,mm)){
		
		mm++;
		count++;
		
		if(mm==60){
			mm=0;
			hh++;
		} 
		if(hh==24){
			hh=0;
		}
		
	}
	
	printf("%d",count);
	
	
} 
