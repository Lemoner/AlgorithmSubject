#include<iostream>
#include<algorithm>
using namespace std;
int main(void) 
{
	int a[13];

	a[1]=1;a[2]=8;a[12]=3;
	a[3]=2;a[4]=4;a[5]=5;a[6]=6;a[7]=7;a[8]=9;a[9]=10;a[10]=11;a[11]=12;
	//sort(a+3,a+12);
	do{
	
		int r1 = a[2]+a[3]+a[4]+a[5];  
    int r2 = a[8]+a[9]+a[10]+a[11];  
    int r3 = a[1]+a[3]+a[6]+a[8];  
    int r4 = a[1]+a[4]+a[7]+a[11];  
    int r5 = a[5]+a[7]+a[10]+a[12];  
    int r6 = a[2]+a[6]+a[9]+a[12];  	/*for(int i=3;i<12;i++)
		printf("%d",a[i]);
	//	cout<<a[i];
		printf("\n");*/ 
    if(r1==r2&&r2==r3&&r3==r4&&r4==r5&&r5==r6) for(int i=1;i<13;i++) 
		cout<<a[i]<<endl;
	}while(next_permutation(a+3,a+12));
	return 0;
}
