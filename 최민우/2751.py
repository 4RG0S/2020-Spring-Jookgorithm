# def qsort(x):
#     if len(x) <= 1:
#         return x
#     center = x[len(x) // 2]
#     less, more, equal = [], [], []
#     for i in x:
#         if i < center:
#             less.append(i)
#         elif i > center:
#             more.append(i)
#         else:
#             equal.append(i)
#     return qsort(less) + equal + qsort(more)
#
#
# number = []
#
# for _ in range(int(input())):
#     number.append(input())
#
# # 정렬 부분에서 시간을 많이 먹어서 O(nlogn)의 시간복잡도를 가진 정렬함수로 바꿔야함
# # 나는 sort() 대신에 직접 퀵소트를 제작하여 풀이함. 20. 4. 16.
# # number = qsort(number) 하지만 그런건 의미가 없었다...
# 형곤이형의 도움으로 해결했다 ...
# print("\n".join(map(str, sorted(number))))

v = [int(input()) for i in range(int(input()))]
print("\n".join(map(str, sorted(v))))