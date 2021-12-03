#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main () {

	printf("\n=======================\n");
	printf("pointer with strcat");
	printf("\n=======================\n");

	char *str = malloc(30); //allocating memory
	size_t i = 0;

	if (str == NULL) {
		printf("memory not allocated");
		return -1;
	}

	strcat(str,"alwan");

	printf("%s\n",str);
	printf("%c\n",*str); //still on the beginning

	memset(str,0,30);

	strcat(str,"alwan");
	while (*str != '\0') {
		printf("%c ",*str);
		str++;
	} //the pointer now is at \0

	strcat(str,"hem");
	printf("\n%c\n",*str); //output: h

	str = str-5;
	free(str);

	printf("\n=======================\n");
	return 0;
}


//no memory leak
//test running smoothly
