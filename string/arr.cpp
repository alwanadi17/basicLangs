#include <iostream>
#include <string>

int main() {

	std::string str[5] = {"alwan", "adiuntoro","fdasf","fsdafa","fdsaf"};
	for (std::string s : str) std::cout << s << std::endl;

	return 0;
}
