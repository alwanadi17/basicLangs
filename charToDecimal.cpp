#include <iostream>
#include <cstring>

using namespace std;

int main(){
	cout << "Can we convert char to decimal?" << endl << endl;

	uint8_t base = 96;
	char ch = 'a';
	int i, sum = 0, input = 0;

	cout << "output ch-base = " << ch-base << endl; //output decimal = 1

	uint8_t convert = ch+1; //if we use int, the output will be decimal
	cout << "output with var = " << convert << endl; // output char = 'b'

/*	const char* word = "alwanadiuntoro";
	size_t length = strlen(word);

	cout << "length = " << length << endl;

	for(i = 0; i < length; i++){
		while(word[i] == 'a' || word[i] == 'i' || word[i] == 'u' || word[i] == 'e' || word[i] == 'o'){
			i++;
			sum = 0;
		}
		if(i == length){
			return 0;
		}
		sum += word[i] - base;
		if(sum > input){
			input = sum;
		}
		cout << "sum = " << sum << endl;
		cout << "sum[" << i << "] = " << sum << endl;
		cout << "output = " << input << endl;
	}
*/
	return 0;
}
