class GiaoVien:
    ma = ""
    ten = ""
    mon = ""
    tong_diem = ""
    status = ""

    def __init__(self, ma: str, ten: str, ma_xt: str, tin: float, diem_cm: float):
        self.ma = ma
        self.ten = ten.strip()

        # Tim chuyen nganh va tong diem
        ma_mon = ma_xt[0]
        if ma_mon == "A":
            self.mon = "TOAN"
        elif ma_mon == "B":
            self.mon = "LY"
        else:
            self.mon = "HOA"

        ma_cong = int(ma_xt[1])
        diem_cong = 0
        if ma_cong == 1:
            diem_cong = 2
        elif ma_cong == 2:
            diem_cong = 1.5
        elif ma_cong == 3:
            diem_cong = 1
        self.tong_diem = tin * 2 + diem_cm + diem_cong

        # Xac dinh trung tuyen
        if self.tong_diem >= 18:
            self.status = "TRUNG TUYEN"
        else:
            self.status = "LOAI"

    def to_string(self):
        print(f"{self.ma} {self.ten} {self.mon} {self.tong_diem:.1f} {self.status}")


t = int(input())
a = []
for i in range(t):
    a.append(GiaoVien(f"GV{i+1:02d}", input(), input(), float(input()), float(input())))

a = sorted(a, key=lambda x: -x.tong_diem)

for i in a:
    i.to_string()
