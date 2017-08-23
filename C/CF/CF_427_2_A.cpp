#include <map>  
#include <iostream>  
using namespace std;

int main(void)
{
	
	int s,v1,v2,t1,t2,r1,r2;
	
	cin>>s>>v1>>v2>>t1>>t2;
	
	r1=t1+s*v1+t1;
	r2=t2+s*v2+t2;
	
	if(r1<r2){
		cout<<"First";
	}
	else if(r1==r2){
		cout<<"Friendship";
	}
	else{
		cout<<"Second";
	}
	
}
