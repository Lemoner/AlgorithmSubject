#include<iostream>
#include<cstdio>
using namespace std;

int main(void)
{
	
	int m,b;
	__int64 maxsum,sum;
	__int64 x;
	
	cin>>m>>b;
	
	maxsum=0;
	
	for(int y=0;y<=b;y++){
		
		x=m*(b-y);
			
		sum=(x+1)*(y+1)*(x+y)/2;
		if(sum>maxsum){
			maxsum=sum;
		}
		
	}
	
	cout<<maxsum;
	
}
