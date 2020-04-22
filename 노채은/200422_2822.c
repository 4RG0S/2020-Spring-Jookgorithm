#include<stdio.h>

int main( ) {
	int max = 0, arr[8], tmp, sum = 0;
	for (int i = 0; i < 8; i++) {
		scanf("%d", &arr[i]);
	}
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 8; j++) {
			if ((arr[j] != 151) && (arr[j] > max)) {
				max = arr[j];
				tmp = j;
			}
		}
		sum += max;
		arr[tmp] = 151;
		max = 0;
	}
	printf("%d\n", sum);
	for (int i = 0; i < 8; i++) {
		if (arr[i] == 151) 
			printf("%d ", i + 1);
	}
	return 0;
}