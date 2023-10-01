n = int(input())

a = []
for i in range(0, n):
    a.append(i*i)

dem = 0
for i in range(n-1):
    for j in range(1, n):
        if (a[i] + a[j]) in a:
            dem += 1

print(dem)