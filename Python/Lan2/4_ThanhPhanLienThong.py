n, m, a = map(int, input().split())
ke = [[] for i in range(n + 1)]
visited = []

for i in range(m):
    x, y = map(int, input().split())
    ke[x].append(y)
    ke[y].append(x)


def DFS(u):
    visited.append(u)
    for v in ke[u]:
        if v not in visited:
            DFS(v)


DFS(a)
if len(visited) == n:
    print(0)
else:
    for i in range(1, n + 1):
        if i not in visited:
            print(i)
