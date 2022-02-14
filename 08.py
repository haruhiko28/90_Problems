N = int(input())
S = input()
T = "atcoder"

mod = 10**9 + 7

# dp[a][b] : Sがa文字目の時、atcoderのb文字目までの選び方
dp = [[0 for _ in range(N + 1)] for _ in range(len(T) + 1)]
for k in range(N+1):
    dp[0][k] = 1

for i in range(N):
    for j in range(len(T)):
        if S[i] == T[j]:
            dp[j+1][i+1] = (dp[j][i+1] + dp[j+1][i]) % mod
        else:
            dp[j+1][i+1] = dp[j+1][i]
print(dp[len(T)][N])