#include <iostream>
using namespace std;

int main() {

    int i, j, input_num[3], un_sorted_array[3], temp;

    for(i=0; i<3; i++) {
        cin >> input_num[i];
        un_sorted_array[i] = input_num[i];
    }

    for(i = 2; i > 0; i--){
        for(j = 0; j < i; j++){
            if(input_num[j] > input_num[j+1]){
                temp = input_num[j];
                input_num[j] = input_num[j+1];
                input_num[j+1] = temp;
            }
        }
    }
    //sorted array
    for(i=0; i<3; i++) {
        cout << input_num[i] << endl;
    }
    //unsorted array
    cout << endl;
    for(i=0; i<3; i++) {
        cout << un_sorted_array[i] << endl;
    }

    return 0;
}
