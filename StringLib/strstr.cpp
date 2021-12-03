#include <iostream>
#include <string.h>

using namespace std;

int main () {

	cout << "strstr test" << endl;
	cout << "\n================\n";

	string str = "alwanadiuntoro";
	string temp = strstr(str,"a");

	cout << temp << endl;

	return 0;
}
