H,W = map(int, input().split())
l = [[int(i) for i in input().split()] for j in range(H)]
 
yoko = list(map(sum, l))
tate = list(map(sum, zip(*l)))
 
for i in range(H):
    print(" ".join(map(lambda j : str(yoko[i] + tate[j] - l[i][j]), range(W))))