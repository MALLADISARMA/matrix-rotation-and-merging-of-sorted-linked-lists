#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int main(){
    int n;
    cin>>n;
    cout<<endl;
    vector<int> a(n);
    for(int i=0;i<n;i++){
        cin>>a[i];
        cout<<" ";
    }
    cout<<endl;
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
    cout<<endl;
    cout<<endl;
    sort(a.begin(),a.end());
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
    cout<<endl;
    for(int i=0;i<n;i++){
        if(a[i]==a[i+1]){
            cout<<a[i]<<" ";
        }
    }
}
