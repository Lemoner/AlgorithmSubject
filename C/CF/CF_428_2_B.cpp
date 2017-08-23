#include <iostream>   
using namespace std;

int main(void)
{
	
	int n,k,t,s1,s2,s4,k;
	
	cin>>n>>k;
	
	s1=0;
	s2=2*n;
	s4=n;
	
	while(k--){
		
		cin>>t;
		
		if(t>2){
			k=t/4;
			if(s4>=k){
				s4-=k;
				t-=4*k;
			}
			else{
				t-=4*s4;
				s4=0;
			}
		}
		if(t>1){
			k=t/2;
			if(s2>=k){
				s2-=k;
				t-=2*k;
			}
			else{
				t-=2*s2;
				s2=0;
			}
		} 
		if(t>0){
			while(s2>0&&t>1){
				t-=2;
				s2--;
			}
		}
		
		
	}
	
}
