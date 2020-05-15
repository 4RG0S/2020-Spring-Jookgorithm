#include <stdio.h>
#include <string.h>
void bubble_sort(char* N)
{
    int i, j;
    int len = strlen(N);
    char temp;
    for (i = 0; i < len; i++)
    {
        for (j = 0; j < len - (i + 1); j++)
        {
            if (N[j] < N[j + 1])
            {
                temp = N[j];
                N[j] = N[j + 1];
                N[j + 1] = temp;
            }
        }
    }
}
void sort_inside()
{
    char N[10000];
    scanf("%s", N);
    bubble_sort(N);
    printf("%s", N);
}
int main()
{
    sort_inside();
}