#include<iostream>
using namespace std;
int main(void)
{
	int sum,n;
	int a[10],dp[100],asum[10];//a[]Ǯ������  asum[]Ǯ��ÿ���������   dp[]ÿ��Ǯ����Ҫ����������Ǯ  dp[i]=min{dp[i-a[j]} 
	static int dpsum[100][10];//dpsum[]ÿ��Ǯ������Ҫÿ�������Ǯ������ 
	cin>>sum>>n;
	for(int i=0;i<n;i++){
		cin>>a[i];
	}
	for(int i=0;i<n;i++){
		cin>>asum[i];
	}
	dp[0]=0;
	for(int i=1;i<=sum;i++){
		int minj,mindp=9999;
		for(int j=0;j<n;j++){
			if(a[j]<=i&&dp[i-a[j]]+1<mindp&&dpsum[i-a[j]][j]<asum[j]){
				mindp=dp[i-a[j]]+1;
				minj=j;
			}
		}
		if(mindp<9999){
			dp[i]=mindp;
			for(int k=0;k<n;k++){
			    dpsum[i][k]=dpsum[i-a[minj]][k];
			}
			dpsum[i][minj]++;	
		}
	}
	cout<<dp[sum]<<endl;
	for(int i=0;i<n;i++)
	cout<<dpsum[sum][i]<<" ";
	return 0;
} 
