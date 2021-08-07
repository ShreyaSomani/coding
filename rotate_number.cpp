#include <iostream>
#include<cmath>

using namespace std;
int main(){
    int n,k;
    cin>>n>>k;
    
    int temp=n;
    
    int digit=1;
    
    while(temp>=10)
    {
        ++digit;
        temp=temp/10;
    }
    
    while(k<0)
    k=digit+k;
    
    
    while(k>digit)
    k=k-digit;
    
        int divisor= (int)(pow(10,k));
        int multiplier = (int)(pow(10,(digit-k)));
      
        int m=n%divisor;
        n=n/divisor;
       
        int number = m*multiplier + n;
        cout <<number;
    
    
}