#include<iostream>
using namespace std;

void reverse(int* arr, int p){
    int i=p-1;
    int n=0;
    int d= (int)(p/2);
    while(n<d)
    {
        int t=arr[i];
        arr[i]=arr[n];
        arr[n]=t;
        ++n;
        --i;
    }
    
}

void display(int* arr, int n){
    for(int i = 0 ; i < n; i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}

int main(){
    int n;
    cin>>n;
    
    int* arr = new int[n];
    for(int i = 0 ; i < n; i++){
        cin>>arr[i];
    }
    reverse(arr,n);
    display(arr,n);
}