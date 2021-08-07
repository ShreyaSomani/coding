#include<iostream>
#include<cmath>
using namespace std;

int conversion(int number, int y,int x)
   {
       int temp=number;
       int i=0;
       int base=0;
       
       while(temp>0)
       {
           int d=temp%y;
           base+=d*(int)(pow(x,i));
           ++i;
           temp=temp/y;
       }
       return base;
   }
   
   
   int main()
   {
       int n,s,d;
       cin>>n>>s>>d;
       int ans=0;
     if(s==10)
         ans = conversion(n,d,10);
     else if(d==10)
         ans = conversion(n,10,d);
     else
     {
         int number = conversion(n,10,s);
         ans =conversion(number,d,10);
     }
         cout<<ans;
    
   }  