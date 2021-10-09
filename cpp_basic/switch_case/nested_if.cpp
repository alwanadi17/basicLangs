#include <cstdio>
#include <time.h>

int main(){

	printf("\n========================\n");
	printf("Galileo Galilei ululululu");
	printf("\n========================\n");

	clock_t begin = clock();

	for (int i = 1; i <= 100; i++) {
		if (i%2 == 0) {
			printf("ga ");
			if (i%4 == 0) {
				printf("li ");
				if (i%8 == 0)
					printf("leo");
			}
		}
	printf("%i\n",i);
	}

	clock_t end = clock();

	printf("\nElapsed: %f seconds\n\n", (double)(end-begin) / CLOCKS_PER_SEC);

	return 0;
}
