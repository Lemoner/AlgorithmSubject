 #include<iostream>
using namespace std;
int main(void)
{
	int a[100003];
	int n;
	long long count,sum=0;
	cin>>n;
	for(int i=0;i<n;i++)
	cin>>a[i];
	for(int i=0;i<n;i++){
		count=0;
		for(int j=0;j<i;j++){
			if(a[i]<a[j])
			count++;
		}
		for(int j=i+1;j<n;j++){
			if(a[i]>a[j])
			count++;
		}
		sum+=(1+count)*count/2;
	} 
//    for(int i=0;i<n;i++){
//    	cin>>a[i];
//    	for(int j=0;j<i;j++){
//			if(a[i]<a[j]){
//				b[i]++;
//				b[j]++;
//				sum=sum+b[i]+b[j];
//			}
//		}
//    }
//	
//	for(int i=0;i<n;i++){
//		sum+=(1+b[i])*b[i]/2;
//	} 
	cout<<sum;
	return 0;
} 
