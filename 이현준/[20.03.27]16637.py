import sys
sys.setrecursionlimit(10**6)
read = lambda : sys.stdin.readline().strip()
import copy
import itertools

def cal(num1,num2,op):

    if op =='+':
        return num1+num2
    if op =='*':
        return num1*num2
    if op =='-':
        return num1-num2

def dfs(res,op_):
    global result
    if op_ == len(op):
        result = max(result,res)
        return
    dfs(cal(res,num[op_+1],op[op_]),op_+1)
    if op_+1 <len(op):
        dfs(cal(res,cal(num[op_+1],num[op_+2],op[op_+1]),op[op_]),op_+2)
n = int(read())
mat = read()
op =[]
num =[]
result = -2**31
if n ==1 :
    print(max(result,int(mat)))
    exit()
for i in range(len(mat)):
    if i%2==0 or i==0:
        num.append(int(mat[i]))
    else:
        op.append(mat[i])
dfs(num[0],0)
print(result)