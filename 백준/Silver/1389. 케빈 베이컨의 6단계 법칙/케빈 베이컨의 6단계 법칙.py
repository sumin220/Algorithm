from collections import deque
import sys

input = sys.stdin.readline

def bfs(graph, start, n):
    distances = [-1] * (n + 1)
    distances[start] = 0
    queue = deque([start])
    
    while queue:
        node = queue.popleft()
        for neighbor in graph[node]:
            if distances[neighbor] == -1:
                distances[neighbor] = distances[node] + 1
                queue.append(neighbor)
    
    return sum(distances[1:n+1])

n, m = map(int, input().split())
graph = [[] for _ in range(n + 1)]

for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

min_bacon = float('inf')
min_person = 0

for i in range(1, n + 1):
    bacon = bfs(graph, i, n)
    if bacon < min_bacon:
        min_bacon = bacon
        min_person = i

print(min_person)
