#include <iostream>
#include <iomanip>

using namespace std;

int main() {

    float i = 0;
    while(i<2.2) {
        for(float j=1; j<4; j++) {
            cout << "I=" << i << " J=" << j+i << endl;
        }
        i+=0.2;
    }

    return 0;
}
