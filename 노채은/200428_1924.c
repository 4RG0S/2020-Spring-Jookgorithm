#include <stdio.h>
int main() {
	int month[12] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	const char* date[7] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

	int x, y;
	scanf("%d %d", &x, &y);

	for (int i = 0; i < x - 1; i++) {
		y += month[i];
	}
	printf("%s", date[y % 7]);
	return 0;
}