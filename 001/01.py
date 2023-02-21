n, l = map(int, input().split())
k = int(input())
a = list(map(int, input().split()))

left, right = 0, l

while right - left > 1:
    mid = (left + right) // 2
    p = 0
    cut = 0
    flag = True
    for i in range(n):
        if (a[i] - p) >= mid and (l - a[i]) >= mid:
            cut += 1
            p = a[i]
            if cut >= k:
                left = mid
                flag = False
                break
        else:
            continue
    if flag:
        right = mid
print(left)
