#include <cstdio>
#include <time.h>

int main() {

	printf("\n========================\n");
	printf("Galileo Galilei ululululu");
	printf("\n========================\n");

	clock_t begin = clock();

	for (int i = 1; i <= 100; i++) {
		switch (i%8) {
			case (0) :
				printf("ga li leo\n");
				break;
			case (2) :
				printf("ga\n");
				break;
			case (4) :
				printf("ga li\n");
				break;
			case (6) :
				printf("ga\n");
				break;
			default :
				printf("%i\n",i);
				break;
		}
	}

	clock_t end = clock();

	printf("\nElapsed: %f seconds\n", (double)(end-begin) / CLOCKS_PER_SEC);

	return 0;
}
