from collections import deque

t = int(input())

for _ in range(t):
    func = input()
    leng = int(input())
    mat = input()
    if leng==0:
        mat = []
    else:
        mat = list(map(int,mat[1:-1].split(",")))
    q = deque()
    for i in mat:
        q.append(i)
    status = 0
    st_mat = [1,0]
    flag = 0
    for i in func:
        if i=='R':
            status = st_mat[status]
        elif i=='D':
            if  len(q) == 0:
                print("error")
                flag = 1
                break
            if status==0:
                q.popleft()
            else:
                q.pop()
    if flag==0:
        li = []
        if status==0:
            st = ''
            for i in q:
                st = st+str(i)+','
            st = '['+st[:-1]+']'
        else:
            st = ''
            for i in range(len(q)-1,-1,-1):
                st = st + str(q[i]) + ','
            st = '[' + st[:-1] + ']'
        print(st)
