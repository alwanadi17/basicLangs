#include <iostream>
#include <vector>

using namespace std;

int main(){

	system("clear");
	cout << "\n\tVector\n" << endl;

	vector<int> test = {0};
	vector<int> out = {0, 0};
	vector<int> nums = {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14};
	int i = 1;
	test[0] = 1;
	test[1] = 5;
	cout << test[1] << endl;
	cout << test[0] << endl;
	for(int n : nums){
		cout << i << ". " << n << endl;
		i++;
	}

	cout << "\naccessing specified element\n";
	cout << nums[2] << endl;

	cout << "\ncounting all member from vector\n";
	for(int n : nums) out[0] += n;
	cout << "out[0] = " << out[0] << endl;


	return 0;
}
