#include<iostream>
#include<cstdio>
using namespace std;

int main(void)
{
	int n,x;
//	scanf("%d%d",&n,&x);
	cin>>n>>x;
	
	int l[200000];
	int r[200000];
	int cost[200000];
	int duration[1];
	
	
	for(int i=1;i<=n;i++){
		scanf("%d%d%d",&l[0],&r[0],&cost[0]);
		duration[0]=r[0]-l[0]+1;
		
		int k=i;
		while(k>0){
			if(duration[k-1]>duration[0]){
				
				l[k]=l[k-1];
				r[k]=r[k-1];
				cost[k]=cost[k-1];
				duration[k]=duration[k-1];
				
			}
			else{
				break;
			}
			k--;
		}
		l[k]=l[0];
		r[k]=r[0];
		cost[k]=cost[0];
		duration[k]=duration[0];
		
	}
	
	int p,q,qflag,qindex,costs,costsum;
	p=1;
	q=n;
	costsum=999999;
	qflag=0;
	
	
	while(p<q){
		
		while(p<q&&duration[p]+duration[q]>=x){
			if(duration[p]+duration[q]==x){
				break;
			}
			q--;
		}
		
		if(p>=q){
			break;
		}
		
		if(duration[p]+duration[q]==x&&(r[p]<l[q]||l[p]>r[q])){
			costs=cost[p]+cost[q];
			if(costs<costsum){
				costsum=costs;
			}
		}
		
		if(qflag==0){
			qindex=q;
		}
		
		if(p<q-1&&duration[q-1]==duration[q]){
			
			q--;
			qflag=1;
		}
		else{
			if(p+1<q&&duration[p]==duration[p+1]){
				p++;
				q=qindex;	
				qflag=0;
				
			}
			else{
				p++;
				q--;
			}
		}
		
		
	}
	
	if(costsum==999999){
		printf("-1");
	}
	else{
		printf("%d",costsum);
	}
	
	
}
