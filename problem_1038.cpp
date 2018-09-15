#include <iostream>
using namespace std;

int main() {

    int code, quantity;
    float price, total_price;

    cin >> code >> quantity;

    if(code==1) {
        price = 4.00;
    } else if(code==2) {
        price = 4.50;
    } else if(code==3) {
        price = 5.00;
    } else if(code==4) {
        price = 2.00;
    } else if(code==5) {
        price = 1.50;
    } else {
        price = 0;
    }

    total_price = price*quantity;

    cout.precision(2);
    cout << "Total: R$ " << fixed << total_price << endl;

    return 0;
}
