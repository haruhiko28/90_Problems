N = int(input())
A, B, C = map(int, input().split())
ans = 10000

for i in range(10000):
    for j in range(10000-i):        
        tmp = N - ( i*A + j*B )
        if tmp % C == 0 and tmp <= N and tmp >= 0:
            ans = min(ans, i + j + (tmp // C))
print(ans)  