#include <iostream>
using namespace std;
int main()
{
	int n, k;
	int sum=0;	  //��¼���͵Ĵ���
	int d=0;		//��¼�ϴμ���֮���Ѿ��߹���·��
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
