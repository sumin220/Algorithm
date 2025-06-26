import sys
from collections import deque

input = sys.stdin.readline

n, m = map(int, input().split())
graph = [[] for _ in range(n + 1)]

for _ in range(n - 1):
    a, b, dist = map(int, input().split())
    graph[a].append((b, dist))
    graph[b].append((a, dist))

def bfs(start, end):
    visited = [False] * (n + 1)
    distance = [0] * (n + 1)
    queue = deque()
    queue.append(start)
    visited[start] = True

    while queue:
        now = queue.popleft()
        if now == end:
            return distance[end]

        for next_node, cost in graph[now]:
            if not visited[next_node]:
                visited[next_node] = True
                distance[next_node] = distance[now] + cost
                queue.append(next_node)

for _ in range(m):
    x, y = map(int, input().split())
    print(bfs(x, y))