import sys
input = sys.stdin.readline

N = int(input())
numbers = list(map(int, input().split()))

def solution(numbers):
    answer = [-1]*N
    stack = []

    for i in range(N):
        while stack and numbers[stack[-1]]< numbers[i]:
            answer[stack.pop()] = numbers[i]

        stack.append(i)



    return answer

print(*solution(numbers))