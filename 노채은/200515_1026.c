#include <stdio.h>
#define func(a, b) { int tmp=a; a=b; b=tmp; } 

int main()
{
	int num, i, j, S = 0;
	int a[101], b[101];

	scanf("%d", &num);

	for (i = 0; i < num; i++) {
		scanf("%d", &a[i]);
		scanf("%d", &b[i]);
	}
		
	for (i = 0; i < num - 1; i++) {
		for (j = 0; j < num - i - 1; j++)
		{
			if (a[j] > a[j + 1]) {
				func(a[j], a[j + 1]);
			}
			if (b[j] < b[j + 1]) {
				func(b[j], b[j + 1]);
			}
		}
	}
		
	for (i = 0; i < num; i++) {
		S += a[i] * b[i];
	}
	printf("%d", S);
	return 0;
}