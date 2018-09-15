#include <iostream>
using namespace std;

int main() {

    int input, i=0;
    cin >> input;

    while(true) {
        if((input%2)!=0) {
            cout << input << endl;
            i++;
        }
        input++;
        if(i==6) {
            break;
        }
    }
    return 0;
}
