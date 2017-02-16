#include<stdio.h>
int main(void)
{
	int d[251]={0};
	int n;
	for(int i=0;i<251;i++){
		for(int c50=0;c50*50<=i;c50++){
			for(int c25=0;c50*50+c25*25<=i;c25++){
				for(int c10=0;c50*50+c25*25+c10*10<=i;c10++){
					for(int c5=0;c50*50+c25*25+c10*10+c5*5<=i;c5++){
						if(i-c50*50-c25*25-c10*10-c5*5+c50+c25+c10+c5<=100){
							d[i]++;
						}
					}
				}
			}
		}
	}
	while(scanf("%d",&n)!=EOF){
		printf("%d\n",d[n]);
	}
	return 0;
}
