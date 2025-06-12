import sys
input = sys.stdin.readline

N = int(input())
arr = list(map(int, input().split()))

prefix_sum = [0] * (N + 1)
for i in range(N):
    prefix_sum[i + 1] = prefix_sum[i] + arr[i]

M = int(input())

for i in range(M):
    a, b = map(int, input().split())
    result = prefix_sum[b] - prefix_sum[a - 1]
    print(result)
