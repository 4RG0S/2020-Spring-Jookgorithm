#include <iostream>
 
int main() {
    int T;
    scanf("%d", &T);
 
    for (int i = 0; i < T; ++i) {
        int x1, y1, x2, y2;
        scanf("%d %d %d %d", &x1, &y1, &x2, &y2);
 
        int n;
        scanf("%d", &n);
        int count = 0;
        for (int j = 0; j < n; ++j) {
            int cx, cy, r, d;
            bool in1, in2;
 
            scanf("%d %d %d", &cx, &cy, &r);
            d = (cx - x1) * (cx - x1) + (cy - y1) * (cy - y1);
            in1 = d > r * r ? false : true;
            d = (cx - x2) * (cx - x2) + (cy - y2) * (cy - y2);
            in2 = d > r * r ? false : true;
            if (in1 != in2) count++;
        }
        printf("%d\n", count);
    }
 
    return 0;
}
