#include <stdio.h> 
int main(void)
{
	long int a = 0, b = 0, c = 0, n = 1;
	scanf("%ld %ld %ld", &a, &b, &c);
	if (b >= c)
	{
		printf("-1");
		return 0;
	}
	n = a / (c - b) + 1;
	printf("%d", n);
	return 0;
}
