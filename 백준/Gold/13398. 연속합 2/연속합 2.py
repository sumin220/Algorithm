n = int(input())
arr = list(map(int, input().split()))

dp_keep = [0] * n
dp_remove = [0] * n

dp_keep[0] = arr[0]
dp_remove[0] = arr[0]
answer = arr[0]

for i in range(1, n):
    dp_keep[i] = max(dp_keep[i - 1] + arr[i], arr[i])
    dp_remove[i] = max(dp_remove[i - 1] + arr[i], dp_keep[i - 1])
    answer = max(answer, dp_keep[i], dp_remove[i])

print(answer)