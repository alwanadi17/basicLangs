#include <iostream>
#include <string>

int main() {
	std::string str = "    alwan    adi    un    to    ro    ";
	char *ptr;
	size_t pos;

	ptr = &str[0];

	while (*ptr == ' ') ptr++;
	str.erase(0, ptr-&str[0]);

	ptr = &str[0] + str.length()-1;
	while (*ptr == ' ') ptr--;
	str.erase(ptr+1-(&str[0]), &str[0]+str.length()-ptr-1);
	std::cout << str << std::endl << "len: " << str.length() << std::endl;

	ptr = &str[3];
	str.erase(str.begin() + (ptr-&str[0]));
	std::cout << str << std::endl << "len: " << str.length() << std::endl;

	while (true) {
		pos = str.find("  ");
		if (pos == std::string::npos) break;

		ptr = &str.at(pos);

		while (*ptr == ' ') ptr++;

		str.erase(pos, ptr-(&str[pos])-1);
	}

	std::cout << str << std::endl;

	return 0;
}
