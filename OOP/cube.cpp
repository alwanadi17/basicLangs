#include <iostream>

class cube {
private:
	double side;

	double area() {
		return side*side;
	}

	double circ() {
		return side*4;
	}

public:
	static int sum;

	cube(double s) {
		sum++;
		this->side = s;
	}

	~cube() {
		sum--;
	}

	void setSide(double s) {
		this->side = s;
	}

	double getSide(){
		return side;
	}

	void printArea() {
		std::cout << "Luas persegi: " << area() << std::endl;
	}

	void printCirc() {
		std::cout << "Keliling persegi: " << circ() << std::endl;
	}
};

int cube::sum = 0;

int main(void) {

	cube c1(123);
	c1.printArea();
	c1.printCirc();
	std::cout << c1.getSide() << std::endl;
	std::cout << "sum: " << cube::sum << std::endl;
	std::cout << "sizeof cube: " << sizeof(cube) << std::endl;

	cube *c = new cube(17);
	c->printArea();
	c->printCirc();
	std::cout << "sum: " << c->sum << std::endl;

	c->setSide(7);
	c->printArea();
	c->printCirc();

	delete(c);
	std::cout << "sum: " << c1.sum << std::endl;

	return 0;
}
