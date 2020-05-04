#include<stdio.h>

int main(){
    long long arr[101] = {0, };
    long long ans[101];
    int n;scanf("%d",&n);
    arr[0] = 1; arr[1] = 1; arr[2] = 1; arr[3] = 2; arr[4] = 2;
    int i = 5;
    int a = 0;
    int size = 0;
    while (n--){
        scanf("%d",&a);
        while (i < a){
            arr[i] = arr[i - 1] + arr[i - 5];
            i++;
        }
        ans[size] = arr[a - 1];
        size++;
    }
    i = 0;
    while (size--)
        printf("%lld\n",ans[i++]);
}