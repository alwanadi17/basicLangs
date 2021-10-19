#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>


int main () {

	printf("\n================\n");
	printf("\nstrcpy test\n");
	printf("\n================\n");

	const char *name = "ALWAN";
	char *p = malloc(10);
	size_t len = strlen(name);
	int *nums = malloc(sizeof(int)*2);
	nums[0] = 3;
	nums[1] = 5;

	printf("%d\n\n",*nums);

	strcpy(p,name);
	printf("%s\n",p);

	*p = *p-'A'+'a';
	printf("%s\n",p);

	printf("%s\n",name);
	while (*name != '\0') {
		printf("%d\n",*name);
		printf("%p\n",&name);
		*name++;
	}
	name = name-len;
	printf("%p\n",&name);
	printf("%d\n",*name);

	free(p);

	return 0;
}
