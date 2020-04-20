#include <iostream> 
using namespace std;

bool isSqr[1000001];

int main() {
	long long min, max;
	cin >> min >> max;

	for (long long i = 2; i * i <= max; i++){
		long long start = min / (i * i);
		if (start * i * i != min) start++;
		for (long long j = start; i * i * j <= max; j++) {
			isSqr[i * i * j - min] = true;
		}
	}
	int count = 0;
	for (int i = 0; i < max - min + 1; i++) {
		if (!isSqr[i]) count++;
	}
	cout << count << endl;

	return 0;
}
