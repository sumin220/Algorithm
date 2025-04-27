def length_of_lis(sequence):
    n = len(sequence)
    dp = [1] * n
    for i in range(n):
        for j in range(i):
            if sequence[j] < sequence[i]:
                dp[i] = max(dp[i], dp[j] + 1)
    return max(dp) if dp else 0

N = int(input())
A = list(map(int, input().split()))
print(length_of_lis(A))
