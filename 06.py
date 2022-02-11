def calc_next(S):
    N = len(S)

    res = [[N] * 26 for _ in range(N+1)]

    # 後ろから
    for i in range(N-1,-1,-1):
        # i+1文字目の結果を一旦i文字目にコピー
        for j in range(26):
            res[i][j] = res[i+1][j]
        
        res[i][ord(S[i])-ord('a')] = i
    
    return res

N, K = map(int, input().split())
S = input()

res = ""
nex = calc_next(S)

j = -1
for i in range(K):
    for ordc in range(26):
        k = nex[j+1][ordc]

        # Sの残り文字数 > Kの残り文字数
        if N - k >= K - i:
            res += chr(ordc + ord('a'))
            j = k
            break
print(res)