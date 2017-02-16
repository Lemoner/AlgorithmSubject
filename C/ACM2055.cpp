#include<stdio.h>
int main(void)
{
	int t,y;
	char x;
	scanf("%d%*c",&t);
	while(t--){
		scanf("%c%d%*c",&x,&y);
		if(x-'a'<0){
			printf("%d\n",y+x-'A'+1);
		}
		else{
			printf("%d\n",y-x+'a'-1);
		}
	}
	return 0;
}

