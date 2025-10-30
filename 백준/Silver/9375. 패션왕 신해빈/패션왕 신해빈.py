import sys
input = sys.stdin.readline

n = int(input())

for _ in range(n):
    m = int(input())
    clothes = {}

    for _ in range(m):
        value, key = input().split()

        if key in clothes:
            clothes[key] += 1
        else:
            clothes[key] = 1

    result = 1
    for op in clothes.values():
        result *= op+1

    print(result-1)

