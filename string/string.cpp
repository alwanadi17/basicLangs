#include <iostream>
#include <algorithm>
using namespace std;

int main(){

	string str = "alwan\nadi", temp;
	int i = 0;
	cout << str << endl;

	while (str[i] != '\n') {
		cout << i;
		i++;
		cout << " | " << i << endl;
	}
	cout << i << endl;
	i = str.length();
	cout << i << endl;
	i = str.size();
	cout << i << endl;

	reverse(str.begin(), str.end());
	cout << str;

	return 0;
}
