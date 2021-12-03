#include <stdio.h>
#include <string.h>

int main(void) {

	char text[] = "alwan";
	char *p = text;

	while (*p) {
		printf("%lu\n",strlen(p));
		p++;
	}

	return 0;
}
