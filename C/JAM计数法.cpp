#include<iostream>
using namespace std;
int main(void)
{
	int i,s,t,w,count=0;
	string str,str1;
	cin>>s>>t>>w;
	cin>>str;
	str1=str;
	for(int i=0;i<w;i++){
		str1[i]='a'+t-w+i;
	}
	cout<<str1<<endl;
	while(count<5){
		if(str==str1)
		break;
		for(i=1;i<=w;i++){
			if(str[w-i]-'a'<t-i)
			break;
		}
		int k=w-i;
		str[k]++;
		int co=1;
		for(int j=k+1;j<w;j++){
			str[j]=str[k]+co;
			co++;
		}
		cout<<str<<endl;
		count++;
	}
	return 0;
} 
