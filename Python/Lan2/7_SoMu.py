t = int(input())

for _ in range(t):
    x = -1
    a, b, M = map(int, input().split())
    for i in range(M):
        if pow(a, i, M) == b:
            x = i
            break
    print(x)
