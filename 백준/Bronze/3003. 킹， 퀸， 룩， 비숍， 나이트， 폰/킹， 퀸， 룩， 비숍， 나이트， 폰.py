arr = [1, 1, 2, 2, 2, 8]
cnt = 0
for i in list(map(int, input().split())) :
    print(arr[cnt] - i, end=" ")
    cnt+=1