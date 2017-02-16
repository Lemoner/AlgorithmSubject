#include<stdio.h>
int main(void)
{
	int n,ah,am,as,bh,bm,bs;
	scanf("%d",&n);
	while(n--){
		scanf("%d%d%d%d%d%d",&ah,&am,&as,&bh,&bm,&bs);
		ah+=bh;
		am+=bm;
		as+=bs;
		if(as>59){
			am+=as/60;
			as=as%60;
		}
		if(am>59){
			ah+=am/60;
			am=am%60;
		}
		printf("%d %d %d\n",ah,am,as);
	}
	return 0;
}
