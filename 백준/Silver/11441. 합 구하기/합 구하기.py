import sys
input = sys.stdin.readline

N = int(input())
arr = [0] * (N+1)
arr = list(map(int, input().split()))

M= int(input())

prefix_sum = [0]*(N+1)
for i in range(N):
    prefix_sum[i+1] = prefix_sum[i]+arr[i]
for j in range(M):
    a, b = map(int, input().split())

    print(prefix_sum[b] - prefix_sum[a-1])
