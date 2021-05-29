#include <iostream>
#include <termios.h>
#include <unistd.h>

void echo( bool on = true ){
  struct termios settings;
  tcgetattr( STDIN_FILENO, &settings );
  settings.c_lflag = on
                   ? (settings.c_lflag |   ECHO )
                   : (settings.c_lflag & ~(ECHO));
  tcsetattr( STDIN_FILENO, TCSANOW, &settings );
}

using namespace std;


int main(){
    string input;
    home:
    echo(false);
    cout << "Enter password : " << endl;
    getline(cin >> ws, input);
    echo(true);

    if(input == "kaydenbreak"){
        system("clear");
        cout << "Access granted" << endl;
        system("firefox");
    } else {
        system("clear");
        cout << "Access denied" << endl;
        goto home;
    }

    return 0;
}