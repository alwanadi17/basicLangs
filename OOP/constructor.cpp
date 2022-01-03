#include <iostream>

class test {
private:
	int x;
	int y;
public:
	test(int a = 1, int b = 2) { //default constructor
		this->x = a;
		this->y = b;
	}

//	test(const test &obj) : test(obj.x, obj.y) { }

	test operator ++ (int) {
		test tmp;

		tmp.x = x++;
		tmp.y = y++;

		return tmp;
	}

	test operator ++ () {
		test tmp;

		tmp.x = ++x;
		tmp.y = ++y;

		return tmp;
	}

	test operator += (const test &obj) {
		this->x += obj.x;
		this->y += obj.y;
		return *this;
	}

	void print() {
		std::cout << "[" << x << "," << y << "]" << std::endl;
	}
};

int main() {

	test num = {145,21};
	test a;
	num.print();
	a.print();

	num = {123, 98};
	num.print();
	num = a++;
	num.print();
	a.print();

	test obj1(21), obj2(obj1);
	obj2.print();
	obj1.print();

	test obj3{test{21,32}};
	obj3.print();

	++obj3;
	obj3.print();
	obj3++;
	obj3.print();

	obj1 += obj2;
	obj1.print();

	return 0;
}
