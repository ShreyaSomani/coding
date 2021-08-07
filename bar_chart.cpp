#include<iostream>
using namespace std;


int main(){
  int n;
  cin >> n;
  
  int a[n];
  
  for(int i=0;i<n;++i)
  cin>>a[i];
  
  int max=0;
  for(int i=0;i<n;++i)
  {
      if(a[i]>max)
      max=a[i];
  }
  
      for(int j=max;j>0;--j)
      {
        for(int i=0;i<n;++i)
          {
          if(a[i]==j)
          {
              cout<<"*\t";
              --a[i];
          }
          else
          cout<<"\t";
      }
      cout<<'\n';
  }
    
    
}