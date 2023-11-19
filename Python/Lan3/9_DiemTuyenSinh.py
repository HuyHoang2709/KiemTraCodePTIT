class ThiSinh:
    ma = ""
    ho_ten = ""
    tong_diem = 0
    status = ""

    def __init__(self, ma, ten: str, diem_thi, dan_toc, khu_vuc: int) -> None:
        self.ma = ma

        # Chuan hoa ho ten
        ten = ten.strip().lower().split()
        for i in ten:
            self.ho_ten += i[0].upper() + i[1:] + " "
        self.ho_ten = self.ho_ten.strip()

        # Tinh tong diem
        diem_cong = 0
        if khu_vuc == 1:
            diem_cong += 1.5
        elif khu_vuc == 2:
            diem_cong += 1

        if dan_toc != "Kinh":
            diem_cong += 1.5
        self.tong_diem = diem_thi + diem_cong

        # Xet diem:
        if self.tong_diem >= 20.5:
            self.status = "Do"
        else:
            self.status = "Truot"

    def to_string(self):
        print(f"{self.ma} {self.ho_ten} {self.tong_diem:.1f} {self.status}")


t = int(input())
a = []
for i in range(t):
    ma = "TS{:02d}".format(i + 1)
    ts = ThiSinh(ma, input(), float(input()), input(), int(input()))
    a.append(ts)

a = sorted(a, key=lambda x: (-x.tong_diem, x.ma))

for i in a:
    i.to_string()
