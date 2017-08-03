#include <cstdio>  
#include <map>  
#include <iostream>  
#include <queue>  
#include <cstring>  
#include <algorithm>   
using namespace std;

#define mst(a,b) memset((a),(b),sizeof(a))  

typedef long long ll;  
const int maxn= 2005;  
const int mod = 20090717;  
const ll INF = 1e15;  
const double eps = 1e-6;  
  
int n,k;  
ll p;  
ll a[maxn];  
ll b[maxn];  
ll dp[maxn][maxn]; 

int main(void)
{
	cin>>n>>k>>p;
	
	for(int i=1;i<=n;i++){
		cin>>a[i];
	}
	
	for(int i=1;i<=k;i++){
		cin>>b[i];
	}
	
	sort(a+1,a+1+n);  
    sort(b+1,b+1+k);  
    mst(dp,0);  
	
	for(int i=1;i<=n;i++){
		for(int j=i;j<=k;j++){
			if(i==j){
				dp[i][j]=max(dp[i-1][j-1],abs(a[i]-b[j])+abs(b[j]-p));
			}
			else{
				dp[i][j]=min(dp[i][j-1],max(dp[i-1][j-1],abs(a[i]-b[j])+abs(b[j]-p)));
			}
		}
	}
	
//	for(int i=1;i<=n;i++){
//		for(int j=i;j<=k;j++){
//			if(i==j){
//				dp[i][j]=dp[i-1][j-1]+abs(a[i]-b[j])+abs(b[j]-p);
//			}
//			else{
//				dp[i][j]=min(dp[i][j-1],dp[i-1][j-1]+abs(a[i]-b[j])+abs(b[j]-p));
//			}
//		}
//	}
	
//	for(int i=0;i<=n;i++){
//		for(int j=0;j<=k;j++){
//			cout<<dp[i][j]<<"  ";
//		}
//		cout<<endl;
//	}

	cout<<dp[n][k];
	
	return 0;
	
}
