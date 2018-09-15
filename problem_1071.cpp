#include <iostream>

using namespace std;

int main() {

    int x, y, temp, sum=0;
    cin >> x >> y;

    if(x>y) {
        temp = x;
        x = y;
        y = temp;

    }
    for(x = x+1; x<y; x++) {
        if((x%2)!=0) {
            sum = sum+x;
        }
    }
    cout << sum << endl;

    return 0;
}