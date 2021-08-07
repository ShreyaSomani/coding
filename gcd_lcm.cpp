#include <iostream>
using namespace std;
int main(int argc, char **argv){
    int num1, num2;
    cin >> num1 >> num2;

    int divisor,dividend,remain;
    if(num1>num2)
    {
    dividend = num1;
    divisor=num2;
    }
    else
    {
    dividend = num2;
    divisor=num1;
    }
    
    remain=dividend%divisor;
    
    while(remain!=0)
    {
        dividend=divisor;
        divisor=remain;
        remain=dividend%divisor;
    }
    int gcd = divisor;
    int lcm = (num1*num2)/gcd;
    
    cout << gcd << endl;
    cout <<lcm;
}