
#include <stdio.h> 

int T[11], Coins[11], n;
//T[i]:硬币面值，Conis[i]:硬币个数，n:硬币总个数
int c[11][40];
#define Maxint 1000000

int coin(int n,int m)
{
	for(int j=0; j<=m; j++){
		if (j%T[n]==0 && j/T[n] <= Coins[n]) c[n][j]=j/T[n];
		else c[n][j] = Maxint;
	}
	
	for (int i=n-1;i>=1;i--)
	{
		for (int j=0;j<=m;j++)
		{
			if (T[i]<=j)
			{
				c[i][j] = c[i+1][j];  // k=0
				int minnum = (j/T[i]<=Coins[i]?j/T[i]:Coins[i]);
				for(int k=1; k<=minnum; k++)
					if (k + c[i+1][j-k*T[i]] < c[i][j])
						c[i][j] = k + c[i+1][j-k*T[i]];
			}
			else
				c[i][j]=c[i+1][j]; //剩余容量不够
		}
	}
	return c[1][m];//返回最小值
}

void printOptimalSolution(int n, int m){
	
	int x[12];
	for(int i =1; i<=n; i++)
	{
		if (c[i][m]==c[i+1][m]) x[i]=0;
		else 
		{
			for(int k=1; k<=Coins[i]; k++) 
				if (c[i][m]==c[i+1][m-k*T[i]]+k) 
				{
					x[i]=k; m = m-k*T[i]; break;
				}
		}
	}
	
    for(int i =1; i<=n; i++) printf("%3d",x[i]);
}

int main( )
{
	int i, m;  
		printf("输入硬币种类数: ");
		scanf("%d", &n);        
		
		for ( i = 1; i <= n; i++ )
		{
			printf("输入第%d种硬币面值: ", i);
			scanf("%d", &T[i]); 
			printf("输入第%d种硬币个数: ", i);
			scanf("%d", &Coins[i]);
		}
		printf("输入钱数: ");
		scanf("%d",&m); 
	

	int result = coin(n,m);
	
	if ( result != 0 )  
	{
		printf("%d\n", result);
	}
	else
	{
		printf("-1\n");
	}
	
	
	printOptimalSolution(n,m);
	
	return 0;  
}

