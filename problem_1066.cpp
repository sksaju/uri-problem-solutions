#include <iostream>
#include <cmath>
using namespace std;

int main() {

    int a[5], i, even_number=0, odd_number=0, positive_num=0, negative_num=0;

    for(i=0; i<5; i++) {
        cin >> a[i];
        if((a[i]%2)==0) {
            even_number++;
        } else {
            odd_number++;
        }
        if(a[i]>0) {
            positive_num++;
        } else if(a[i]<0) {
            negative_num++;
        }
    }

    cout << even_number << " valor(es) par(es)" << endl;
    cout << odd_number << " valor(es) impar(es)" << endl;
    cout << positive_num << " valor(es) positivo(s)" << endl;
    cout << negative_num << " valor(es) negativo(s)" << endl;

    return 0;
}
