import math
import sys

input = sys.stdin.readline

N, M = map(int, input().split())


is_prime=[True] * (M+1)
is_prime[0] = is_prime[1] = False

for i in range(2, int(math.sqrt(M))+1):
    if is_prime[i]:
        for j in range(i*i, M+1, i):
            is_prime[j]=False

prime_list = [i for i in range(N, len(is_prime)) if is_prime[i]]

for i in prime_list:
    print(i)