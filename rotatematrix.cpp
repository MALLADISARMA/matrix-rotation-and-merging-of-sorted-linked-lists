#include<iostream>
#include<bits/stdc++.h>
#define n 4
using namespace std;
int main(){
    int  mat[n][n];
    int arr[n][n];
    int i,j;
    
    cout<<endl;
    for( i=0;i<n;i++){
        for(j=0;j<n;j++){
            cin>>mat[i][j];
           

        }
    }
    
    cout<<endl;
     for( i=0;i<n;i++){
        for( j=0;j<n;j++){
            arr[j][n-1-i]=mat[i][j];
        }
    }
    for(i=0;i<n;i++){
    
        for(j=0;j<n;j++){
            cout<<arr[i][j]<<" ";
            
        }
        cout<<endl;
    }
   
    cout<<endl;



}
