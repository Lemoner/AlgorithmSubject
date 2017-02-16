#include<stdio.h>
#include<math.h>
int n;
int count=0;
int a[10];
int fabss(int t){
	for(int i=1;i<t;i++){
		if(abs(i-t)==abs(a[i]-a[t])||(a[i]==a[t]))
		return 0;
	}
	return 1;
}
void fun(int t){
	if(t>n){
		count++;
	}
	else{
	for(int i=1;i<=n;i++){
		a[t]=i;
		if(fabss(t)){
			t++;
			fun(t);
			t--;
		}
	
	}	
	}
}
int main(void){
	scanf("%d",&n);
	fun(1);
	printf("%d",count);
	return 0;
} 
