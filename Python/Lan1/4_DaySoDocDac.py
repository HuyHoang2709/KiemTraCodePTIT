t = int(input())


for i in range(t):
    n = int(input())
    s = input()
    r = s[::-1]
    
    print("YES" if s != r else "NO")