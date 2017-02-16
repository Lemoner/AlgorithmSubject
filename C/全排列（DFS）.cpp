#include<stdio.h>
int a[10],flag[10];
int sum=0;
void DFS(int start,int n)//对1~n进行全排列   
{  
     int i;  
     if(start>n) {
     	for(int j=1;j<=n;j++)
     	printf("%d ",a[j]);
     	sum++;
     	printf("\n");
     } 
     else  
     {  
         for(i=1;i<=n;i++)  
         {  
            if(flag[i])   
            continue;    
            a[start]=i;    
            flag[i]=1;    
            DFS(start+1,n);//选择好一位开始选下一位   
            flag[i]=0;  
         }  
     }  
} 
int main()
{
	int n;
	scanf("%d",&n);
	DFS(1,n);
	printf("%d",sum);
	return 0;
}
