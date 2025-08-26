import sys
input = sys.stdin.readline

N = int(input())
top_list = list(map(int, input().split()))

stack = []
answer = []

for i in range(N):
    current_height = top_list[i]

    while stack and stack[-1][1] < current_height:
        stack.pop()

    if not stack:
        answer.append(0)
    else:
        answer.append(stack[-1][0])

    stack.append((i+1, current_height))

print(*answer)