T = int(input())
for _ in range(T):
    s = input()
    stack = []
    is_vps = True
    for char in s:
        if char == '(':
            stack.append(char)
        else:
            if not stack:
                is_vps = False
                break
            stack.pop()
    if stack:
        is_vps = False
    print("YES" if is_vps else "NO")