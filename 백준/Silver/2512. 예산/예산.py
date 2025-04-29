import sys
input = sys.stdin.readline

N = int(input())
arr = list(map(int, input().split()))
M = int(input())
arr.sort()


start, end = 0, arr[-1]

while start<=end:
    result = 0
    mid = (start+end)//2
    for i in arr:
        if i <= mid:
            result += i
        else:
            result += mid
    if result <= M:
        start = mid+1
    else:
        end = mid-1

print(end)