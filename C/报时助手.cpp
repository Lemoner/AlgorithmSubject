#include<stdio.h>
#include<string.h>
int main(void)
{
	int h,m;
	char const *a[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","thirty","forty","fifty"};
	scanf("%d%d",&h,&m);
	if(h<=20){
		printf("%s ",a[h]); 
	} 
	else{
		printf("%s %s ",a[20+h/10-2],a[h%10]);
	}
	if(m==0){
		printf("o'clock");
	}
	else if(m<=20){
		printf("%s",a[m]);
	}
	else{
		printf("%s %s",a[20+m/10-2],a[m%10]);
	}
	return 0; 
}
