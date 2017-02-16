#include<iostream>
#include<vector>
using namespace std;
int main()
{
	int i;
	vector<int> v(10);
	vector<int>::iterator x;
	vector<int>::iterator y;
	vector<int>::iterator z;
	for(i=0;i<10;i++)
	v[i]=i+1;
	x=v.begin();
	cout<<*x<<endl;
	cout<<v.front()<<endl;
	cout<<v.back()<<endl;
	for(i=0;i<10;i++)
	cout<<v[i]<<endl;
	for(i=0;i<10;i++)
	cout<<v.at(i)<<endl;
	x=v.begin();
	z=x+3;
	v.erase(z);
	z=x+6;
	v.erase(z);
	y=v.begin();
	for(y=v.begin();y!=v.end();y++)
	cout<<*y<<endl;
	return 0;
	
}
