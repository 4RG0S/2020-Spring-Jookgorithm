import sys

read = lambda :sys.stdin.readline().strip()

def satisfy(b):
    for i in range(1,len(b)//2+1):
        a = b[-i:]
        c = b[-2*i:-i]
        if a==c:
            return False
    return True

def dfs(a):
    if satisfy(a)==False:
        return

    if len(a)==n:
        print(a)
        sys.exit()
        return


    dfs(a+'1')
    dfs(a+'2')
    dfs(a+'3')



#satisfy('21121')
n = int(read())

dfs('')

