#include<iostream>
#include<algorithm>
#include<stdio.h>
#include<string.h>
using namespace std;
int main(void)
{
	char a[105],b[105],c[105];
	int  n,m,x,t,i,j,max;
	scanf("%s",a);
	scanf("%s",b);
	n=strlen(a);
	m=strlen(b);
	reverse(a,a+n);
	reverse(b,b+m);
	if(n>=m){
		for(i=m;i<n;i++){b[i]='0';
		}	
		max=n;
	}
	if(n<m){
		for(i=n;i<m;i++){a[i]='0';
		}		
		max=m;
	}
	t=0;
	for(i=0;i<max;i++){
		x=(a[i]-'0')+(b[i]-'0')+t;

		c[i]=x%10+'0';
		t=x/10;
	
	}
	if(t!=0){
	c[i]=t+'0';
	}
	else
	i=i-1;
	
	for(j=i;j>=0;j--){printf("%c",c[j]);
	}

	return 0;
} 
