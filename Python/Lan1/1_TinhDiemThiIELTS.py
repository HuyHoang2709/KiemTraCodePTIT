import math

t = int(input())

def quy_doi(diem):
    if diem <= 4: return 2.5
    elif diem <= 6: return 3.0
    elif diem <= 9: return 3.5
    elif diem <= 12: return 4.0
    elif diem <= 15: return 4.5
    elif diem <= 19: return 5.0
    elif diem <= 22: return 5.5
    elif diem <= 26: return 6.0
    elif diem <= 29: return 6.5
    elif diem <= 32: return 7.0
    elif diem <= 34: return 7.5
    elif diem <= 36: return 8.0
    elif diem <= 38: return 8.5
    else: return 9.0


def lam_tron(tb):
    n = math.floor(tb)
    tp = tb - n
    if tp < 0.25:
        tp = 0
    elif tp < 0.75:
        tp = 0.5
    else:
        tp = 0.0
        n += 1
    return n + tp   


for i in range(t):
    rd, lt, sp, wr = map(float, input().split())
    rd = quy_doi(rd)
    lt = quy_doi(lt)
    tb = (rd + lt + sp + wr) / 4
    print(f"{lam_tron(tb):.1f}")