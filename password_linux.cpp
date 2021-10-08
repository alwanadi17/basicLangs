#include <iostream>

//echo system
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
//echo system
using namespace std;


int main(){
    string input;
    home:
    echo(false);//turn off what you type
    cout << "Enter password : " << endl;
    getline(cin >> ws, input);
    echo(true);

    if(input == "kaydenbreak"){ //password can be changed
        system("clear");
        cout << "Access granted" << endl;
        system("firefox"); // change to program u want to try
    } else {
        system("clear");
        cout << "Access denied" << endl;
        goto home; //infinite loop
    }

    return 0;
}
