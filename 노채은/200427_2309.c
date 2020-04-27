#include <stdio.h>
int main() {
	int i, j, temp, arr[9], sum = 0, a, b;
	for (i = 0; i < 9; i++) {
		scanf("%d", &arr[i]);
	}
	for (i = 0; i < 9; i++) {
		for (j = 0; j < 9; j++) {
			if (arr[j] > arr[i]) {
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
	}
	for (i = 0; i < 9; i++) {
		sum += arr[i];
	}
	for (i = 0; i < 9; i++) {
		for (j = 0; j < 9; j++) {
			if ((sum - arr[i] - arr[j]) == 100) {
				a = i;
				b = j;
			}
		}
	}
	for (i = 0; i < 9; i++) {
		if ((i != a) && (i != b))
			printf("%d\n", arr[i]);
	}
	return 0;
}