#include <iostream>
#include <cstring>

using namespace std;

int main(){

	cout << "Reversing word\n\n";

	string hex = "ff12";
	int length = hex.length();
	int i = length-1;
	string word;
	while(!(i < 0)){
		word += hex[i];
		i--;
	}
	cout << "word : " << word << endl;

	return 0;
}
