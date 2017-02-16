#include<iostream>
using namespace std;
void Swap(int *a,int *b){
	int temp;
	temp=*a;
	*a=*b;
	*b=temp;
}
void ShellSort(int a[],int n){
	for(int d=n/2;d>0;d=d/2){
		for(int i=d;i<n;i++){
			int j=i;
			while(j>=d&&a[j]<a[j-d]){
				Swap(&a[j],&a[j-d]);
				j=j-d;
			}
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
	ShellSort(a,n);
	cout<<n<<endl; 
	for(int i=0;i<n;i++){
		cout<<a[i]<<" ";
	}
	return 0;
}
