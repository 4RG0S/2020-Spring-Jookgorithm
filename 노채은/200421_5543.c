#include <stdio.h>

int main() {
    int burger[3] = { 0 };
    int drink[2] = { 0 };
    int i, minB = 2001, minD = 2001;    

    for (i = 0; i < 3; i++) {       
        scanf("%d", &burger[i]);
        if (minB > burger[i])
            minB = burger[i];
    }
    for (i = 0; i < 2; i++) {    
        scanf("%d", &drink[i]);
        if (minD > drink[i])
            minD = drink[i];
    }
    printf("%d", minB + minD - 50);
    return 0;
}
