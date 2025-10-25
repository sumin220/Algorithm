import sys
input = sys.stdin.readline


left_stack = list(map(str, input().strip()))
M = int(input())
right_stack = []

for _ in range(M):

    command = input().split()

    if command[0] == 'L':
        if left_stack:
            right_stack.append(left_stack.pop())

    if command[0] == 'D':
        if right_stack:
            left_stack.append(right_stack.pop())

    if command[0] == 'B':
        if left_stack:
            left_stack.pop()

    if command[0] == 'P':
        left_stack.append(command[1])

right_stack.reverse()
result = left_stack + right_stack
print("".join(result))
