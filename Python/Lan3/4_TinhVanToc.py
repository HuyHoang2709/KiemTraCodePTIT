from datetime import datetime

S = 120
start_time = datetime.strptime("6:00", "%H:%M")


class CuaRo:
    ma = ""
    ten = ""
    don_vi = ""
    v = ""

    def __init__(self, ten: str, don_vi: str, time: str) -> None:
        self.ten = ten.strip()
        self.don_vi = don_vi.strip()

        # Tim ma
        tmp = don_vi.split()
        tmp.extend(ten.split())
        for i in tmp:
            self.ma += i[0]

        # Tinh van toc
        end_time = datetime.strptime(time, "%H:%M")
        delta_time = (end_time - start_time).total_seconds()
        hours = delta_time / 3600
        self.v = S / hours

    def to_string(self):
        print(f"{self.ma} {self.ten} {self.don_vi} {self.v:.0f} Km/h")


t = int(input())
a = []
for _ in range(t):
    a.append(CuaRo(input(), input(), input()))

a = sorted(a, key=lambda x: -x.v)

for i in a:
    i.to_string()
