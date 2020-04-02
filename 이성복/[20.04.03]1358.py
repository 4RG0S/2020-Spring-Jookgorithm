import math

W, H, X, Y, P = map(int, input().split())

def circle(x, y):
    if x < X:
        center_x, center_y = X, Y + H/2
        distance = math.sqrt((center_x - x) ** 2 + (center_y - y) ** 2)
        if distance <= H/2:
            return True
        else:
            return False
    else:
        center_x, center_y = X + W, Y + H/2
        distance = math.sqrt((center_x - x) ** 2 + (center_y - y) ** 2)
        if distance <= H/2:
            return True
        else:
            return False
            
def check(x, y):
    if x < X or y < Y or x > X + W or y > Y + H:
        if circle(x,y):
            return True
        else:
            return False
    else:
        return True

count = 0
for i in range(P):
    x, y = map(int, input().split())
    if check(x,y):
        count += 1

print(count)