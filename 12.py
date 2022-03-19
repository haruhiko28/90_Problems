class Union_find:
    
    def __init__(self, N):
        self.par = [-1] * (N+1)
        self.siz = [1] * (N+1)

    # 値を再帰的に探索して返す
    def root(self, x):
        if self.par[x] == -1:
            # root
            return x

        else:
            self.par[x] = self.root(self.par[x])
            return self.par[x]
        
    # 根が同じか
    def issame(self, x, y):
        return self.root(x) == self.root(y)

    # 根が同じかどうかを確認して、同じならば1つにまとめる
    def unite(self, x, y):
        x = self.root(x)
        y = self.root(y)

        if x == y:
            return False
        
        else:
            if self.siz[x] < self.siz[y]:
                x, y = y, x
            
            self.par[y] = x
            self.siz[x] += self.siz[y]

            return True


    def get_size(self, x):
        return self.siz[self.root(x)]

H, W = map(int,input().split())
Q = int(input())
G = Union_find(H*W+1)
M = [-1] * (H*W+1)

def check(n, x):
    if M[x] == 1 and M[n] == 1:
        G.unite(n, x)
    return

for i in range(Q):
    A = list(map(int,input().split()))
    if A[0] == 1:
        n = W * (A[1] - 1) + (A[2] - 1)
        # 指定されたセルを赤色にする
        M[n] = 1

        if n - W >= 0:
            check(n, n - W) # 上のセルが赤色だったら繋ぐ
        if n + W < H*W:
            check(n, n + W) # 下のセルが赤色だったら繋ぐ
        if n % W != 0 and n - 1 >= 0:
            check(n, n - 1) # 左のセルが赤色だったら繋ぐ
        if (n + 1) % W != 0 and n + 1 < H*W:
            check(n, n + 1) # 右のセルが赤色だったら繋ぐ

    else:   
        n1 = W * (A[1] - 1) + (A[2] - 1)
        n2 = W * (A[3] - 1) + (A[4] - 1)

        if G.issame(n1, n2) and M[n1] == 1 and M[n2] == 1: # 同じ根であり、双方が赤色だったら
            print("Yes")

        else:
            print("No")