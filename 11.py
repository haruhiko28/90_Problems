N = int(input())

table = []
for _ in range(N):
    table.append(tuple(map(int, input().split())))
table.sort(key=lambda x: x[0])

D = [0] * 5009
C = [0] * 5009
S = [0] * 5009
for i in range(N):
    D[i] = table[i][0]
    C[i] = table[i][1]
    S[i] = table[i][2]

dp = [[0] * 5009 for _ in range(5009)]

for i in range(N):
    for j in range(5000):
        dp[i + 1][j] = max(dp[i + 1][j], dp[i][j])
        if j + C[i] <= D[i]:
            dp[i + 1][j + C[i]] = max(
                dp[i + 1][j + C[i]], dp[i][j] + S[i]
            )   

ans = 0
for j in range(5009):
    ans = max(ans, dp[N][j])

print(ans)
