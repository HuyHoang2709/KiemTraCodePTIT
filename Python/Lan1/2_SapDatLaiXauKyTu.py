t = int(input())

for i in range(t):
    s1 = input()
    s2 = input()
    ok = True
    for j in s2:
        if s2.count(j) != s1.count(j):
            ok = False
            break
    res = "YES" if ok else "NO"
    print(f"Test {i+1}: {res}")