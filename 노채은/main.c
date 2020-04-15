#include <stdio.h>

int main() {

	int student[1000], C = 0, N = 0, count = 0 ;
	double average = 0.0 ;

	scanf("%d", &C) ;

	for (int i = 0; i < C; i++) {
		scanf("%d", &N) ;

		for (int j = 0; j < N; j++) {
			scanf("%d", &student[j]) ;
			average +=  (double)student[j] ;
		}
		average /=  (double)N ;

		for (int j = 0; j < N; j++) {
			if ((double)student[j] > average)
                count++ ;
		}

		printf("%.3lf%%\n", ((double)count/(double)N) * 100.0) ;
		average = 0.0 ;
		count = 0 ;
	}

	return 0 ;
}
