#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    int password;

    cin >> password;

    if(password==2002) {
        cout << "Acesso Permitido" << endl;
    } else {
        cout << "Senha Invalida" << endl;
        main();
    }
    return 0;
}
