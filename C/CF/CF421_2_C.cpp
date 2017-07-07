#include<stdio.h>
int main(void)
{
	
	int a,b,index,flag,xsize,xindex,csum,count;
	__int64 l,r;
	int p[25];
	char x[13];
	char c;
	
	scanf("%d%d%I64d%I64d",&a,&b,&l,&r);
	
	char t[13];
	
	for(int i=0;i<25;i++){
		p[i]=0;
	}
	
	index=0;
	for(int i=0;i<a;i++){
		t[index++]='a'+i;
		if(index>=l&&index<r){
			p[t[index-1]-'a']=1;
		} 
	}
	
	flag=1;
	while(index<r){
		if(flag==1){
			
			for(int i=0;i<b;i++){
//				t[index++]=t[index-1];
				index++;
				if(index>=l&&index<r){
					p[t[a-1]-'a']=1;
				} 
			}
			
			flag=0;
		}
		else{
			
			if(a>b+1){
				xsize=a-b;
				xindex=b;
				for(int i=0;i<xsize;i++){
					x[i]=t[xindex++];
				}
			}
			else{
				xsize=1;
				x[0]=t[a-1];
			}
			
			csum=0;
			c='a';
			for(int i=0,j=0;i<a;i++){
				if(j<xsize){
					while(c==x[j]){
						j++;
						c+=1;
						if(j>=xsize){
							break;
						}
					}
					t[i]=c;
					index++;
				}
				else{
					t[i]=c+1;
					index++;
				}
				
				if(index>=l&&index<r){
					p[t[i]-'a']=1;
				} 
			}
			
			flag=1;
		}
	}
	
//	for(int i=0;i<index;i++){
//		printf("%c",t[i]);
//	}
//	printf("\n");
	
	
//	for(int i=l-1;i<r-1;i++){
//		p[t[i]-'a']++;
//	}
	
	count=0;
	for(int i=0;i<24;i++){
		if(p[i]>0){
//			printf("%d %d",i,p[i]);
//			printf("\n");
			count++;
		}
	}
	
	printf("%d",count);
	
}
