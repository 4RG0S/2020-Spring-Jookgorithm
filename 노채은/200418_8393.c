#include <stdio.h>
int main()
{
	int num, i, total = 0;

	scanf("%d", &num);

	for (i = 1; i <= num; i++)
		total += i;

	printf("%d\n", total);

	return 0;
}