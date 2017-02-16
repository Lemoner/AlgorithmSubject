#include<stdio.h>
#include<string.h>
char a[1001],b[1001],c[1002];
int t,n;
int main(void)
{
	scanf("%d",&n);
	for(t=1;t<=n;t++){
		scanf("%s%s",a,b);
		printf("Case %d:\n",t);
		printf("%s + %s = ",a,b);
		int i,t,len_a,len_b;
	len_a=strlen(a)-1;
	len_b=strlen(b)-1;
	i=0;
	t=0;
	while(len_a>=0||len_b>=0){
		if(len_a>=0&&len_b>=0){
			c[i]=a[len_a--]+b[len_b--]-'0'+t;
		}
		else if(len_a>=0){
			c[i]=a[len_a--]+t;
		}else if(len_b>=0){
			c[i]=b[len_b--]+t;
		}
		if(c[i]>'9'){
			t=1;
			c[i]-=10;
		}
		else{
			t=0;
		}
		i++;
	}
	if(t==1){
		c[i]='0'+t;
		i++;
	}
	for(int j=i-1;j>=0;j--){
		printf("%c",c[j]);
	} 
	if(t!=n){
		printf("\n\n");
	}
}
	}

