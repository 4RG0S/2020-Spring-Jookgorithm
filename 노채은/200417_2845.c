#include <stdio.h>

int main()
{
	int L, P, i;
	int aNum[5];
	int pNum;

	scanf("%d %d", &L, &P);

	pNum = L * P;

	for (i = 0; i < 5; i++)
		scanf("%d", &aNum[i]);

	for (i = 0; i < 5; i++)
		printf("%d ", aNum[i] - pNum);

	return 0;
}