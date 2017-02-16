#include<stdio.h>
int main(void)
{
	int a,b,c,d,e,num=0;
	for(a=1;a<=9;a++){
		for(b=1;b<=9;b++){
			if(a==b)continue;
			for(c=1;c<=9;c++){
				if(a==c||b==c)continue;
				for(d=1;d<=9;d++){
					if(a==d||b==d||c==d)continue;
					for(e=1;e<=9;e++){
						if(a==e||b==e||c==e||d==e)continue;
						if((a*10+b)*(c*100+d*10+e)==(a*100+d*10+b)*(c*10+e))
						num++;
					}
				}
			}
		}
	}
	printf("%d",num);
	return 0;
} 
