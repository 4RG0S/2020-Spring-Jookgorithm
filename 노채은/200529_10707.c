#include <stdio.h>

int main() {
	int firstNumOfDay;
	int numOfViolation = 0;
	int firstNumOfCar[5];

	scanf("%d", &firstNumOfDay);
	
	for (int i = 0; i < 5; i++) {
		scanf("%d", &firstNumOfCar[i]);
		if (firstNumOfCar[i] == firstNumOfDay) numOfViolation++;
	}

	printf("%d", numOfViolation);
}