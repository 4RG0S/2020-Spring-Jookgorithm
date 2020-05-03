#include <stdio.h>
#include <math.h>

int main()
{
	int a, b, v;
	scanf("%d %d %d", &a, &b, &v);

	if (v == a)
		printf("1\n");
	else
		printf("%d\n", (int)ceil((v - b - 1) / (a - b)) + 1);

}