#include <iostream>  
#include <cstring>  
using namespace std;

int flag=1;
int MAX= 10024;

void printfS(char s[]){
	if(flag!=1){
		cout<<",";
	}
	for(int i=0;i<strlen(s);i++){
		cout<<s[i];
	}
	flag=0;
} 

void DFS(char s[], int index, char c, char change){
	if(index==strlen(s)){
		printfS(s);
		return ;
	}
	else{
		if(s[index]==c){
			if(c<change){
				DFS(s, index+1, c, change);
				s[index]=change;
				DFS(s,index+1,c,change);
				s[index]=c;
			}
			else{
				s[index]=change;
				DFS(s,index+1,c,change);
				s[index]=c;
				DFS(s, index+1, c, change);
			}
		}
		else{
			DFS(s, index+1, c, change);
		}
	}
}


int main(void){
	
	char s[MAX],c,change;
	
	cin>>s>>c>>change;
	
	DFS(s, 0, c, change);
	
}
