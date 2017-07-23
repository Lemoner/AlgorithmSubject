#include <stdio.h>
#include <string.h>
#include <iostream>
using namespace std;

int main(void)
{
	int n,m,minx,miny,maxx,maxy,count,x;
	char c;
	
	minx=999;
	miny=999;
	maxx=-1;
	maxy=-1;
	count=0;
	
	cin>>n>>m;
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			cin>>c;
			if(c=='B'){
				
				minx=min(minx,i);
				miny=min(miny,j);
				maxx=max(maxx,i);
				maxy=max(maxy,j);
				
				count++;
				
			}
		}
	}
	
	if(minx==999){
		cout<<1;
	}
	else{
		x=max(maxx-minx,maxy-miny)+1;
		if(x>min(n,m)){
			cout<<-1;
		}
		else{
			cout<<x*x-count;
		}
	}

}
