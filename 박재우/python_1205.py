import sys

n,score,rank=input().split()
num=list(map(int,sys.stdin.readline().split()))
over=0

if int(rank)==0:
    print(-1)
elif int(rank)==0:
    print(1)
else:
    num.append(int(score))
    num.sort(reverse=True)
    if num.index(int(score))+1 > int(rank):
        print(-1)
    else:
        if int(score) == num[-1] and int(n)==int(rank):
            print(-1)
        else:
            print(num.index(int(score))+1)
