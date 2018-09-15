#include <iostream>
#include <cmath>
using namespace std;

int m, n, i, j, k, l[100], c=0, small, large, pairs[100][100], sum[100];

int main() {
    cin >> m;
    cin >> n;
    if(m > 0 && n > 0) {
        if(n < m) {
            small = n;
            large = m;
        } else {
            small = m;
            large = n;
        }
        k=0;
        sum[c]=0;
        for(j=small; j<=large; j++) {
            pairs[c][k] = j;
            sum[c] +=j;
            k++;
            l[c]++;
        }
        c++;

        main();

    } else {
        for(i=0; i<c; i++) {
            for(j=0; j<l[i]; j++) {
                cout << pairs[i][j] << " ";
            }
            cout << "Sum=" <<  sum[i] << endl;
        }

    }

    return 0;
}
