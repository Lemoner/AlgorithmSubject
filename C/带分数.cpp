#include<stdio.h>
int a[10],flag[10];
int n,count=0;
int Sum(int start,int end)
{
	int i,sum=0;
	for(i=start+1;i<=end;i++)
	sum=sum*10+a[i];
	return sum;
}
void Found(int end)
{
	int a,b,c,i,j;
	for(i=1;i<end-2;i++){
		a=Sum(0,i);
		if(a>n)
		return ;
		for(j=(end-i)/2+i;j<end-1;j++){
			b=Sum(i,j);
			c=Sum(j,end-1);
			if(b%c==0&&n==a+b/c){
				//printf("%d=%d+%d/%d\n",n,a,b,c);
				count++;
			}
		}
	}
}
void DFS(int start,int end)//对1~n-1进行全排列   
{  
     int i;  
     if(start==end) {
     	Found(end);
     } 
     else  
     {  
         for(i=1;i<end;i++)  
         {  
            if(flag[i])   
            continue;    
            a[start]=i;    
            flag[i]=1;    
            DFS(start+1,end);//选择好一位开始选下一位   
            flag[i]=0;  
         }  
     }  
} 
int main()
{
	scanf("%d",&n);
	DFS(1,10);
	printf("%d",count);
	return 0;
}
