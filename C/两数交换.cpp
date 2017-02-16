 #include<iostream>
 using namespace std;
 void Swap(int *a,int *b){
 	int t;
 	t=*a;
 	*a=*b;
 	*b=t;
 }
 int main(){
 	int a,b;
 	cin>>a>>b;
	cout<<a<<" "<<b<<endl;
	Swap(&a,&b);
	cout<<a<<" "<<b<<endl;
	//Òì»ò½»»»
	a=a+b;
	b=a-b;
	a=a-b;
	cout<<a<<" "<<b<<endl;
	//^·ûºÅ
	a=a^b;
	b=a^b;
	a=a^b;
//	a^=b^=a;
//	b^=a;
	cout<<a<<" "<<b<<endl;
	return 0; 
 }
