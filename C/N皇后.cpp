#include<stdio.h>
#include<math.h>
int n,j;
int sum=0;
int x[10];
int a[10][10];
bool Place (int k) { // ����ڵ�k���ϵ�x[k]�з��ûʺ�Ŀ�����
  for (j=0; j<k; j++)
       if ((fabs(j-k)==fabs(x[j]-x[k])) || (x[j]==x[k])) return false;
  return true;
} 
void Backtrack(int t) 
{
	int i; 
    if (t == n) {sum++;for (int j=0; j<n; j++)printf("%d %d ",x[j],j );printf("\n" );
	}
	 // sum��¼��ǰ���ҵ��Ŀ����Է�����
    else {
     for (i=0; i<n; i++) { 
               x[t] = i; 
			   if(a[t][i]==1){
			   	if (Place(t)){
				   Backtrack(t+1);
               }
			   } 
                 
     }
	}
}

int main(void)
{	
int i;
	scanf("%d",&n);
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			scanf("%d",&a[i][j]);
		}
	} 
	Backtrack(0);
	printf("%d\n",sum);
	return 0;
} 
