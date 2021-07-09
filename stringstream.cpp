#include <iostream>
#include <sstream>
#include <string>
using namespace std;

int main(){
	system("clear");
	cout << endl <<  "stringstream test" << endl << endl;

	int num = 12345;
	string str;
	stringstream ss;

	//convert int to string
	ss << num;
	ss >> str;
	cout << "str : " << str << endl;

	//access str's element
	int length = str.length();
	//for(int i = 0; i < length; i++){
	//	cout << "str [" << i << "] : " << str[i] << endl;
	//}

	//convert str's element to array
	int numarray[length] = {0};
	for(int i = 0; i < length; i++){
		numarray[i] = (str[i] - 48);
		cout << endl << "numarray[" << i << "] : " << numarray[i] << endl;
	}

	//convert array to str
	str = "";
	for(int i = 0; i < length; i++){
		str += (numarray[i] + 48);
		cout << endl << "str[" << i << "] : " << str[i] << endl;
	}
	cout << endl << endl << str << endl;

	return 0;
}
