import sys

def solve():
    r1, c1, r2, c2 = map(int, sys.stdin.readline().split())

    grid = [[0] * (c2 - c1 + 1) for _ in range(r2 - r1 + 1)]
    
    max_val = 0

    def get_value(r, c):
        k = max(abs(r), abs(c))
        max_val_in_k_shell = (2 * k + 1) ** 2

        if r == k: 
            return max_val_in_k_shell - (k - c)
        elif c == -k: 
            return max_val_in_k_shell - (2 * k) - (k - r)
        elif r == -k: 
            return max_val_in_k_shell - (4 * k) - (c + k)
        elif c == k: 
            return max_val_in_k_shell - (6 * k) - (r + k)
        return 0


    for r_idx in range(r2 - r1 + 1):
        for c_idx in range(c2 - c1 + 1):
            r = r1 + r_idx
            c = c1 + c_idx
            val = get_value(r, c)
            grid[r_idx][c_idx] = val
            if val > max_val:
                max_val = val

    max_len = len(str(max_val))

    for row in grid:
        formatted_row = []
        for val in row:
            formatted_row.append(str(val).rjust(max_len))
        sys.stdout.write(" ".join(formatted_row) + "\n")

solve()