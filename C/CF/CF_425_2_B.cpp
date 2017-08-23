#include <cstdio>  
#include <iostream>  
#include <cstring>  
using namespace std;

const int MAX= 100001;  

char goodstr[26] ;
char patternstr[MAX];
char querystr[MAX];

int n,flag,flagnum,result,plength,qlength,pindex,qindex;
int good[26]={0};


int main(void)
{
	
	cin>>goodstr;
	
	for(int i=0;i<strlen(goodstr);i++){
		good[goodstr[i]-'a']=1;
	}
	
	cin>>patternstr;
	plength=strlen(patternstr);
	flag=0;
	for(int i=0;i<plength;i++){
		if(patternstr[i]=='*'){
			flag=1;
			break;
		}
	}
	
	cin>>n;
	
	while(n--){
		
		cin>>querystr;
		qlength=strlen(querystr);
		
		if(flag==0){
			if(plength!=qlength){
				cout<<"NO"<<endl;
				continue;
			}
		}
		else if(flag==1){
			if(plength-1>qlength){
				cout<<"NO"<<endl;
				continue;	
			}
			flagnum=qlength-plength+1;
		}
		
		pindex=0;
		qindex=0;
		
		result=1;
		
		while(pindex<plength&&qindex<qlength){
			
			if(patternstr[pindex]=='?'){
				if(good[querystr[qindex]-'a']!=1){
					result=0;
					break;
				}	
			}
			else if(patternstr[pindex]=='*'){
				
				int t=1;
				
				for(int i=0;i<flagnum;i++){
					if(good[querystr[qindex]-'a']==1){
						t=0;
						break;
					}
					qindex++;
				}
				
				if(t==0){
					result=0;
					break;
				}
				
				qindex--;
			}
			else{
				if(patternstr[pindex]!=querystr[qindex]){
					result=0;
					break;
				}
			}
			
			pindex++;
			qindex++;
			
		}
		
		if(result==1){
			cout<<"YES"<<endl;
		}
		else{
			cout<<"NO"<<endl;
		}
		
	}
	
}
