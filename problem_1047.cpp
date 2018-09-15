#include <iostream>
#include <cmath>
using namespace std;

int main() {

    int start_hour, start_min, end_hour, end_min, game_hour, game_min;

    cin >> start_hour >> start_min >> end_hour >> end_min;

    game_hour = end_hour - start_hour;
    if(game_hour<=0) {
        game_hour = 24 + (end_hour - start_hour);
    }
    game_min = end_min - start_min;
    if(game_min<0) {
        game_min = 60 + (end_min - start_min);
        game_hour--;
    }

    if((start_hour==end_hour) && (start_min==end_min)) {
        cout << "O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)" << endl;
    } else {
        cout << "O JOGO DUROU " << game_hour << " HORA(S) E " << game_min << " MINUTO(S)" << endl;
    }

    return 0;
}
