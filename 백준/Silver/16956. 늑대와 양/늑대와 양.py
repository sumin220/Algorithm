R, C = map(int, input().split())
field = [list(input()) for _ in range(R)]
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

valid = True
for i in range(R):
    for j in range(C):
        if field[i][j] == 'S':
            for d in range(4):
                ni = i + dx[d]
                nj = j + dy[d]
                if 0 <= ni < R and 0 <= nj < C:
                    if field[ni][nj] == 'W':
                        valid = False
                    elif field[ni][nj] == '.':
                        field[ni][nj] = 'D'

if not valid:
    print(0)
else:
    print(1)
    for row in field:
        print(''.join(row))