#include<iostream>
#include<string>
using namespace std;
char a[80][80]={};
int L;

int fabs(int i,int j){
	for(int n;n<L;n++){
		if(a[i][n]!=a[j][n])
		return 0;
	}
	return 1;
}
int main(void){
	string str;
	
	int x,max=0,count;
	cin>>L;
	cin>>str;
	int k=str.length();
	for(int i=0;i<k-L;i++){
		for(int j=0;j<L;j++){
			a[i][j]=str[i+j];
		}
	}
//	for(int i=0;i<k-L;i++){
//		cout<<a[i]<<endl;
//	}
//	cout<<endl; 
	for(int i=0;i<k-L;i++){
		count=1;
		if(a[i][0]=='*')
		continue;
		for(int j=i+1;j<k-L;j++){
			if(fabs(i,j)){
				count++;
				a[j][0]='*';
			}
		}
		if(count>max){
			max=count;
			x=i;
		}
	}
	cout<<a[x];
	return 0;
}
