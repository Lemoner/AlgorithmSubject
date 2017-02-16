#include<iostream>
using namespace std;
int main(void)
{
	int p1,p2,p3,k;
	string str;
	cin>>p1>>p2>>p3;
	cin>>str;
	k=str.length();
	for(int i=0;i<k;i++){
		if(str[i]=='-'){
			if(str[i+1]>str[i-1]){
				int x=str[i+1]-str[i-1];
				if(x==1){
					break;
				}
				else{
					if(str[i-1]>='a'&&str[i-1]<='z'&&str[i+1]>='a'&&str[i+1]<='a'){
						if(p3==1){
							if(p1==1){
								for(int j=1;j<x;j++){
									for(int p=0;p<p2;p++){
										cout<<str[i-1]+j;
									}
								}
							}
							else if(p1==2){
								for(int j=1;j<x;j++){
									for(int p=0;p<p2;p++){
										cout<<str[i-1]+j+32;
									}
								}
							}
							else if(p1==3){
								for(int j=1;j<x;j++){
									for(int p=0;p<p2;p++){
										cout<<"*";
									}
								}
							}
						}
						else if(p3==2){
							if(p1==1){
								for(int j=1;j<x;j++){
									for(int p=0;p<p2;p++){
										cout<<str[i+1]-j;
									}
								}
							}
							else if(p1==2){
								for(int j=1;j<x;j++){
									for(int p=0;p<p2;p++){
										cout<<str[i+1]-j+32;
									}
								}
							}
							else if(p1==3){
								for(int j=1;j<x;j++){
									for(int p=0;p<p2;p++){
										cout<<"*";
									}
								}
							}
						}
					}
					else if(str[i-1]>='0'&&str[i-1]<='9'&&str[i+1]>='0'&&str[i+1]<='9'){
						if(p3==1){
							if(p1==1||p1==2){
								for(int j=1;j<x;j++){
									for(int p=0;p<p2;p++){
										cout<<str[i-1]+j;
									}
								}
							}
							else if(p1==3){
								for(int j=1;j<x;j++){
									for(int p=0;p<p2;p++){
										cout<<"*";
									}
								}
							}
						}
						else if(p3==2){
							if(p1==1||p1==2){
								for(int j=1;j<x;j++){
									for(int p=0;p<p2;p++){
										cout<<str[i+1]-j;
									}
								}
							}
							else if(p1==3){
								for(int j=1;j<x;j++){
									for(int p=0;p<p2;p++){
										cout<<"*";
									}
								}
							}
						}
					}
					else{
					cout<<str[i];
					}
				}	
			}
			else{
				cout<<str[i];
			}
		}
		else{
			cout<<str[i];
		}
	}
	return 0;
}
