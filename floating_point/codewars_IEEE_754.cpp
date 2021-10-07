#include <iostream>
#include <cstring>

using namespace std;

string binary(const float &num)
{
	string ret = "";
	int size = sizeof(num);
	int cp;
	memcpy(&cp,&num,size);

	for (int i = (size*8)-1; i >= 0; i--) {
		ret += (cp >> i) & 1 ? '1' : '0';
		if (i == (size*8)-1 || i == ((size-1)*8)-1) ret += " ";
	}

	return ret;
}

string fp32(const float num)
{
	int i;
	uint32_t mm;
	string ret = "", temp = "";

	memcpy(&mm, &num, sizeof(mm));
	cout << "mm: " << mm << endl;
	temp = binary(mm);
	cout << "mm binary: " << temp << endl;
	cout << "num: " << num << endl;

	// Extract the sign bit.
	ret += (mm & (1u << 31)) ? "1 " : "0 ";
	cout << (1u << 31) << endl;

	// Extract the exponent
	for (i = 30; i > (30 - 8); i--)
		ret += (mm & (1u << i)) ? "1" : "0";

	// Add space
	ret += " ";

	// Extract the mantissa
	for (i = 22; i >= 0; i--)
		ret += (mm & (1u << i)) ? "1" : "0";

	return ret;
}


int main(){

	cout << "\n\n===========================\n\n";
	cout << "FLOATING POINT";
	cout << "\n\n===========================\n\n";

	float f = 0;

	cout << "input: ";
	cin >> f;

	string bin = binary(f);

	cout << "IEEE 754 : " << bin << "\n\n";

	bin = binary(f);
	cout << "IEEE 754 : " << bin << "\n\n";

	return 0;
}
