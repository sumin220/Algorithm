import sys
input = sys.stdin.readline

count_list = [0] * 10001

N = int(input())

for _ in range(N):
    num = int(input())
    count_list[num] += 1

for i in range(1, 10001):
    if count_list[i] > 0:
        for j in range(count_list[i]):
            print(i)