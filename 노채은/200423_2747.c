#include <stdio.h>
int Fibb[45];

int main()
{
    int n;
    scanf("%d", &n);
    Fibb[0] = 0;
    Fibb[1] = 1;

    for (int i = 2; i < n + 1; i++)
    {
        Fibb[i] = Fibb[i - 1] + Fibb[i - 2];
    }

    printf("%d", Fibb[n]);

    return 0;
}