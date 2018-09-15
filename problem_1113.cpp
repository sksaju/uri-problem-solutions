#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    int x, y;

    cin >> x >> y;

    if(x==y) {
        //nothing to do
    } else if(x>y) {
        cout << "Decrescente" << endl;
        main();
    } else {
        cout << "Crescente" << endl;
        main();
    }
    return 0;
}
