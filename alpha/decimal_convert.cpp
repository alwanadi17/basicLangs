#include <iostream>
#include <stdio.h>

using namespace std;

string bin (int &dec)
{
	string ret;

	for (int i = 31; i >= 0; i--) {
		if((dec >> i) & 1 == 1) {
			if((i+1)%4 == 0) ret += ' ';
			ret += '1';
		}
		else {
			if((i+1)%4 == 0) ret += ' ';
			ret += '0';
		}
	}

	return ret;

}

string hex (int &dec)
{
	string ret, temp;
	char hex;

	while (dec != 0) {
		hex = dec%16;
		if (hex >= 0 && hex <= 9) temp += hex+'0';
		else if (hex >= 10) temp += hex-10+'A';
		dec = dec/16;
	}

	uint16_t length = temp.length();
	for (int i = length-1; i >= 0; i--) {
		if((i+1)%2 == 0) ret += ' ';
		ret += temp[i];
	}

	return ret;
}

void pause()
{
    cout << "Press any key to continue . . .";
    cin.get();
    cin.get();
}


int main(){

	int dec = 0;
	string out;

	while(true){
		system("clear");
		cout << "\n==============================\n";
		cout << "Decimal converter 32 bits";
		cout << "\n==============================\n";
		cout << "Input value = ";
		cin >> dec;

		out = bin(dec);
		cout << "Binary =" << out << endl;

		out = hex(dec);
		cout << "Hexadecimal =" << out << endl;
		pause();
	}

	return 0;
}
