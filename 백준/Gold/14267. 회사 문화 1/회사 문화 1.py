import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

n, m = map(int, input().split())
parent = list(map(int, input().split()))
tree = [[] for _ in range(n + 1)]
praise = [0] * (n + 1)

for i in range(2, n + 1):
    tree[parent[i - 1]].append(i)

for _ in range(m):
    i, w = map(int, input().split())
    praise[i] += w

def dfs(node):
    for child in tree[node]:
        praise[child] += praise[node]
        dfs(child)

dfs(1)
print(' '.join(map(str, praise[1:])))