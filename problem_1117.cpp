#include <iostream>
#include <iomanip>

using namespace std;
int valid=0;
float temp;

int main() {
    float input;
    cin >> input;
    if(input>=0 && input<=10) {
        valid++;
        if(valid==1) {
            temp = input;
            main();
        } else if(valid==2) {
            cout << "media = " << (temp+input)/2 << endl;
        }

    } else {
        cout << "nota invalida" << endl;
        main();
    }

    return 0;
}
