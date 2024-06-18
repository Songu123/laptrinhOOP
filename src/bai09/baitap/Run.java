package bai09.baitap;

public class Run {
    public static void main(String[] args) {
        DongCo dongCo = new DongCo("123", 2.5);
        BanhXe bx = new BanhXe("123", 4.5);
        XeHoi xeHoi = new XeHoi(123, "vinfast", dongCo);
        for (int i = 0; i < 4; i++) {
            xeHoi.addBanhXe(bx);
        }
        xeHoi.addBanhXe(bx);
        SanPham sanPham = new SanPham(1244, "Xe hoi");
        HoaDon hoaDon = new HoaDon(912839);
        hoaDon.addSanPham(sanPham);


        LopHoc lopHoc = new LopHoc("CNTT");
        SinhVien sinhVien = new SinhVien("Nguyeenx van sonw", lopHoc);
        sinhVien.addHoaDon(hoaDon);
        SinhVien sinhVien1 = new SinhVien("Nguyeenx van son", lopHoc);
        sinhVien1.addHoaDon(hoaDon);
//        lopHoc.addSinhVien(sinhVien);

        System.out.println(sinhVien);
    }


}
