#include <iostream>  
#include <cstring>  
#include <algorithm>   
using namespace std;

typedef long long ll;  
const int maxn= 100001; 

int n,q,c;
int x[maxn];
int y[maxn];
int s[maxn];

int IsIn(int x,int y,int x1,int y1,int x2,int y2)
{
	
	if(x>=x1&&y>=y1&&x<=x2&&y<=y2){
		return 1;
	}
	else{
		return 0;
	}
	
}

int main(void)
{
	int x1,x2,y1,y2;
	ll t,sum;
	
	cin>>n>>q>>c;
	
	for(int i=0;i<n;i++){
		cin>>x[i]>>y[i]>>s[i];
	}
	
	for(int p=0;p<q;p++){
		
		cin>>t>>x1>>y1>>x2>>y2;
		
		sum=0;
		
		for(int i=0;i<n;i++){
			
			if(IsIn(x[i],y[i],x1,y1,x2,y2)){
				
				t=t%(c+1);
				sum+=(s[i]+t)%(c+1);
				
			}
			
		}
		
		cout<<sum<<endl;
		
	}
	
}
