f1 = open("DATA1.in", "r")
f2 = open("DATA2.in", "r")

l1 = f1.readlines()
l2 = f2.readlines()

s1 = ""
s2 = ""
for l in l1:
    l = l.lower().replace('\n', ' ')
    s1 += l
for l in l2:
    l = l.lower().replace('\n', ' ')
    s2 += l

a1 = sorted(s1.split())
a2 = sorted(s2.split())

tmp = []
for i in a1:
    if (i not in tmp) and (i not in a2):
        print(i, end=' ')
        tmp.append(i)
print('\n', end='')

tmp.clear()
for i in a2:
    if (i not in tmp) and (i not in a1):
        print(i, end=' ')
        tmp.append(i)
print('\n', end='')