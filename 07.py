N = int(input())
A = list(map(int,input().split()))
Q = int(input())

A.sort()

ans = []

for _ in range(Q):
    b = int(input())

    left = -1
    right = N

    # 2択に絞る
    while right - left > 1:
        mid = (left + right) // 2
        if A[mid] >= b:
            right = mid
        else:
            left = mid
    
    comp1 = 10**9
    comp2 = 10**9
    if left >= 0:
        comp1 = abs(A[left] - b)
    if left < N-1:
        comp2 = abs(A[left+1] - b)
    ans.append(min(comp1,comp2))

for _ in range(Q):
    print(ans[_])