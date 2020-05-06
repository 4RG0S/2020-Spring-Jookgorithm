import sys

read = lambda :sys.stdin.readline().strip()

n  = int(read())

if n<100:
    print(n)
else:
    result = 99
    for i in range(100,n+1):
        if i==1000:
            continue
        else:
            res = [int(x) for x in str(i)]
            if (res[1]-res[0])==(res[2]-res[1]):
                #print(res)
                result+=1
    print(result)