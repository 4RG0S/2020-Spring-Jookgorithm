n,m = map(int, input().split(' '))
lst1=[]
lst2=[]
ans=[]
num = 0
for i in range(0,n,1):
    lst1.append(input())
for i in range(0,m,1):
    lst2.append(input())
ans = set(lst1) & set(lst2)
print(len(ans))
for i in sorted(ans):
    print(i)