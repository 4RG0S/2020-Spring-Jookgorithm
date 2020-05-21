#include <stdio.h>
int main() {
	int A, B;
	int seq[1000];
	int sum = 0, count = 0, i = 1;

	scanf("%d %d", &A, &B);
	
	while (i <= B) {
		for (int j = 0; j < i; j++) {
			count++;
			seq[count] = i;
			if (count >= A && count <= B) {
				sum += seq[count];
			}
			else if (count == B) {
				break;
			}
		}
		i++;
	}

	printf("%d", sum);
	return 0;
}