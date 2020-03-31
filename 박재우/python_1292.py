start,end=input().split()
count=0
sums=0
flag=0
if int(start) == 1 and int(end) == 1:
    print(1)
elif int(start) == 1 and int(end) == 2:
    print(3)
else :
    for i in range(1,int(end)) :
        for j in range(0,i) :
            count+=1
            if count == int(start):
                flag=1
            if flag == 1 :
                sums+=i
            if count == int(end) :
                break
        if count == int(end) :
            break
    print(sums)
