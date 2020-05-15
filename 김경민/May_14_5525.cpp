#include <iostream>
#include <string>
using namespace std;

int main(void)
{
        ios_base::sync_with_stdio(0);
        cin.tie(0);
        int N, len;
        string s;
        cin >> N >> len >> s;
 
        int result = 0;
        for (int i = 0; i < s.length(); i++)
        {
                 if (s[i + 1] == 'O' && s[i + 2] == 'I')
                 {
                         int O = 0;
                         while (s[i] == 'I' && s[i + 1] == 'O')
                         {
                                 i += 2;

                                 O++;
                                 if (s[i] == 'I' && O == N)
                                 {
                                          O--;
                                          result++;
                                 }
                         }
                 }
        }
        cout << result << "\n";
        return 0;
}
