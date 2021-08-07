#include <iostream>
#include <math.h>
using namespace std;

int main(int argc, char **argv){
    int n;
    cin >> n;

   int temp=n;
   int digits=1;
   while(temp>=10)
   {
       ++digits;
       temp=temp/10;
   }
   int i=1;
   temp=n;
   int number=0;
   while(i<=digits)
   {
    int d=temp%10;
    number+=(int)pow(10,d)*i;
    temp=temp/10;
    ++i;
   }
   
   number=number/10;
   cout<<number;
}