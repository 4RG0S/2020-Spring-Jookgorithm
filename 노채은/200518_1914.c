#include <stdio.h>
#include <stdbool.h>

void hanoi(int, int, int, int);
void numN(int);

int main() {
	int countNum;
	scanf("%d", &countNum);
	numN(countNum);

	if (countNum <= 20)
		hanoi(countNum, 1, 2, 3);
	return 0;
}

void hanoi(int n, int num1, int num2, int num3) {
	if (n == 1) {
		printf("%d %d\n", num1, num3);
	}
	else {
		hanoi(n - 1, num1, num3, num2);
		printf("%d %d\n", num1, num3);
		hanoi(n - 1, num2, num1, num3);
	}
}

void numN(int n) {
	short result[32] = { 0 };
	int i = 1, j = 0;
	bool carry = false;
	result[0] = 1;
	while (n > 0) {
		for (int k = 0; k < i; k++) {
			result[k] *= 2;
			if (carry == true) {
				result[k]++;
				carry = false;
			}
			if (result[k] > 10000) {
				if (k == j) {
					i++;
					j++;
				}
				result[k] %= 10000;
				carry = true;
			}
		}
		n--;
	}
	result[0]--;
	for (int k = j; k >= 0; k--) {
		if (k != j)
			printf("%04d", result[k]);
		else
			printf("%d", result[k]);
	}
	printf("\n");
}