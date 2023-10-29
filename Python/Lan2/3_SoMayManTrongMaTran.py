m, n = map(int, input().split())

a = []
b = []

for i in range(m):
    tmp = list(map(int, input().split()))
    a.append(tmp)
    b.extend(tmp)

hieu = max(b) - min(b)
res = []
for i in range(m):
    for j in range(n):
        if a[i][j] == hieu:
            res.append(f"Vi tri [{i}][{j}]")

if len(res) > 0:
    print(hieu)
    for i in res:
        print(i)
else:
    print("NOT FOUND")
