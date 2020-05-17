#include <stdio.h>
int arr[100001] = { 0, };
int main() {
	int n, i;
	scanf("%d", &n);
	
	for (i = 0; i < n; i++) {
		int num;
		scanf("%d", &num);
		arr[num]++;
	}
	for (i = n; i >= 0; i--) {
		if (arr[i] == i) {
			printf("%d", i);
			return 0;
		}
	}
	printf("-1")
}