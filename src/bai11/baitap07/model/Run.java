package bai11.baitap07.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Run {
    public static void main(String[] args) {
//        Danh sách xe hơi
        List<XeHoi> xeHoiList = new ArrayList<>();

        BanhXe banhXe1 = new BanhXe("Pirelli", 4.6);
        BanhXe banhXe2 = new BanhXe("Michelin", 5);
        BanhXe banhXe3 = new BanhXe("Bridgestone", 5.6);
        BanhXe banhXe4 = new BanhXe("Goodyear", 6);

        DongCo dongCoXang = new DongCo("Dong Cơ Xăng", 400);
        DongCo dongCoDien = new DongCo("Dong Cơ Điện", 200);

        XeHoi xeHoi1 = new XeHoi(123, "Xe hoi Vinfast", 10, 5000, dongCoDien);
        for (int i = 0; i < 4; i++) {
            xeHoi1.addBanhXe(banhXe1);
        }

        XeHoi xeHoi2 = new XeHoi(234, "Xe hoi Toyota", 10, 700, dongCoDien);
        for (int i = 0; i < 4; i++) {
            xeHoi2.addBanhXe(banhXe2);
        }
        XeHoi xeHoi3 = new XeHoi(456, "Xe hoi Huyndai", 10, 2000, dongCoXang);
        for (int i = 0; i < 4; i++) {
            xeHoi3.addBanhXe(banhXe3);
        }

        XeHoi xeHoi4 = new XeHoi(789, "Xe hoi Porcher", 10, 1000, dongCoDien);
        for (int i = 0; i < 4; i++) {
            xeHoi4.addBanhXe(banhXe4);
        }

        xeHoiList.add(xeHoi1);
        xeHoiList.add(xeHoi2);
        xeHoiList.add(xeHoi3);
        xeHoiList.add(xeHoi4);

//        Danh sách laptop
        List<Laptop> listLapTop = new ArrayList<>();
        listLapTop.add(new Laptop(356, "CPU USA", 7, 700, 256, "Intel Pentium"));
        listLapTop.add(new Laptop(356, "CPU USA", 7, 700, 180, "Intel Pentium"));
        listLapTop.add(new Laptop(356, "CPU USA", 7, 700, 580, "Intel Pentium"));
        listLapTop.add(new Laptop(356, "CPU USA", 7, 700, 100, "Intel Pentium"));

//        Hai đối tượng kiểu SinhVien
        LopHoc lop1 = new LopHoc("CNTT");
        LopHoc lop2 = new LopHoc("CNOTO");
        SinhVien sinhVien1 = new SinhVien("Nguyễn Văn Sơn", lop1);
        SinhVien sinhVien2 = new SinhVien("Nguyễn Văn Lới", lop2);

        HoaDon hoaDon1 = new HoaDon(235, sinhVien1);
        HoaDon hoaDon2 = new HoaDon(100, sinhVien2);

        SanPham sp1 = new SanPham(123, "Xe đạp", 8, 9000);
        SanPham sp2 = new SanPham(123, "Xe máy", 8, 1000);
        SanPham sp3 = new SanPham(123, "Xe oto", 8, 300000);
        SanPham sp4 = new SanPham(123, "Xe điện", 8, 10000);
        SanPham sp5 = new SanPham(123, "Xe địa hình", 8, 23000);

        hoaDon1.addSanPham(sp1);
        hoaDon1.addSanPham(sp2);
        hoaDon1.addSanPham(sp3);
        hoaDon1.addSanPham(sp4);
        hoaDon1.addSanPham(sp5);

        hoaDon2.addSanPham(sp1);
        hoaDon2.addSanPham(sp2);
        hoaDon2.addSanPham(sp3);
        hoaDon2.addSanPham(sp4);
        hoaDon2.addSanPham(sp5);

        sinhVien1.addHoaDon(hoaDon1);
        sinhVien2.addHoaDon(hoaDon2);

//      Sắp xếp danh sách List<XeHoi> theo giá xe thứ tự tăng dần
        Collections.sort(xeHoiList, new Comparator<XeHoi>() {
            @Override
            public int compare(XeHoi o1, XeHoi o2) {
                return Double.compare(o1.getGiaCa(), o2.getGiaCa());
            }
        });

        System.out.println("Sắp xếp danh sách xe hơi theo giá xe tăng dần: ");
        for (XeHoi xeHoi : xeHoiList) {
            System.out.println(xeHoi);
        }

//      Sắp xếp List<Laptop> theo Ram có dung lượng tăng dần
        Collections.sort(listLapTop, new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                return Integer.compare(o1.getRam(), o2.getRam());
            }
        });

        System.out.println("------------------");
        System.out.println("Sắp xếp danh sách Ram theo dung lượng tang dần: ");
        for (Laptop laptop : listLapTop) {
            System.out.println(laptop);
        }

//       Tìm kiếm sản phẩm có giá cao nhất trong từng Hoá đơn của từng Sinh Viên
        SanPham sanPham1Max = Collections.max(hoaDon1.getDssp(), new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o1.getGiaCa(), o2.getGiaCa());
            }
        });

        System.out.println("------------------");
        System.out.println("Sản phẩm có giá cao nhất của " + sinhVien1 + " là: ");
        System.out.println(sanPham1Max);

        SanPham sanPham2Max = Collections.max(hoaDon2.getDssp(), new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o1.getGiaCa(), o2.getGiaCa());
            }
        });

        System.out.println("------------------");
        System.out.println("Sản phẩm có giá cao nhất của " + sinhVien2 + " là: ");
        System.out.println(sanPham2Max);

//      Liệt kê các Sản phẩm của từng hoá đơn theo điều kiện thanhtien >=1000 và soluon <=5

        List<SanPham> locSanPham = hoaDon1.getDssp().stream()
                .filter(sanPham -> sanPham.getGiaCa() >= 1000)
                .filter(sanPham -> sanPham.getSoLuong() <= 10)
                .collect(Collectors.toList());

        System.out.println("------------------");
        System.out.println("Lọc sản phẩm của hoaDon1: ");
        if (locSanPham.size() <= 0) {
            System.out.println("Khong co san pham nao theo bo loc!");
        } else {
            System.out.println(locSanPham);
        }


//      Liệt kê các Sản phẩm của từng hoá đơn theo điều kiện tên sản phẩm bắt đầu bằng ký tự "S"
        List<SanPham> sanPhamTheoDieuKien = hoaDon1.getDssp().stream()
                .filter(sanPham -> sanPham.getTenSanPham().charAt(0) == 'S')
                .collect(Collectors.toList());

        System.out.println("-------------------------");
        System.out.println("Danh sách sinh viên của hoaDon1 theo điều kiện tên sản phẩm bắt đầu ký tự S: ");
        if (sanPhamTheoDieuKien.size() <= 0) {
            System.out.println("Khong co san pham nao theo bo loc!");
        }else {
            System.out.println(sanPhamTheoDieuKien);
        }
    }
}