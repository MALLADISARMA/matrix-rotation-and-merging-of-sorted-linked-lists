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
    auto last=unique(a.begin(),a.end());
    a.erase(last,a.end());
    cout<<a.size()<<endl;
    for(int i=0;i<a.size();i++){
        cout<<a[i]<<" ";
    }
}