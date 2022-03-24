from collections import defaultdict
import heapq
from operator import ne

def dijkstra(start):
    distances = [INF] * N
    distances[start] = 0
    h = []
    heapq.heappush(h, (0, start))
    while len(h) > 0:
        distance, pos = heapq.heappop(h)  # 最短距離の頂点
        for next_, cost in adj[pos]:   # 隣接候補
            next_distance = distance + cost
            if next_distance < distances[next_]:
                distances[next_] = next_distance   # 最短距離を更新
                heapq.heappush(h, (next_distance, next_))   # 最短距離をヒープキューで管理
    return distances

N, M = map(int, input().split())
S = [list(map(int, input().split())) for _ in range(M)]

adj = defaultdict(list)
for a, b, c in S:
    adj[a-1].append((b-1, c))
    adj[b-1].append((a-1, c))

INF = float('inf')
d1 = dijkstra(0)    # 街1から各街への距離
d2 = dijkstra(N-1)  # 街Nから各街への距離

for k in range(N):
    print(d1[k] + d2[k])