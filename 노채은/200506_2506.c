#include <stdio.h>
int main(void) {
	int arr[101];
	int num, i, plus = 1, sum = 0, count = 0;
	scanf("%d", &num);
	for (i = 0; i < num; i++) {
		scanf("%d", &arr[i]);
		if (arr[i] == 1) {
			if (count == 1)
				plus += 1;
			sum += plus ;
			count = 1;
		}
		else {
			count = 0;
			plus = 1;
		}
	}
	printf("%d\n", sum);
}
