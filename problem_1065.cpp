#include <iostream>
#include <cmath>
using namespace std;

int main() {

    int a[5], i, even_number=0;

    for(i=0; i<5; i++) {
        cin >> a[i];
        if((a[i]%2)==0) {
            even_number++;
        }
    }

    cout << even_number << " valores pares" << endl;

    return 0;
}
