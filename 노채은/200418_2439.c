#include <stdio.h>
int main()
{
	int N, i, j;

	scanf("%d", &N);

	for (i = N; i > 0; i--) {
		for (j = 1; j <= N; j++)
			if (j >= i)
				printf("*");
			else
				printf(" ");
		printf("\n");
	}

	return 0;
}