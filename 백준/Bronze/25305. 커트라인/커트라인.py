import sys
input = sys.stdin.readline

N, k = map(int, input().split())
arr = list(map(int, input().split()))

arr.sort()
print(arr[len(arr)-k])