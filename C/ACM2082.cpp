//#include<stdio.h>
//__int64 count;
//int a[27]={0};
//
//void fun(int sum,int index){
//	if(sum<=50){
//		if(index==0&&sum>0){
//			count++;
//		}
//		if(index!=0){
//			while(a[index]==0){
//				index--;
//			}
//			for(int i=0;i<=a[index]&&sum+i*index<=50;i++){
//				sum+=i*index;
//				index--;
//				fun(sum,index);
//				index++;
//				sum-=i*index;
//			}
//		}
//	}
//}
//
//int main(void){
//	int n,sum;
//	scanf("%d",&n);
//	while(n--){
//		for(int i=1;i<=26;i++){
//			scanf("%d",&a[i]);
//		}
//		sum=0;
//		count=0;
//		fun(0,26);
//		printf("%I64d\n",count);
//	}
//	return 0;
//}
#include<stdio.h>
#include<string.h>
int main(void)
{
	int a[27],d[51],m[51];
	int n,sum;
	scanf("%d",&n);
	while(n--){
		a[0]=0;
		for(int i=1;i<27;i++){
			scanf("%d",&a[i]);
		}
		memset(d,0,sizeof(d));
		memset(m,0,sizeof(m));
		for(int i=0;i<=a[1];i++){
			m[i]=1;
		}
		for(int i=2;i<27;i++){
			for(int j=0;j<51;j++){
				for(int k=0;k+j<51&&k<=i*a[i];k+=i){
					d[k+j]+=m[j];
				}
			}
			for(int k=0;k<51;k++){
				m[k]=d[k];
				d[k]=0;
			}
		}
		sum=0;
		for(int i=1;i<51;i++){
			sum+=m[i];
		}
		printf("%d\n",sum);
	}
	return 0;
}

