#include <iostream>

using namespace std;

char sign(float &f)
{
	return f < 0 ? '1' : '0';
}

string binary(int &a)
{
	string ret, temp;
	int num = a;

	while (num != 0) {
		temp += num%2+48;
		num /= 2;
	}
	int len = temp.length();

	for (int i = len-1; i >= 0; i--) ret += temp[i];

	return ret;
}

int exponent(int &integer,int &f,float &fl)
{
	int ret = 127;
	string bin = binary(integer);
	int len = bin.length();
	if (fl > 1 || fl < -1) ret += len-1;
	else if (fl < 1 && fl > -1) ret -= f;

	return ret;
}

string binfloat(float &f)
{
	string ret;
	float num = f, sum = 0, shift = 1;

	if (f < 0) num *= -1;

	while (!((num-sum) < 0.00000001 && (num-sum) > -0.00000001)){
		if ((sum+shift) > num) ret += '0';
		else {
			ret += '1';
			sum += shift;
		}
		cout << sum << " | " << shift << " | " << ret << endl;
		shift /= 2;
	}

	return ret;
}


int main(){
	cout << "\n==============================\n";
	cout << "FLOATING POINT";
	cout << "\n==============================\n\n";

	float fl = 0;
	cout << "input: "; cin >> fl;
	float flt = fl;
	int integer = 0, sum = 0;
	string bin, temp;
	cout << "Var fl = " << fl << "\n";

	while (flt >= 1 || flt <= -1) {
		if (flt > 0) flt--;
		else flt++;
		integer++;
	}

	temp = binary(integer);
	bin += temp;
	cout << "\n\nBinary = " << temp << "\n\n";
	temp = binfloat(flt);
	bin += temp;
	cout << "\nBinary Float = " << temp << "\n\n";
	cout << "\nUnormalized Mantissa = " << bin << "\n\n";

	char s = sign(fl);
	string exp = "";
	string mts = "";

	int len = bin.length();
	if (fl > 1 || fl < -1) {
		sum = len-1;
		for (int i = 1; i < len; i++) mts += bin[i];
	} else if (fl < 1 && fl > -1){
		for (int i = 0; bin[i] != '1'; i++) sum = i+2;
		for (int i = sum; i < len; i++) mts += bin[i];
	}

	int expo = exponent(integer,sum,fl);
	temp = binary(expo);
	len = temp.length();
	while (len++ < 8) exp += '0';
	len = mts.length();
	while (len++ < 23) mts += '0';
	exp += temp;

	cout << "IEEE 754 has 3 basic component\n";
	cout << "Sign(fl) = " << s << "\n";
	cout << "Exponent(fl) = " << exp << "\n";
	cout << "Mantissa(fl) = " << mts << "\n";

	cout << "\n\nBinary float(" << fl << "): " << s << " " << exp << " " << mts << "\n\n";

	return 0;
}
