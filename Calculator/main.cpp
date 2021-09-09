#include <iostream>
#include <String>
#include <conio.h>

using namespace std;
class Calculator{
private:
    double a, b;
    string button;
    string equals;
public:
    Calculator();
    Calculator(double a_, string button_, double b_, string equals_);
    double result(){
    if(button == "+"){
        cout << a + b;
    }
    if(button == "-"){
        cout <<  a - b;
    }
    if(button == "*"){
        cout << a * b;
    }
    if(button == "/"){
            if(a == 0 or b == 0){
                cout << "Impartirea la zero";
            }
        cout << a / b;
    }
    }
};

//Calculator::Calculator() : a(2), button("*"), b(4) {}; //конструктор по умолчанию

Calculator::Calculator(double a_, string button_, double b_, string equals_) : a(a_), button(button_), b(b_), equals(equals_) {};

int main()
{
    double a, b;
    string button;
    string equals;
    cin >> a >> button >> b >> equals;
    Calculator calc(a, button, b, equals);
    calc.result();
    //cin >> a;
    return 0;
}
