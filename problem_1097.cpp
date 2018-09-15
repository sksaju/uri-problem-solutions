#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    int j=7;
    for(int i=1; i<10; i+=2) {
        for(int k=1; k<4; k++) {
            cout << "I=" << i << " J=" << j << endl;
            j--;
        }
        j+=5;
    }

    return 0;
}
