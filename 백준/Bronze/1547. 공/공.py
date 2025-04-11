import sys
input = sys.stdin.readline

ball = 1

cup = {}

for i in range(int(input())):
    x, y = map(int, input().split())

    if x == ball:
        ball = y
    elif y == ball:
        ball = x

print(ball)