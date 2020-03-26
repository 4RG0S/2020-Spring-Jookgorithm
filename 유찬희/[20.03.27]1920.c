#include <stdio.h>
#include<stdlib.h>

int compare(const void* a, const void* b)    
{
	int num1 = *(int*)a;
	int num2 = *(int*)b;

	if (num1 < num2)
		return -1;

	if (num1 > num2)
		return 1;   

	return 0;
}


int main() {
	int N,M,temp;
	int i = 0;
	int j = 0;
	scanf("%d", &N);
	int* arr = (int*)malloc(sizeof(int) * N);

	for (i = 0; i < N; i++)
		scanf("%d", &arr[i]);

	scanf("%d", &M);
	int* ans = (int*)malloc(sizeof(int) * M);

	for (i = 0; i < M; i++)
		scanf("%d", &ans[i]);
	qsort(arr, N, sizeof(int), compare);
	
	for (i = 0; i < M; i++) {
		int value = 0;
		int first = 0;
		int last = N - 1;
		while (first <= last) {
			int mid = (first + last) / 2;
			if (arr[mid] < ans[i])
				first = mid + 1;
			else if (arr[mid] > ans[i])
				last = mid - 1;
			else {
				value = 1;
				break;
			}
		}
		printf("%d\n", value);
	}
}