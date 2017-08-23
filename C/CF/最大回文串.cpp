#include <iostream>  
#include <cstring>  
using namespace std;

int main(void)
{
	
	int len,x,y,maxlen,maxx,maxy;
	char s[1000000];
	
	cin>>s;
	
	len=strlen(s);
	maxlen=0;
	maxx=0;
	maxy=0;
	
	for(int i=0;i<len;i++){
		
		x=i;
		y=i;
		
		while(x>=0&&y<len){
			
			if(s[x]==s[y]){
				x--;
				y++;
			}
			else{
				break;
			}
			
		}
		
		x++;
		y--;
		
		if(x!=y){
			if(y-x+1>maxlen){
				maxx=x;
				maxy=y;
			}
		}
		
	}
	
	for(int i=maxx;i<=maxy;i++){
		cout<<s[i];
	}
	
}
