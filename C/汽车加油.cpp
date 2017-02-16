#include <iostream>
using namespace std;
int main()
{
	int n, k;
	int sum=0;	  //记录加油的次数
	int d=0;		//记录上次加油之后已经走过的路程
	cin>>n>>k;
	int a[20]; 
	for ( int i = 0; i < k+1; i++ )
	{
		cin>>a[i];
	}
	for ( int i = 0; i < k+1; i++ )
	{
		if ( a[i] > n )
		{
			cout<<"NO"<<endl;
		}
		if ( d+a[i] > n )
		{
			sum++;
			d = a[i];
		}
		else
		{
			d = d + a[i];
		}
	}
	cout<<sum<<endl;
	return 0;
}
