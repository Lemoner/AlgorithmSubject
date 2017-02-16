#include<iostream>
using namespace std;
void Swap(int *a,int *b){
	int t;
	t=*a;
	*a=*b;
	*b=t;
}
int main(void)
{
	int a[20];
	int n;
	cin>>n;
	for(int i=1;i<=n;i++){
		cin>>a[i];
		int t=i;
		while((a[t]>a[t/2])&&(t>1)){
			Swap(&a[t],&a[t/2]);
			t=t/2;
		}
	}
	for(int i=1;i<=n;i++){
		cout<<a[i]<<" ";
	}
	cout<<endl;
	int t=n;
	while(t>1){
		Swap(&a[1],&a[t]);
		int i=1;
		while(true){
			int x=2*i,y=2*i+1;
			if(a[i]<a[x]&&x<t&&y>=t){
				Swap(&a[i],&a[x]);
				i=x;
			}
			else if(a[i]<a[x]&&a[x]>=a[y]&&y<t){
				Swap(&a[i],&a[x]);
				i=x;
			}
			else if(a[i]<a[y]&&a[y]>a[x]&&y<t){
				Swap(&a[i],&a[y]);
				i=y;
			}
			else{
				break;
			}
		}
		t--;
//打印每次取出最大数后的状态 
//		for(int j=1;j<=n;j++){
//		cout<<a[j]<<" ";
//		}
//		cout<<endl;
	}
	for(int i=1;i<=n;i++){
		cout<<a[i]<<" ";
	}
	return 0;
}
