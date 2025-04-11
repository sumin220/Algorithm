import sys
input = sys.stdin.readline

size, m = map(int, input().split())

arr = []
list = {}

for i in range(size):
    name = input().strip()
    arr.append(name)
    list[name] = i+1

for i in range(m):
    query = input().strip()
    if query.isdigit():
        print(arr[int(query) - 1])
    else:
        print(list[query])