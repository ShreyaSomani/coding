#include<iostream>
#include<cmath>
using namespace std;

int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i = 0 ; i < n; i++){
        cin>>arr[i];
    }
    int data;
    cin>>data;
    
    int beg=0;
    int end=n-1;
    int f=0;
    int c=0;
    while(beg<=end)
    {
        int mid=(beg+end)/2;
        
        if(data>arr[mid])
        {
            beg=mid+1;
            f=arr[mid];
        }
        
        else if(data<arr[mid])
        {
        end=mid-1;
        c=arr[mid];
        }
        
        else
        {
            f=arr[mid];
            c=arr[mid];
            break;
        }
    }
    
   cout<<c<<endl<<f;
}