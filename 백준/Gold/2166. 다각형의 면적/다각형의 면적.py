import sys

n = int(sys.stdin.readline())
points = []
for _ in range(n):
    points.append(list(map(int, sys.stdin.readline().split())))

total = 0
for i in range(n):
    x1, y1 = points[i]
    x2, y2 = points[(i + 1) % n]
    total += (x1 * y2) - (x2 * y1)

area = abs(total) / 2.0
print(f"{area:.1f}")
