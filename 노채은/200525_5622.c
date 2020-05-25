#include <stdio.h> 
#include <string.h> 

int num(int n); 

int main(void) 
{ 
	char arr[15]; 
	int i, j, sum = 0; 
	scanf("%s", arr); 
	for(i = 'A'; i <= 'Z'; i++) { 
		for(j = 0; j < strlen(arr); j++) 
		{ 
			if (i == arr[j]) {
				sum += num(i);
			}
		} 
	} 

	sum += strlen(arr); 
	printf("%d", sum); 

	return 0; 

	} 

	int num(int n) {

	switch(n) { 
	case 'A': 
	case 'B': 
	case 'C': 
		return 2; 
	case 'D': 
	case 'E': 
	case 'F': 
		return 3; 
	case 'G': 
	case 'H': 
	case 'I': 
		return 4; 
	case 'J': 
	case 'K': 
	case 'L': 
		return 5; 
	case 'M': 
	case 'N': 
	case 'O': 
		return 6; 
	case 'P': 
	case 'Q': 
	case 'R': 
	case 'S': 
		return 7; 
	case 'T': 
	case 'U': 
	case 'V': 
		return 8; 
	default: 
		return 9; 

		} 
	}
