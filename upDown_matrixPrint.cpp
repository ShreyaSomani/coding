#include <iostream>
using namespace std;

int main()
{
    int n,m;
    cin>>n>>m;
    
    int a[n][m];
    
    for(int i=0;i<n;++i)
    {
        for(int j=0;j<m;++j)
        cin>>a[i][j];
    }
    
    for(int i=0;i<m;++i)
    {
        int d=0,u=n-1;
    
    for(int j=0;j<n;++j)
    {
        if(i%2==0)
        cout<<(a[d++][i])<<endl;
        else
        cout<<(a[u--][i])<<endl;
    }
 }
       
    
}