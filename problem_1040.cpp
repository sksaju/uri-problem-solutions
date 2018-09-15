#include <vector>
#include <iomanip>
#include <iostream>
using namespace std;

int main() {

    float n1, n2, n3, n4, n5, average, average2;

    cin >> n1 >> n2 >> n3 >> n4;

    average = ((n1*2)+(n2*3)+(n3*4)+n4)/10;

    cout << fixed << setprecision(1);
    cout << "Media: " << average << endl;
    if(average>=7.0) {
        cout << "Aluno aprovado." << endl;
    } else if(average<5.0) {
        cout << "Aluno reprovado." << endl;
    } else if(average>=5.0 && average<=6.9) {
        cout << "Aluno em exame." << endl;
        cin >> n5;
        cout << "Nota do exame: " << n5 << endl;
        average2 = (average+n5)/2;
        if(average2>=5.0) {
            cout << "Aluno aprovado." << endl;
        } else if(average2<=4.9) {
            cout << "Aluno reprovado." << endl;
        }
        cout << "Media final: " << average2 << endl;
    }
    return 0;
}
