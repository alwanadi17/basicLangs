#include <stdio.h>
#include <stdlib.h>

typedef struct node {
	int val;
	struct node *next;
	struct node *prev;
} node;

node *newnode(int num)
{
	node *ret;

	ret = malloc(sizeof(node));
	ret->val = num;
	ret->next = NULL;
	ret->prev = NULL;

	return ret;
}

void pop_print(node *head)
{
	node *temp;

	while(head != NULL) {
		printf("%d\n",head->val);
		temp = head;
		head = head->next;
		free(temp);
	}
}

int main(void) {

	node *head;
	node *tail;
	node *temp;

	head = newnode(1);

	temp = newnode(32);
	tail = head;
	temp->next = head;
	head = temp;
	head->prev = tail;
	printf("head->prev->val=%d\n",head->prev->val);

	temp = newnode(78);
	tail = head;
	temp->next = head;
	head = temp;
	head->prev = tail;
	printf("head->prev->val=%d\n",head->prev->val);

	pop_print(head);

	return 0;
}
