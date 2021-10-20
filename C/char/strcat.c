#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main () {

	printf("\n=======================\n");
	printf("pointer with strcat");
	printf("\n=======================\n");

	char *str = malloc(30); //allocating memory

	if (str == NULL) {
		printf("memory not allocated");
		return -1;
	}

	strcat(str,"alwan");

	printf("%s\n",str);
	printf("%c\n",*str); //still on the beginning

	memset(str,0,30); //is this will interupt free()?

	free(str);

	printf("\n=======================\n");
	return 0;
}


//no memory leak
