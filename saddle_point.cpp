#include <iostream>
using namespace std;

int main()
{
    int n;
    cin>>n;
    
    int a[n][n];
    
    for(int i=0;i<n;++i)
    {
        for(int j=0;j<n;++j)
        cin>>a[i][j];
    }
    
    
    int col=0;
    int row=0;
    int saddle=0;
    bool flag=false;
    for(int i=0;i<n;++i)
    {
        int min=a[i][0];
        int max=0;
        col=0;
        for(int j=0;j<n;++j)
        {
            if(min>a[i][j])
            {
                min=a[i][j];
                col=j;
            }
        }
        max=min;
        row=0;
        for(int k=0;k<n;++k)
        {
            if(max<a[k][col])
            {
                max=a[k][col];
                row=k;
            }
        }
        
        if(min==max)
        {
            saddle=max;
            flag=true;
            break;
        }
    }
    
    if(flag==true)
    cout<<saddle;
    else
    cout<<"Invalid input";
}
    
    
    