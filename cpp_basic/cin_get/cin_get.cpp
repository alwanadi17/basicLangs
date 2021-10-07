#include <iostream>

using namespace std;

int main (){
	cout << "User input using cin.get(var,sizemax)\n\n";

	char input[16];
	cout << "input(max 15 char): ";
	cin.get(input,16);

	cout << "\nUser input: " << input << "\n\n";
	cin.get();
	cin.get();
	return 0;
}
