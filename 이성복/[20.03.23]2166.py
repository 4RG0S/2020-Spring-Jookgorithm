def ccw(x1,y1,x2,y2,x3,y3):
    return (x1*y2 + x2*y3 + x3*y1) - (y1*x2 + y2*x3 + y3*x1)

num = int(input())

x, y = map(int, input().split())

info = []
for i in range(num - 1):
    info.append(list(map(int, input().split())))

tmp = 0
for i in range(num - 2):
    tmp += ccw(x,y,info[i][0],info[i][1],info[i+1][0],info[i+1][1])

print(abs(tmp)/2)