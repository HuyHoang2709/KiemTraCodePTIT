t = int(input())

for _ in range(t):
    n, x = map(int, input().split())
    a = list(map(int, input().split()))
    for i in range(x, n):
        print(a[i], end=' ')
    for i in range(x):
        print(a[i], end=' ')
    print()