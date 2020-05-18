from sys import stdin, stdout

num_list = list(stdin.readline())
num_list.sort(reverse=True)
stdout.write("".join(num_list))
