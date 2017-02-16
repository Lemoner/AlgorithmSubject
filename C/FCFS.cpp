#include <stdio.h>
#define N 100   
struct node{
 char name;
 int arrive;   
 int service;  
 int end; 
 int zhou;
 double quan;   
}a[N];
void SORT(struct node a[],int n){
	int i,j,min;
	struct node temp;
	for(i=0;i<n;i++){
	min=i; 
		for(j=i;j<n;j++){
			if(a[min].arrive>a[j].arrive)
			min=j;
			if(a[min].arrive==a[j].arrive){
				if(a[min].service>a[j].service)
				min=j;
			}
		}
		temp=a[i];
		a[i]=a[min];
		a[min]=temp;
	} 
}
void PRINTF(struct node a[],int n){
	int i;
	printf("进程名\t到达时间\t服务时间\t完成时间\t周转时间\t带权周转时间\n");
for(i=0;i<n;i++){
printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",&a[i].name,a[i].arrive,a[i].service,a[i].end,a[i].zhou,a[i].quan);
}
}
void FCFS(struct node a[],int n){
int i,h;
h=0;
for(i=0;i<n;i++){
a[i].end=a[i].service+h;
a[i].zhou=a[i].end-a[i].arrive;
a[i].quan=a[i].zhou*1.0/a[i].service;
h=a[i].end;
}
PRINTF(a,n);
}

void SJF(struct node a[],int n){
int i,h,max,count=1;
int b[100];
for(i=0;i<n;i++)
b[i]=0;
a[0].end=a[0].service;
a[0].zhou=a[0].end-a[0].arrive;
a[0].quan=a[0].zhou*1.0/a[0].service;
h=a[0].end;

while(count<n){
	max=1;while(b[max]==1)max++;
for(i=max;i<n;i++){
if((a[max].service>a[i].service)&&(b[i]!=1))
max=i;

}
b[max]=1;
a[max].end=a[max].service+h;
a[max].zhou=a[max].end-a[max].arrive;
a[max].quan=a[max].zhou*1.0/a[max].service;
h=a[max].end;
count++;
}
PRINTF(a,n);
}


int main(void)
{
int i,n;
printf("输入进程数：");
scanf("%d",&n);
printf("进程名 到达时间 服务时间 ：\n");
    for(i=0;i<n;i++){
scanf("%s %d %d",&a[i].name,&a[i].arrive,&a[i].service);
}
SORT(a,n);
FCFS(a,n);
SJF(a,n);
return 0;
}
