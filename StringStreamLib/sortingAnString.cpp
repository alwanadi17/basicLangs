#include <iostream>
#include <string>
#include <bits/stdc++.h>
using namespace std;

int main(){
	system("clear");
	cout << endl << "Sorting an string test" << endl << endl;

	string str = "scriptkiddies123";
	char temp;
	int length = str.length();

	//sorting
	sort(str.begin(), str.end());

	cout << str << endl;

	return 0;
}
