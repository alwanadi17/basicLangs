#include <iostream>

using namespace std;

#define MAX 100
int main(){
	cout << "\t Statistic modus" << endl;

	short nums[MAX] = {1,2,1,3,4,32,5,3,4,2,3,4,6,75,6,7,56,6,78,8,7,8,8,4,3,26,7,56,4};
	size_t length = sizeof(nums)/sizeof(*nums);

	int a;
	while(nums[a] != '\0'){
		a++;
	}
	cout << "nums element = " << a << endl;

	cout << endl << "Sorting moment" << endl;
	int temp;
	for(int i = 0; i < a; i++){
		for(int j = i; j < a; j++){
			if(nums[i] > nums[j]){
				temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
	}

	for(int i = 0; i < a; i++){
		cout << nums[i] << "\t";
	}
	cout << endl;

	cout << "Looking for modus" << endl;
	for(int i = 0; i < a; i++){
		
	}

	return 0;
}

