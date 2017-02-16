 #include<iostream>
 using namespace std;
 void swap(int *a,int *b){
 	int t;
 	t=*a;
 	*a=*b;
 	*b=t;
 }
 int main(){
 	int a,b,c;
 	cin>>a>>b>>c;
 	if(a<b)
 		swap(&a,&b);
	if(c>a)
 		swap(&a,&c);
	 if(c>b)
 		swap(&b,&c);
	cout<<a<<" "<<b<<" "<<c;
	return 0; 
 }
