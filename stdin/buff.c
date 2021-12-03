#include <stdio.h>

int main() {
	printf("\nBuffer test\n");
	printf("\n===================\n");

	char b;
	printf("input: ");
	getchar();

	while (scanf("%c",&b))
		if (b == '\n')
			break;
		else
			printf("%c",b);

	putchar('\n');

	return 0;
}
