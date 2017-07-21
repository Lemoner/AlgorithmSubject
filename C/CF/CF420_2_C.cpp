#include <stdio.h>
#include <string.h>
#include <iostream>
#include <vector>
using namespace std;

int main(void)
{
	
	int n,number,sum,x;
	char str[10];
	vector<int>p;
	
	scanf("%d",&n);
	
	sum=0;
	x=1;
	
	for(int i=0;i<2*n;i++){
		
		scanf("%s",str);
		
		if(str[0]=='a'){
			scanf("%d",&number);
			p.push_back(number);
		}
		else{
			
			if(p.empty()){
			}
			else if(p.back()==x){
				p.pop_back();
			}
			else{
				sum++;
				p.clear();
			}
			x++;
		}
		
	}
	
	printf("%d",sum);
	
}
