/*
数组实现josephus problem 
*/ 

#include<iostream>
#include<fstream>
#include<list>//列表,link,链表 
using namespace std;
class CJose{
	pulic:
		int id;
		string name;
		CJose(int i,string n):id(i),name(n){
		}
};
int main(void){
	list<CJose> vi;
    int n=0;
    int k=3,c=0,i=0,ii=0;
	

//	int a[n]={0};
		ifstream ifs("jose5.dat");
		ofstream ofs("jose1.txt");
		ifs>>n;
		int tmp;string strname;
		while(ifs>>tmp>>strname)
		vi.push_back(CJose(tmp,strname));
		list<CJose>::iterator iter;//迭代器 
	for(iter=vi.begin();iter!=vi.end();++iter)
	cout<<*iter->id<<" "<<iter->name<<endl;
	iter=vi.begin();	
	while(c<n){
//整个游戏结束：josephus投降 
		ii=0;
		for(;ii<k-1;ii++){
		//	j=j%n;
		++iter;
		if(iter==vi.end()) iter=vi.begin();
		//	if(a[j]!=0)
				c++;
		}
	//	cout<<a[j-1]<<" ";
	    cout<<*iter<<" ";
		ofs<<*iter<<" ";
		iter=vi.erase(iter);
		if(iter==vi.end())
		iter=vi.begin();
		//a[j-1]=0;//游戏进行中：杀人 
		
		kill++;
	}
			
	return 0;
} 

