#include<stdio.h>

int Wei(int x){
	
	int count=0;
	while(x>0){
		x=x/2;
		count++;
	}
	
	return count;
}

int main(void){
	
	int m,n,ml,nl,result,index,count;
	int a[32],b[32];
	
	scanf("%d%d",&m,&n);
	
	ml=0;
	nl=0;
	
	while(m>0){
		a[ml]=m%2;
		m=m/2;
		ml++;
	}
	
	while(n>0){
		b[nl]=n%2;
		n=n/2;
		nl++;
	}
	
	if(ml<nl){
		for(int i=0;i<ml;i++){
			b[i]=1;
		}
	}
	
	for(index=ml;index>0;index--){
		if(a[index-1]!=b[index-1]){
			break;
		}
	}
	result=0;
	count=1;
	for(int i=0;i<index;i++){
		count*=2;
	}
	for(int i=index;i<ml;i++){
		if(a[i]==1){
			result+=count;
		}
		count*=2;
	}
	
	printf("%d",result);
	
}
