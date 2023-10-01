tmp = [2, 3, 5, 7]

n = int(input())
x = 4
a = [0] * n

def check():
    return (2 in a) and (3 in a) and (5 in a) and (7 in a) and a[x-1] != 2

def _in():
    if check():
        for i in range(x):
            print(a[i], end='')
        print('\n', end='')

def _try(i):
    for j in range(4):
        a[i] = tmp[j]
        if i == x-1:
            _in()
        else:
            _try(i+1)

while x <= n:
    _try(0)
    x += 1
