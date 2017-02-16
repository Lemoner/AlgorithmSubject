#include<stdio.h>
#include<math.h>
int n;
int sum=0;
//int count=0;
int x[10],y[10];
int a[10][10];
int Place (int k) { // 检查在第k行上第x[k]列放置皇后的可行性
 int j;
  for (j=0; j<k; j++)
       if ((fabs(j-k)==fabs(x[j]-x[k])) || (x[j]==x[k])) return 0;
  return 1;
} 
int Place1 (int k) { // 检查在第k行上第y[k]列放置皇后的可行性
 int j;
  for (j=0; j<k; j++)
       if ((fabs(j-k)==fabs(y[j]-y[k])) || (y[j]==y[k])) return 0;
  return 1;
} 
void Backtrack1(int t) 
{
	int i;
    if (t == n) {sum++;/*for (int j=0; j<n; j++)printf("%d %d ",x[j],j );printf("\n" );*/
	} // sum记录当前已找到的可行性方案数
    else  for (i=0; i<n; i++) { 
               y[t] = i; 
			   if(a[t][i]==1){
			   	if (Place1(t)){
				   Backtrack1(t+1);
               }
			   } 
                 
     }
}
void Backtrack(int t) 
{
	int i;
    if (t >= n) {/*count++;sum++;for (int j=0; j<n; j++)printf("%d %d ",x[j],j );printf("\n" );*/
	Backtrack1(0);
	}
	 // sum记录当前已找到的可行性方案数
    else {
     for (i=0; i<n; i++) { 
               x[t] = i; 
			   if(a[t][x[t]]==1){
			   	if (Place(t)){
				   a[t][x[t]]=0;
				   Backtrack(t+1);
				   a[t][i]=1;
               }
			   } 
                 
     }}
}

int main(void)
{
int i,j;	
	scanf("%d",&n);
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			scanf("%d",&a[i][j]);
		}
	} 
	Backtrack(0);
//	printf("%d\n",count);
	printf("%d",sum);
	return 0;
} 
