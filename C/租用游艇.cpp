#include <iostream>
using namespace std;
int r[200][200];
int n ;
int cal()
{         
	int i, j, k;        
	
	for(i=1;i<=n; i++) r[i][i]=0;  // main diagonal
	
	for( k = 2; k <= n; k++ )   // modified     
	{                
		for( i = 1; i <= n-k+1; i ++ )  // modified              
		{                         
			j = i + k -1 ;  //  modified                      
			for(int p = i+1; p <= j; p++ )                        
			{
			int x,y;
			x= r[i][p];
			y= r[p][j];                        
				int temp = x + y;                                 
				if(r[i][j] > temp )                                        
					r[i][j] = temp;                        
			}	
		}        
	}         
	return r[1][n];
}

int main()
{        
	if(cin>>n)  // modified       
	{                 
		for( int i =1; i < n; i++ )                         
			for( int j =i+1; j <= n;j++ )                                 
				cin>>r[i][j];                 
			cout<<cal()<<endl;    
		for(int i=0;i<=n;i++){
			for(int j=0;j<=n;j++)
		cout<<r[i][j]<<" ";
		cout<<endl;  
		} 
		   
	}         
	return 0;
}

