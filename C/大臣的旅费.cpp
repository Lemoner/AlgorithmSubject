#include<stdio.h>
int a[10005][10005];
int n;
int max1=0;
int max2=0;
void MAX1(int i,int maxsum)
{
	int k;
	int t;
	t=maxsum;
	for(k=1;k<=n;k++){
		maxsum=t;
		if(a[i][k]!=0){
			maxsum+=a[i][k];			
			a[i][k]=0;
			a[k][i]=0;
			MAX1(k,maxsum);
		}
	}
	if(k>n){
		if(maxsum>max1)
		max1=maxsum;
	}
}
void MAX2(int i,int maxsum)
{
	int k;
	int t;
	t=maxsum;
	for(k=1;k<=n;k++){
		maxsum=t;
		if(a[i][k]!=0){
			maxsum+=a[i][k];			
			a[i][k]=0;
			a[k][i]=0;
			MAX2(k,maxsum);
		}
	}
	if(k>n){
		if(maxsum>max2)
		max2=maxsum;
	}
}
int main()
{
	int i,j,k,d,maxd,maxi,maxj,max,sum,x;
	scanf("%d",&n);
	maxd=0;
	for(k=1;k<n;k++){
		scanf("%d%d%d",&i,&j,&d);
		a[i][j]=d;
		a[j][i]=d;
		if(maxd<d){
			maxd=d;
			maxi=i;
			maxj=j;
		}
	}
	a[maxi][maxj]=0;
	a[maxj][maxi]=0;
	MAX1(maxi,0);
	MAX2(maxj,0);
	max=max1+max2+maxd;
//	printf("%d %d %d %d\n",max,max1,max2,maxd);
	sum=0;
	x=11;
	while(max){
		sum+=x;
		x++;
		max--;
	}
	printf("%d",sum);
	return 0;		
}
