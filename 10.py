val_list = []

N = int(input())
for i in range(N):
    C,P = map(int, input().split())
    if i == 0:
        if C==1:
            val_list.append([P,0])
        else:
            val_list.append([0,P])
    else:
        if C==1:
            val_list.append([P+val_list[i-1][0],val_list[i-1][1]])
        else:
            val_list.append([val_list[i-1][0],P+val_list[i-1][1]])

Q = int(input())
for i in range(Q):
    L,R = map(int, input().split())
    ans1 = val_list[R-1][0]
    ans2 = val_list[R-1][1]
    if L>1:
        ans1 -= val_list[L-2][0]
        ans2 -= val_list[L-2][1]
    print(ans1, ans2)