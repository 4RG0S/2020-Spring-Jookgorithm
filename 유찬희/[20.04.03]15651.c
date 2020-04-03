#include <stdio.h>
#include <stdlib.h>

int n, m;
int* arr;

void print_arr() {
	int i = 0;
	while (1) {
		printf("%d", arr[i]);
		if (m - 1 == i)
			break;
		printf(" ");
		i++;
	}
	printf("\n");
}

void roof(int flag) {
	if (flag == m) {
		print_arr();
		return;
	}
	int i = 0;
	for (i = 0; i < n; i++) {
		arr[flag] = i + 1;
		roof(flag + 1);
	}
}

int main() {
	scanf("%d %d", &n, &m);
	arr = (int*)malloc(sizeof(int) * m);
	roof(0);
}