#include<stdio.h>
#include<string.h>
int main(void)
{
	char a[101],b[101],c[102],f[10][101];
	int len1,i,j,h,w; 
	scanf("%s",a);//fenzi
	scanf("%s",b);//fenmu
	len1=strlen(a);
	for(i=1;i<=9;i++){
			w=0;
			for(j=len1-1;j>=0;j--){
				f[i][j]=(a[j]-'0')*i+w+'0';
				if(f[i][j]>'9'){w=(f[i][j]-'0')/10;
					f[i][j]=(f[i][j]-'0')%10+'0'; 
					
				}
				else
				w=0;	
			}
			if(w){
				for(j=len1;j>=1;j--){
					f[i][j]=f[i][j-1];
				}
				f[i][j]=w+'0';
			}	
				for(j=0;j<5;j++){
		printf("%c",f[i][j]);
	}
	printf("\n");
	}
	for(i=0;i<100;i++){
		if(strcmp(b,a)<=0){
			for(j=9;j>=1;j--){
				if(strcmp(f[j],b)<=0)
				break;
			}
			c[i]=j+'0';
			w=0;
			for(h=strlen(b)-1;h>=0;h--){
				b[h]=b[h]-f[j][h]-w+'0';
				if(b[h]<'0'){
					w=1;
					b[h]+=10;
				}
				else
				w=0;
			}
			
		}
		else{
			c[i]='0';
			strcat(b,"0");
			i++;
			for(j=9;j>=1;j--){
				if(strcmp(f[j],b)<=0)
				break;
			}
			c[i]=j+'0';
			w=0;
			for(h=strlen(b)-1;h>=0;h--){
				b[h]=b[h]-f[j][h]-w+'0';
				if(b[h]<'0'){
					w=1;
					b[h]+=10;
				}
				else
				w=0;
			}
			strcat(b,"0");
		}
	}
	for(i=0;i<100;i++){
		printf("%c",c[i]);
	}
	return 0;
} 
