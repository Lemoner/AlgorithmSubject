#include<iostream>
#include<string>
using namespace std;
int main(void)
{
	string str;
	cin>>str;
	int k=str.length();
	for(int i=0;i<k;i++){
		if(str[i]>='a'&&str[i]<='z')
		str[i]-=32;
		else
		str[i]+=32;
	}
	cout<<str;
	return 0;
} 
