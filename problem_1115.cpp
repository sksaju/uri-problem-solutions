#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    int x, y;

    cin >> x >> y;

    if(x>0 && y>0) {
        cout << "primeiro" << endl;
        main(); //call to main function again
    } else if(x>0 && y<0) {
        cout << "quarto" << endl;
        main(); //call to main function again
    } else if(x<0 && y<0) {
        cout << "terceiro" << endl;
        main(); //call to main function again
    } else if(x<0 && y>0) {
        cout << "segundo" << endl;
        main(); //call to main function again
    } else {
        //end program
    }
    return 0;
}
