#include <iostream>
#include <fstream>
#define m 4
#define n 4

using namespace std;

int bestx[m+2][n+2],x[m+2][n+2],y[m+2][n+2];
int bestNumber, currentNumber;

void change(int i, int j){
	x[i][j]=1;
	y[i][j]++; y[i-1][j]++; y[i+1][j]++; y[i][j-1]++; y[i][j+1]++;
	currentNumber++;
}

void restore(int i, int j){
	x[i][j]=0;
	y[i][j]--; y[i-1][j]--; y[i+1][j]--; y[i][j-1]--; y[i][j+1]--;
	currentNumber--;
}

void Backtrack(int i, int j)
{
	while (y[i][j]!=0 && i<=m) {  // ֻҪ�ܵ����ӾͿ��Բ����ڱ�
		j++;
		if (j > n) { i++; j=1; }
	}
	
	// ���whileѭ���ڶ�������������
	if (i > m) {  // �ݹ����
		if (bestNumber > currentNumber){
			for(int ii=1; ii<=m; ii++) 
				for (int jj=1; jj<=n; jj++) bestx[ii][jj] = x[ii][jj];
				bestNumber = currentNumber;
		}
		return;
	}
	
	// ���whileѭ����һ����������������y[i][j]==0
	// ��ʱ�ɷ�Ϊ�������ȥ���ǣ�λ��(i+1,j) (i,j),(i,j+1)
    if (i<m){ change(i+1,j); Backtrack(i,j); restore(i+1,j); } // case1
	
	change(i,j); Backtrack(i,j); restore(i,j);  // case2
	
	if (j<n){ change(i,j+1); Backtrack(i,j); restore(i,j+1); } //case3
	
}


void main(void)
{
    bestNumber = m*n;
    currentNumber = 0;
	int i,j;
    
	// �򻯱߽�����
	for(j=0; j<=n+1; j++)		{ y[0][j]=1;  y[n+1][j]=1;}
	for(i=0; i<=m+1; i++)		{ y[i][0]=1;  y[i][m+1]=1;}
	for(int ii=1; ii<=m; ii++)
		for(int jj=1; jj<=n; jj++)
			y[ii][jj]=0;
		
		Backtrack(1,1);
		
		cout << bestNumber << endl;
		for(i=1; i<=m; i++) {
			for (j=1; j<=n; j++) cout<<bestx[i][j]<<"  ";
			cout<<endl;
		}
		cout<<endl;
}
