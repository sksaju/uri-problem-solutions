#include <iostream>
#include <iomanip>

using namespace std;

int main() {

    int i, j, n, x, y, small, large, sum=0;
    cin >> n;
    int output[n];

    for(i=0; i<n; i++) {
        cin >> x >> y;
        if(x<y) {
            small = x;
            large = y;
        } else {
            small = y;
            large = x;
        }
        for(j=small+1; j<large; j++) {
            if(j%2!=0) {
                sum += j;
            }
        }
        output[i] = sum;
        sum=0;
    }

    for(i=0; i<n; i++) {
        cout << output[i] << endl;
    }

    return 0;
}
