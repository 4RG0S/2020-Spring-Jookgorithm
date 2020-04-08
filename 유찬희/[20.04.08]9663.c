#include <stdio.h>

int board[16] = {0, };
int ans = 0;

int flag_check(int flag, int i){
    int index = 0;
    if (flag == 0)
        return 1;
    for (index = 0; index < flag; index++){
        int num = board[index] > i ? board[index] - i : i - board[index];
        if (board[index] == i)
            return 0;
        if (num == flag - index)
            return 0;
    }
    return 1;
}

void roof(int size, int flag){
    int i = 0;
    if (flag == size)
        ans++;
    for (i = 0; i < size; i++){
        if (flag_check(flag, i)){
            board[flag] = i;
            roof(size, flag + 1);
        }
    }
}

int main(){
    int size = 0;
    scanf("%d",&size);
    roof(size, 0);
    printf("%d\n",ans);
}