#include <iomanip>
#include <iostream>
using namespace std;

int main() {

    double a, b, c, e, d, f;

    cin >> a >> b >> c;
    e = a;
    d = b;
    f = c;

    if(c>b) {
        b = f;
        c = d;
    }

    if(b>a) {
        a = d;
        b = e;
    }

    cout << a << " " << b << " " << c;


}
