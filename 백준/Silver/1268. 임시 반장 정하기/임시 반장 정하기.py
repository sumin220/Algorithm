n = int(input())
students = [list(map(int, input().split())) for _ in range(n)]
counts = [0] * n

for i in range(n):
    for j in range(n):
        if i == j:
            continue
        for k in range(5):
            if students[i][k] == students[j][k]:
                counts[i] += 1
                break

print(counts.index(max(counts)) + 1)