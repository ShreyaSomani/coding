#include<iostream>
using namespace std;


int main(){
    int n;
    cin>>n;
    int* arr = new int[n];
    for(int i = 0 ; i < n; i++){
        cin>>arr[i];
    }
    
    
    int t=n;
    
        for (int i=0;i<n;++i) 
        {
            for(int j=0;j<t;++j)
            {
                for(int k=0;k<=j;++k)
                {
                    cout<<arr[(i+k)]<<"\t";
                }
                 cout<<endl;  
            }
                
           --t;
            
        }
    
    }
