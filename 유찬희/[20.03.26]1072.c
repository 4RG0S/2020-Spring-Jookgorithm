#include <stdio.h>

int main() {
    long long total, win;
    scanf("%lld %lld", &total, &win);
    long long rate = 100 * win / total + 1;
    if (rate >= 100) {
        printf("-1");
        return 0;
    }
    long long ans;
    long long first = 1;
    long long last = 1000000000;
    while (first <= last) {
        long long mid = (first + last) / 2;
        long long val = (win + mid) * 100 / (total + mid);
        if (rate <= val) {
            last = mid - 1; 
            ans = mid;
        }
        else first = mid + 1;
    }
    printf("%lld", ans);
    return 0;
}