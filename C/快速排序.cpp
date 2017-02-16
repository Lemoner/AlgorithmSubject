#include <iostream>
using namespace std;
int n;
void Swap(int &a,int &b){
	int x;
	x=a;
	a=b;
	b=x;
}
int Partition(int a[], int p, int r)
{
	int i = p, j = r+1;
	int x = a[p];
	while ( true )
	{
		while ( a[++i]<x && i<r );
		while ( a[--j]>x );
		if ( i>=j ) // error in source code provided by Pang
			break;
		Swap(a[i],a[j]);
//		for (int i = 0; i < n; i++ )
//	cout << a[i] << " ";
//	cout << endl;
	}
	a[p] = a[j];
	a[j] = x;
//	for (int i = 0; i < n; i++ )
//	cout << a[i] << " ";
//	cout << endl;
	return j;
}
void QuickSort(int a[], int p, int r)
{
	if ( p<r )
	{
		int q = Partition(a, p, r);
		QuickSort(a, p, q-1);
		QuickSort(a, q+1, r);
	}
}

int main()
{
	
	int a[20];
	cout << "���ĸ��� n : ";
	cin >> n;
	cout << "������n���� : " << endl;
	for ( int i = 0; i < n; i++ )
	cin >> a[i];
	QuickSort(a, 0, n-1);
	cout << "����������Ϊ : " << endl;
	for (int i = 0; i < n; i++ )
	cout << a[i] << " ";
	cout << endl;
	return 0;
}
