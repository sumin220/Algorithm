import sys

input = sys.stdin.readline

N = int(input())

fibonacci = [0]*(N+1)
fibonacci[1] = 1

for i in range(2, len(fibonacci)):
    fibonacci[i] = fibonacci[i-1] + fibonacci[i-2]

print(fibonacci[N])