#include <iostream>
#include <cmath>
using namespace std;

int main() {

    int start_time, end_time, game_time;

    cin >> start_time >> end_time;

    game_time = end_time - start_time;

    if(game_time<0) {
        game_time = 24 + (end_time - start_time);
    }
    if(start_time==end_time) {
        cout << "O JOGO DUROU 24 HORA(S)" << endl;
    } else {
        cout << "O JOGO DUROU " << game_time << " HORA(S)" << endl;
    }


    return 0;
}
