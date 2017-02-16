#include<iostream>  
using namespace std;  
bool check(int *a,int num)  //用于检验a[num]时候与前面的元素是否有相同的值   
{  
    for(int i=num-1;i>=0;i--)  
    {  
        if(a[i]==a[num])return 0;  
    }   
    return true;  
}  
bool final_check(int *a)    //用于检验是否所有直线上的和相等  
{  
    int r1 = a[2]+a[3]+a[4]+a[5];  
    int r2 = a[8]+a[9]+a[10]+a[11];  
    int r3 = a[1]+a[3]+a[6]+a[8];  
    int r4 = a[1]+a[4]+a[7]+a[11];  
    int r5 = a[5]+a[7]+a[10]+a[12];  
    int r6 = a[2]+a[6]+a[9]+a[12];   
    if(r1==r2&&r2==r3&&r3==r4&&r4==r5&&r5==r6)  
        return 1;  
    else  
        return 0;   
}   
//void show(int *a)  
//{  
//  int i=1;  
//  while(i<13)cout<<a[i++]<<" ";  
//  cout<<endl;  
//}  
void fun(int a[],int num)  
{  
    if(num==12)  
    {  
        a[num] = 3;  
        if(final_check(a)){
		//show(a); 
		for(int i=1;i<13;i++) 
            cout<<a[i]<<endl;  
        }  
            
        return;  
    }  
    for(int i=2;i<13;i++)  
    {  
        a[num] = i;  
        if(check(a,num))  
        {  
            fun(a,num+1);  
        }     
    }  
}  
int main()  
{  
    int a[13]={3,1,8};  
    fun(a,3);  
    return 0;  
}  
