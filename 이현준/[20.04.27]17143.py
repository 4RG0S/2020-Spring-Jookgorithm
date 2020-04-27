import sys

read = lambda :sys.stdin.readline().strip()

class shark:

    def __init__(self,x_,y_,size,speed,d):
        self.x = x_
        self.y = y_
        self.size = size
        self.speed = speed
        self.d = d

    def set_d(self,di):
        self.d = di
    def set_op(self,x,y):
        self.x = x
        self.y = y



r_,c_,m = map(int,read().split())

mat =[[0 for i in range(c_)]for j in range(r_)]
#print(mat)
s_list = []
for i in range(m):
    r,c,s,d,z = map(int,read().split())
    sh = shark(r-1,c-1,z,s,d)
    s_list.append(sh)
    mat[r-1][c-1] = sh

re_d = [0,2,1,4,3]
dx = [0,-1,1,0,0]
dy = [0,0,0,1,-1]
result = 0
for i in range(c_):

    for j in range(r_):
        if mat[j][i] !=0:
            s = mat[j][i]
            mat[j][i] = 0
            result+= s.size
            s_list.remove(s)
            break
    gone_shark = []

    for s in s_list:
        mat[s.x][s.y] = 0

    for s in s_list:

        x_,y_ = s.x,s.y
        #mat[x_][y_] = 0
        for t in range(s.speed):
            x_ = x_ + dx[s.d]
            y_ = y_ + dy[s.d]

            if x_<0 or y_<0 or x_>=r_ or y_>=c_:
                d = re_d[s.d]
                s.set_d(d)
                x_ = x_ + dx[s.d]*2
                y_ = y_ + dy[s.d]*2

        s.set_op(x_,y_)
        if mat[x_][y_]!=0:
            t_s = mat[x_][y_]
            if s.size>t_s.size:
                gone_shark.append(t_s)
                mat[s.x][s.y] = s
            else:
                gone_shark.append(s)
                mat[t_s.x][t_s.y] =t_s
        else:
            mat[x_][y_] = s

    # for s in s_list:
    #     if s in gone_shark:
    #         continue
    #     flag = 0
    #     for t_s in s_list:
    #         if s is t_s or (s.x, s.y) != (t_s.x, t_s.y) or t_s in gone_shark:
    #             continue
    #         flag = 1
    #         if s.size>t_s.size:
    #             gone_shark.append(t_s)
    #             mat[s.x][s.y] = s
    #         else:
    #             gone_shark.append(s)
    #             mat[t_s.x][t_s.y] =t_s
    #         break
    #     if flag==0:
    #         mat[s.x][s.y] = s

    for s in gone_shark:
        s_list.remove(s)

print(result)

