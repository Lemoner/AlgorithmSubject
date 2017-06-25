#include<stdio.h>

int a[101][101];
int b[101];
int c[101];
int n,m,sum=0;

int minA(int k,int flag){//1是行，-1是列 
	
	int min=999;
	
	if(flag==1){
		for(int i=0;i<m;i++){
			if(a[k][i]<min){
				min=a[k][i];
			}
		}
	} 
	else{
		for(int i=0;i<n;i++){
			if(a[i][k]<min){
				min=a[i][k];
			}
		}
	}
	
	return min;
	
}

void clearA(int k,int flag,int count){

	if(flag==1){
		for(int i=0;i<m;i++){
			a[k][i]-=count;
		}
		b[k]=count;
		sum+=count;
	} 
	else{
		for(int i=0;i<n;i++){
			a[i][k]-=count;
		}
		c[k]=count;
		sum+=count;
	}
	
}

int judgeA(){
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			if(a[i][j]!=0){
				return 0;
			}
		}
	}
	return 1;
}


void printA(){
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			printf("%d ",a[i][j]);
		}
		printf("\n");
	}
	printf("\n");
}

int main(void)
{
	
	scanf("%d%d",&n,&m);
	
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			scanf("%d",&a[i][j]);
		}
	}
	
	if(n<=m){
		for(int i=0;i<n;i++){
			
			clearA(i,1,minA(i,1));
			
		}
		
		for(int i=0;i<m;i++){
			
			clearA(i,-1,minA(i,-1));
			
		}
	} 
	else{
		
		for(int i=0;i<m;i++){
			
			clearA(i,-1,minA(i,-1));
			
		}	
		for(int i=0;i<n;i++){
			
			clearA(i,1,minA(i,1));
			
		}
	}
	
	
	if(judgeA()==1){
		printf("%d\n",sum);
		for(int i=0;i<n;i++){
			for(int j=0;j<b[i];j++){
				printf("row %d\n",(i+1));
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<c[i];j++){
				printf("col %d\n",(i+1));
			}
		}
	}
	else{
		printf("-1\n");
	}
	
	return 0;
	
}
