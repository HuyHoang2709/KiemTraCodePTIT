t = int(input())

for i in range(t):
    n, p = map(int, input().split())
    dem = 0
    for j in range(1, n+1):
        tmp = j
        while tmp % p == 0:
            dem += 1
            tmp /= p
    print(dem)