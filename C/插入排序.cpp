#include<iostream>
#include<algorithm>
using namespace std;
void Swap(int *a,int *b){
	int temp;
	temp=*a;
	*a=*b;
	*b=temp;
}
void InsertionSort(int a[],int n){
//	int x=1;
//	while(x<n){
//		int t=x;
//		while(t>0){
//			if(a[t]>=a[t-1])
//			break;
//			Swap(&a[t],&a[t-1]);
//			t--;
//		}
//		x++;
//	}
	for(int i=1;i<n;i++){
		int j=i;
		while(j>0&&a[j]<a[j-1]){
			Swap(&a[j],&a[j-1]);
			j--;
		}
	}
}
int main(void)
{
	int n=0;
	int a[100];
	while(cin>>a[n]){
		n++;
		if(getchar()=='\n'){
			break;
		}
	}
	InsertionSort(a,n);
	cout<<n<<endl; 
	for(int i=0;i<n;i++){
		cout<<a[i]<<" ";
	}
	return 0;
	
} 
