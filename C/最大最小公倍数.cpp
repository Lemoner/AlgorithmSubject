#include<iostream>
using namespace std; 
int main(void)
{
    long long n,a,b,t;
    cin>>n;
    if(n%2==0){
        a=n;
        b=n-3;
        do{
            t=a%b;
            a=b;
            b=t;
        } while(t>1);
        if(t==1){
        	cout<<n*(n-1)*(n-3);    
		}
		else{
		cout<<(n-1)*(n-2)*(n-3);
		}
    }
    else{
        cout<<n*(n-1)*(n-2);
    }
    return 0;
} 
