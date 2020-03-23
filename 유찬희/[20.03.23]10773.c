#include <stdio.h>

int stack[100000];
int j = 0;

int pop() {
    if (stack[j - 1] != 0) {
        stack[j - 1] = 0;
        j--;
        return 0;
    }
    else {
        return -1;
    }
}

void push(int n) {
    stack[j] = n;
    j++;
}

int main() {
    int i = 0;
    int result = 0;
    int count;
    

    scanf("%d", &count);

    while (i < count) {
        scanf("%d", &stack[i]);
        if (stack[i] == 0)
            pop();
        else
            push(stack[i]);
        i++;
    }
    i = 0;
    while (i < j) {
        result += stack[i];
        i++;
    }
    printf("%d",result);
}