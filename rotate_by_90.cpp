#include <iostream>
using namespace std;

int main()
{
    int n;
    cin>>n;
    
    int arr[n][n];
    for(int i=0;i<n;++i)
    {
        for(int j=0;j<n;++j)
        cin>>arr[i][j];
    }
    //transpose
    for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < i/**/; j++)
            {
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
            }
    }
            //reversing row by row
            for(int i = 0; i < n; i++)
            {
                int k=0;
                int m=n-1;
                
                while(k<n/2)
                {
                    int temp=arr[i][k];
                    arr[i][k]=arr[i][m];
                    arr[i][m]=temp;
                    ++k;
                    --m;
                }
            
            }
            
            for(int i = 0; i < n; i++)
            {
            for(int j = 0; j < n; j++)
            cout<<arr[i][j]<<" ";
            cout<<endl;
            }
}