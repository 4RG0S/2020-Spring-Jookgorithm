import sys


def binaryTree(array, num, start, end):
    if start > end:
        return 0
    mid = (start + end) // 2
    if array[mid] > num:
        return binaryTree(array, num, start, mid - 1)
    if array[mid] < num:
        return binaryTree(array, num, mid + 1, end)
    return 1


sys.stdin.readline()
numList = sys.stdin.readline().split()
sys.stdin.readline()
qList = sys.stdin.readline().split()

numList.sort()
for i in qList:
    print(binaryTree(numList, i, 0, len(numList) - 1))
