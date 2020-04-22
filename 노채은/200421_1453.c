#include <stdio.h>
int main() {
	int N;
	scanf("%d", &N);
	int arr[101] = { 0 }, seatNum, rejNum = 0;
	for (int i = 0; i < N; i++) {
		scanf("%d", &seatNum);
		if (arr[seatNum] == 1)
			rejNum++;
		arr[seatNum] = 1;
	}
	printf("%d", rejNum);
	return 0;
}