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
    int k=0;
    int direction=0;
    int top=0,down=n-1,left=0,right=m-1;
    while(k<m*n)
    {
        if(direction==0)
        {
            for(int i=top;i<=down;++i)
            {cout<<a[i][left]<<"\n";
            ++k;}
            left+=1;
            
        }
        
        
        else if(direction==1)
        {
            for(int i=left;i<=right;++i)
            {cout<<a[down][i]<<"\n";
            ++k;}
            down-=1;
           
        }
       
        
        else if(direction==2)
        {
            for(int i=down;i>=top;--i)
            {cout<<a[i][right]<<"\n";
            ++k;}
            right-=1;
            
        }
        
        
        else if(direction==3)
        {
            for(int i=right;i>=left;--i)
            {cout<<a[top][i]<<"\n";
            ++k;}
            top+=1;
            
        }
        direction=(direction+1)%4;
        
    }
}
    
    
    
    