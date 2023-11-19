def Merge(a, l, m, r):
    n1 = m - l + 1
    n2 = r - m
    L = [0] * n1
    R = [0] * n2
    for i in range(n1):
        L[i] = a[l + i]
    for i in range(n2):
        R[i] = a[m + i + 1]
    kq = 0
    i = j = 0
    k = l
    while i < n1 and j < n2:
        if L[i] <= R[j]:
            a[k] = L[i]
            i += 1
        else:
            kq += n1 - i
            a[k] = R[j]
            j += 1
        k += 1
    while i < n1:
        a[k] = L[i]
        i += 1
        k += 1
    while j < n2:
        a[k] = R[j]
        j += 1
        k += 1
    return kq


def InversionCount(a, l, r):
    kq = 0
    if l < r:
        m = (l + r) // 2
        kq += InversionCount(a, l, m)
        kq += InversionCount(a, m + 1, r)
        kq += Merge(a, l, m, r)
    return kq


n = int(input())
a = list(map(int, input().split()))
print(InversionCount(a, 0, n - 1))
